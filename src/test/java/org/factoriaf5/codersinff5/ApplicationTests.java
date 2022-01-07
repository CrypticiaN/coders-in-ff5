package org.factoriaf5.codersinff5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.factoriaf5.codersinff5.repository.Coder;
import org.factoriaf5.codersinff5.repository.CoderRepository;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void loadsTheHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }

    @Autowired
    public CoderRepository coderRepository;

    @Test
    void returnsTheExistingCoders() throws Exception {

        Coder coder = coderRepository.save(new Coder("Helen Jane", "Didsbury", "24", "Alemania", "Grado medio", "Pla de Fornells 57", "Femtech P2"));

        mockMvc.perform(get("/coders"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(model().attribute("coders", hasItem(coder)));
    }
    @BeforeEach
    void setUp() {
        coderRepository.deleteAll();
    }


}
