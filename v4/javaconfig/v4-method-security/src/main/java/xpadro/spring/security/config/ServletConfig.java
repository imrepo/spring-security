package xpadro.spring.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@ComponentScan(basePackages = "xpadro.spring.security.web")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ServletConfig {
}
