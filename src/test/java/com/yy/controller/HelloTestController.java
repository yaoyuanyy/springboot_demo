package com.yy.controller;

import java.net.URL;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.AppRun;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AppRun.class)
@WebIntegrationTest(randomPort = true)
@ActiveProfiles("test")
public class HelloTestController {

	@Value("${local.server.port}")
	private int port;

	private URL base;
	private TestRestTemplate template;
	private String methodUrl = "hello/home";

	@Before
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "/");
		template = new TestRestTemplate();
	}

	@Test
	public void getHello() throws Exception {
		ResponseEntity<String> response = template.getForEntity(base.toString() + methodUrl, String.class);
		Assert.assertThat(response.getBody(), Is.is("Hello World!"));
	}
}
