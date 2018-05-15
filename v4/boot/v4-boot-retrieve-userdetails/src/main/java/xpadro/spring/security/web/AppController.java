package xpadro.spring.security.web;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class AppController {

    @GetMapping("/user1")
    public @ResponseBody String getUserDetails1() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return sayHello(user);
    }

    @GetMapping("/user2")
    public @ResponseBody String getUserDetails2(Authentication authentication) {
        User user = (User) authentication.getPrincipal();

        return sayHello(user);
    }

    @GetMapping("/user3")
    public @ResponseBody String getUserDetails3(Principal principal) {
        User user = (User) ((UsernamePasswordAuthenticationToken) principal).getPrincipal();

        return sayHello(user);
    }

    @GetMapping("/user4")
    public @ResponseBody String getUserDetails4(@AuthenticationPrincipal User user) {
        return sayHello(user);
    }

    private String sayHello(User user) {
        String msg = "Hello %s!";

        if (user.getAuthorities().stream().anyMatch(auth -> "ROLE_ADMIN".equals(auth.getAuthority()))) {
            msg = "Hello administrator %s!";
        }

        return String.format(msg, user.getUsername());
    }
}
