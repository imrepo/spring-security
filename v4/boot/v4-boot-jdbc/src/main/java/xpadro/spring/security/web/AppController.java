package xpadro.spring.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @GetMapping(value = "/home")
    public ModelAndView secured() {
        ModelAndView mav = new ModelAndView("home");
        mav.getModelMap().addAttribute("message", "Hello user!");

        return mav;
    }

    @GetMapping(value = "/admin")
    public ModelAndView admin() {
        ModelAndView mav = new ModelAndView("admin");
        mav.getModelMap().addAttribute("message", "Hello admin!");

        return mav;
    }
}
