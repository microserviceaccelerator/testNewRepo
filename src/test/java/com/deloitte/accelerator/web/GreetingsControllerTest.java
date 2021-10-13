package com.deloitte.accelerator.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;


import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class GreetingsControllerTest {

	GreetingsController greetingController;

	@Before
	public void setup() {
		greetingController = new GreetingsController();
	}

	@Test
	public void testweather() {
		ResponseEntity<String> weather = greetingController.weather("Hyderabad");
		
		assertThat(weather.getBody()).isNotEmpty();

	}	
	
}

