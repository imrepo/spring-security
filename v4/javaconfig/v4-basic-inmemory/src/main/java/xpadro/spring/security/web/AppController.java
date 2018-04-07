package xpadro.spring.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public @ResponseBody String home() {
        return "Hello user!";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public @ResponseBody String admin() {
        return "Hello admin!";
    }
}
