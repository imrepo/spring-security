package xpadro.spring.security.service;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public String userMethod() {
        return "service user method";
    }

    @Override
    public String adminMethod() {
        return "service admin method";
    }
}
