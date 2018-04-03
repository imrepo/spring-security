package xpadro.spring.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xpadro.spring.security.web.AppController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SecurityTestContext.class)
public class SecurityTest {

    @Autowired
    private AppController appController;

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void anonymousAccess() {
        appController.userMapping();
    }

    @Test
    @WithMockUser
    public void webLayer_securedWithUser_hasAccess() {
        appController.userMapping();
    }

    @Test(expected = AccessDeniedException.class)
    @WithMockUser
    public void webLayer_securedWithAdmin_noAccess() {
        appController.adminMapping();
    }

    @Test
    @WithMockUser(username = "admin", roles = {"USER", "ADMIN"})
    public void webLayer_securedWithAdmin_hasAccess() {
        appController.adminMapping();
    }

    @Test
    @WithMockUser
    public void serviceLayer_securedWithUser_hasAccess() {
        appController.userService();
    }

    @Test(expected = AccessDeniedException.class)
    @WithMockUser
    public void serviceLayer_securedWithAdmin_noAccess() {
        appController.adminService();
    }

    @Test
    @WithMockUser(username = "admin", roles = {"USER", "ADMIN"})
    public void serviceLayer_securedWithAdmin_hasAccess() {
        appController.adminService();
    }
}
