package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc

public class ProjectRestControllerTest {
	@Autowired
	private MockMvc mockMvc;

	/**
	 * Prueba para comprobar que hay que llamar al proyecto por su ID y no String
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project_not_exists() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/backoffice/proyectos/aaabbbccc");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is4xxClientError());

	}

	/**
	 * Prueba para comprobar que un proyecto existe
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/backoffice/proyectos/6");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}

	/**
	 * Prueba para comprobar que combinación de int+String da error "type mismatch"
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project_not_exists_2() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/backoffice/proyectos/1a");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}
}
