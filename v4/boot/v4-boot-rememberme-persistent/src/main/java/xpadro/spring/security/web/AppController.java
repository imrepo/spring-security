package xpadro.spring.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @GetMapping("/home")
    public @ResponseBody String secured() {
        return "Hello user!";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "Hello admin!";
    }
}
