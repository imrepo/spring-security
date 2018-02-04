package xpadro.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(buildUser());
        userDetailsManager.createUser(buildAdminUser());

        return userDetailsManager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/favicon.ico").hasRole("ANONYMOUS")
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin().and()
                .httpBasic();
    }

    private UserDetails buildAdminUser() {
        return User.withUsername("admin").password("root").roles("USER", "ADMIN").build();
    }

    private UserDetails buildUser() {
        return User.withUsername("user").password("user").roles("USER").build();
    }
}
