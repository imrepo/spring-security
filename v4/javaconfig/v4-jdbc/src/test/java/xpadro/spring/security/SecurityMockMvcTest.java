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

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
    public void anonymousAccess_isRedirectedToLogin() throws Exception {
        mockMvc.perform(get("/home"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }

    @Test
    public void userRoleAccessingSecuredWithUser_hasAccess() throws Exception {
        mockMvc.perform(get("/home")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk());
    }

    @Test
    public void userRoleAccessingSecuredWithAdmin_hasNoAccess() throws Exception {
        mockMvc.perform(get("/admin")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isForbidden());
    }


    @Test
    public void adminRoleAccessingSecuredWithUser_hasAccess() throws Exception {
        mockMvc.perform(get("/home")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk());
    }

    @Test
    public void adminRoleAccessingSecuredWithAdmin_hasAccess() throws Exception {
        mockMvc.perform(get("/admin")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk());
    }

    @Test
    public void successfulLogin() throws Exception {
        mockMvc.perform(
                post("/j_spring_security_check")
                        .with(csrf())
                        .param("j_username", "user")
                        .param("j_password", "user"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/home"));
    }

    @Test
    public void unsuccessfulLogin_invalidPassword() throws Exception {
        mockMvc.perform(
                post("/j_spring_security_check")
                        .with(csrf())
                        .param("j_username", "user")
                        .param("j_password", "wrongpass"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/login?error"));
    }

    @Test
    public void unsuccessfulLogin_noCsrf() throws Exception {
        mockMvc.perform(
                post("/j_spring_security_check")
                        .param("j_username", "user")
                        .param("j_password", "user"))
                .andExpect(status().is4xxClientError());
    }
}
