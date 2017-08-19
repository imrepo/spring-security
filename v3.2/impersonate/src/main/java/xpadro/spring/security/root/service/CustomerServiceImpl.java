package xpadro.spring.security.root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final WarehouseService warehouseService;

    @Autowired
    public CustomerServiceImpl(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @Override
    public String buy(String productId) {
        // Buy product business logic

        return sendOrder(productId);
    }

    @Override
    public String sendOrder(String productId) {
        return warehouseService.sendOrder(productId);
    }
}
