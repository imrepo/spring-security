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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
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
    public void anonymousAccess_isRedirectedToLogin() throws Exception {
        mockMvc.perform(get("/user1"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }

    @Test
    public void userRoleAccessingSecured_hasAccess() throws Exception {
        mockMvc.perform(get("/user1")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk());
    }

    @Test
    public void fromContext_hasUserRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user1")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromContext_hasAdminRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user1")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello administrator test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromAuthentication_hasUserRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user2")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromAuthentication_hasAdminRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user2")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello administrator test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromPrincipal_hasUserRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user3")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromPrincipal_hasAdminRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user3")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello administrator test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromUser_hasUserRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user4")
                .with(user("test").password("test").roles("USER")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello test!", result.getResponse().getContentAsString());
    }

    @Test
    public void fromUser_hasAdminRole() throws Exception {
        MvcResult result = mockMvc.perform(get("/user4")
                .with(user("test").password("test").roles("USER", "ADMIN")))
                .andExpect(status().isOk()).andReturn();

        assertEquals("Hello administrator test!", result.getResponse().getContentAsString());
    }

}
