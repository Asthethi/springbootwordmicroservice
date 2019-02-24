package com.springbootmicroservice.api.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springbootmicroservice.api.model.Word;
import com.springbootmicroservice.api.service.WordService;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootRestfulWebserviceApplicationTests {

	private MockMvc mocMvc;

	@InjectMocks
	WordController wordControler;

	@Mock
	WordService wordService;

	@Before
	public void setUp() {

		mocMvc = MockMvcBuilders.standaloneSetup(wordControler).build();

	}

	@Test
	public void allWordsTest() throws Exception {

		List<Word> wordList = new ArrayList<Word>();
		//wordList.add(new Word("Test Word", "Test Meaning"));

		Mockito.when(wordService.getAllWords()).thenReturn(wordList);

		MvcResult mvcResult = mocMvc.perform(get("/word-service/words")).andReturn();
		//System.out.println(wordService.getAllWords());
		assertEquals(200, mvcResult.getResponse().getStatus());

	}


}
