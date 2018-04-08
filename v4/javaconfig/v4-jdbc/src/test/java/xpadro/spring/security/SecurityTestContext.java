package xpadro.spring.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import xpadro.spring.security.config.ServletConfig;

@ComponentScan(basePackages = "xpadro.spring.security")
@Import(ServletConfig.class)
class SecurityTestContext {

}
