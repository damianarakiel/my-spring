package pl.stefanski.myspring;

import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    /*@Test
    public void shouldReturnHelloView_And_SetMyObjAttribute_When_GetOnHello() throws Exception {
        //when
        //@formatter:off
        mockMvc.perform(get("/hello"))
        //then
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("myObj", new MyObject("Hello yeah!!!")));
        //@formatter:on
    }*/
}
