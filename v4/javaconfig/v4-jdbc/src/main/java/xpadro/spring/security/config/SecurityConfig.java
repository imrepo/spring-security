package xpadro.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/favicon.ico").hasRole("ANONYMOUS")
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/j_spring_security_check")
                .loginPage("/login")
                .defaultSuccessUrl("/home")
                .usernameParameter("j_username")
                .passwordParameter("j_password")
                .failureUrl("/login?error")
                .and()
                .httpBasic()
                .and()
                .rememberMe().key("test_remember").tokenRepository(persistentTokenRepository())
                .and()
                .logout().logoutSuccessUrl("/login?logout").logoutUrl("/logout")
                .and()
                .csrf();

        http.headers().frameOptions().disable();
    }

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();

        return builder
                .setType(EmbeddedDatabaseType.H2)
                .setName("testDB")
                .addScripts("classpath:user-schema.sql", "classpath:user-data.sql", "classpath:rememberme-schema.sql")
                .build();
    }

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcDao = new JdbcDaoImpl();
        jdbcDao.setDataSource(dataSource());

        return jdbcDao;
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl repository = new JdbcTokenRepositoryImpl();
        repository.setDataSource(dataSource());

        return repository;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
