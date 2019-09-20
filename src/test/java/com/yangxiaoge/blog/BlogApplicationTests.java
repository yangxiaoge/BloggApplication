package com.yangxiaoge.blog;

import com.yangxiaoge.blog.controller.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class BlogApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void testHelloWorldController() throws Exception {

        //hello world
        mvc.perform(MockMvcRequestBuilders.get("/user/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));

        //login
        mvc.perform(MockMvcRequestBuilders.post("/user/login")
                .param("account","123").param("password","123456").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"areaId\":0,\"areaName\":null,\"gender\":null,\"headPic\":null,\"isFirstLogin\":null,\"isLeader\":0,\"jobName\":null,\"mobileNo\":null,\"orgId\":0,\"orgName\":null,\"staffId\":0,\"staffName\":null,\"token\":null,\"userCode\":null}")));
    }

}
