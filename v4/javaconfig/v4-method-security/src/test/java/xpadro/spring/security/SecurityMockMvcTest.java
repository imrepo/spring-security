package xpadro.spring.security;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SecurityTestContext.class)
@WebAppConfiguration
public class SecurityMockMvcTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(SecurityMockMvcConfigurers.springSecurity())
                .build();
    }

    @Test
    public void webLayer_anonymousAccess_isRedirectedToLogin() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }

    @Test
    public void webLayer_userRoleAccessingSecuredWithUser_hasAccess() throws Exception {
        mockMvc.perform(get("/user")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk());
    }

    @Test
    public void webLayer_userRoleAccessingSecuredWithAdmin_hasNoAccess() throws Exception {
        mockMvc.perform(get("/admin")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isForbidden());
    }


    @Test
    public void webLayer_adminRoleAccessingSecuredWithUser_hasAccess() throws Exception {
        mockMvc.perform(get("/user")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk());
    }

    @Test
    public void webLayer_adminRoleAccessingSecuredWithAdmin_hasAccess() throws Exception {
        mockMvc.perform(get("/admin")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk());
    }

    @Test
    public void serviceLayer_userRoleAccessingSecuredWithUser_hasAccess() throws Exception {
        mockMvc.perform(get("/userService")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk());
    }

    @Test
    public void serviceLayer_userRoleAccessingSecuredWithAdmin_hasNoAccess() throws Exception {
        mockMvc.perform(get("/adminService")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isForbidden());
    }


    @Test
    public void serviceLayer_adminRoleAccessingSecuredWithUser_hasAccess() throws Exception {
        mockMvc.perform(get("/userService")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk());
    }

    @Test
    public void serviceLayer_adminRoleAccessingSecuredWithAdmin_hasAccess() throws Exception {
        mockMvc.perform(get("/adminService")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk());
    }
}
