package com.test.springcloudcontract;

import org.junit.Before;

import com.test.springcloudcontract.GreetingController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class BaseTest {
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new GreetingController());
	}
}