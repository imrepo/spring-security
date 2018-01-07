package xpadro.spring.security.root.service;

import org.springframework.stereotype.Service;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Override
    public String sendOrder(String productId) {
        return String.format("Sending order %s to warehouse", productId);
    }
}
