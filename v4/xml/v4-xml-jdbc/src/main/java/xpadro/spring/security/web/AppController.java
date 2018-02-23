package xpadro.spring.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView secured() {
        ModelAndView mav = new ModelAndView("home");
        mav.getModelMap().addAttribute("message", "Hello user!");

        return mav;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin() {
        ModelAndView mav = new ModelAndView("admin");
        mav.getModelMap().addAttribute("message", "Hello admin!");

        return mav;
    }
}
