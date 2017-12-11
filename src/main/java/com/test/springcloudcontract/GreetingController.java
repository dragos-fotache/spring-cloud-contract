package com.test.springcloudcontract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("greeting")
	public String greeting() {
		return "Hello worlds!";
	}
	
	@GetMapping("my-test")
	public String myTest() {
		return "This is my test";
	}
	

}
