package xpadro.spring.security.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface AppService {

    @PreAuthorize("hasRole('USER')")
    String userMethod();

    @PreAuthorize("hasRole('ADMIN')")
    String adminMethod();
}
