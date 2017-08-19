package xpadro.spring.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xpadro.spring.security.root.service.CustomerService;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

@Controller
public class AppController {
    private static final String RESPONSE = "%s | %s";
    private final CustomerService customerService;

    @Autowired
    public AppController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public @ResponseBody String send(Authentication authentication) {
        return String.format(RESPONSE, customerService.sendOrder("1"), getAuthorities(authentication));
    }

    @RequestMapping(value = "/buy", method = RequestMethod.GET)
    public @ResponseBody String buy(Authentication authentication) {
        return String.format(RESPONSE, customerService.buy("1"), getAuthorities(authentication));
    }

    private String getAuthorities(Authentication authentication) {
        return authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(joining(", "));
    }
}
