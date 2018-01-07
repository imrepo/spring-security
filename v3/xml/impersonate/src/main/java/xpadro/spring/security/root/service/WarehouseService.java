package xpadro.spring.security.root.service;

import org.springframework.security.access.annotation.Secured;

@Secured({"ROLE_ADMIN", "ROLE_RUN_AS_ADMIN"})
public interface WarehouseService {

    String sendOrder(String productId);
}
