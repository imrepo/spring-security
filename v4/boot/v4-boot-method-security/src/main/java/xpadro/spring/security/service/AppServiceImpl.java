package xpadro.spring.security.service;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    public String userMethod() {
        return "service user method";
    }

    public String adminMethod() {
        return "service admin method";
    }
}
