package com.deloitte.accelerator.security.basicauth;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class AdminControllerTest {

	AdminSecurityController adminController;

	@Before
	public void setup() {
		adminController = new AdminSecurityController();
	}

	
	@Test
	public void testSystemInfo() {
		
		ResponseEntity<String> res = adminController.get("Welcome");		
		assertThat(res.getBody()).isNotBlank();
	}
}

