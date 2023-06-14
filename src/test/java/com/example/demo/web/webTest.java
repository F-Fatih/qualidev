package com.example.demo.web;

import org.apache.tomcat.util.http.parser.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.service.Statistique;
import com.example.demo.service.StatistiqueImpl;

import com.example.demo.data.Voiture;
import com.example.demo.service.Echantillon;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class webTest {
    
    @MockBean
	Statistique statistique;

	@Autowired
	MockMvc mockMvc;

	/*@Test
	void testSansVoiture() throws Exception {
		mockMvc.perform(get("/statistique")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}

	@Test
	void ajoutVoiture() throws Exception {
		mockMvc.perform(post("/voiture")
			.contentType(MediaType.APPLICATION_JSON)
			.content("{\"marque\": \"Audi\", \"prix\": 30000 }")
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}*/
}
