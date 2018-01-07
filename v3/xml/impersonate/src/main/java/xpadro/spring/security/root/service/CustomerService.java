package xpadro.spring.security.root.service;

import org.springframework.security.access.annotation.Secured;

public interface CustomerService {

    @Secured("ROLE_ADMIN")
    String sendOrder(String productId);

    @Secured({"ROLE_USER", "RUN_AS_ADMIN"})
    String buy(String productId);
}
