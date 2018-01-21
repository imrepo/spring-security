package xpadro.spring.security.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.sql.SQLException;

@ComponentScan(basePackages = "xpadro.spring.security.web")
public class ServletConfig {

    /**
     * Available at localhost:8082
     * URL: jdbc:h2:mem:testDB
     */
    @Bean
    public Server h2ConsoleServer() throws SQLException {
        return Server.createWebServer("-web", "-webAllowOthers").start();
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
