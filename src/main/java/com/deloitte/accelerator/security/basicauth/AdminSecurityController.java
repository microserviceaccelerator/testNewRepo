package com.deloitte.accelerator.security.basicauth;

import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"Admin"})
@SwaggerDefinition(tags = {
		@Tag(name = "Admin")
})
@RestController
@RequestMapping(path = "/api/v1/security")
@Slf4j
public class AdminSecurityController {

	@ApiOperation(value = "Get Call for all authenticated users", notes = "Get Call for all authenticated users", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,
					message = "Greetings response by name"),
			@ApiResponse(code = 401,
					message = "Security Error, unauthenticated"),
			@ApiResponse(code = 403,
					message = "Security Error, Request lacks valid authorization."),
			@ApiResponse(code = 500, message = "Server Error, Unknown Server Error."),
			@ApiResponse(code = 503,
					message = "Availability Error")})
	@GetMapping(value = "/user")
	public ResponseEntity<String> get(@RequestParam String name) {
		return ResponseEntity.ok("Hello "+name);
	}

	@ApiOperation(value = "Get Call for all authenticated admin users", notes = "Get Call for all authenticated admin users", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,
					message = "Greetings response by name"),
			@ApiResponse(code = 401,
					message = "Security Error, unauthenticated"),
			@ApiResponse(code = 403,
					message = "Security Error, Request lacks valid authentication credentials."),
			@ApiResponse(code = 500, message = "Server Error, Unknown Server Error."),
			@ApiResponse(code = 503,
					message = "Availability Error")})
	@GetMapping(value = "/admin")
	public ResponseEntity<String> getAdmin(@RequestParam String name) {
		return ResponseEntity.ok("Hello "+name);
	}



}
