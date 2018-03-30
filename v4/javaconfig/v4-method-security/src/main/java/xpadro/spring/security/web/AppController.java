package xpadro.spring.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xpadro.spring.security.service.AppService;

@Controller
public class AppController {
    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public @ResponseBody String userMapping() {
        return "Hello user!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public @ResponseBody String adminMapping() {
        return "Hello admin!";
    }

    @RequestMapping(value = "/userService", method = RequestMethod.GET)
    public @ResponseBody String userService() {
        return appService.userMethod();
    }

    @RequestMapping(value = "/adminService", method = RequestMethod.GET)
    public @ResponseBody String adminService() {
        return appService.adminMethod();
    }
}
