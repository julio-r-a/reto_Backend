package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
private final RestTemplate restTemplate;
	
	@Autowired
	public Controller(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;		
	}
	
	@Value("${url}")
	private String url;
	
	//@GetMapping("/test")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Object getTest() {
		 String Url=url;
		return restTemplate.getForObject(Url, Object.class);
	}
}
