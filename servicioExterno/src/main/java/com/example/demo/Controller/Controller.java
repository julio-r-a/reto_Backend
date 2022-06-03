package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.Entity.Users;

import com.example.demo.Service.UserService;

@RestController
public class Controller {

//	@Autowired
//	private UserService service;
//	
//	@GetMapping
//	public List<Users> listarUsers(){
//		return service.listarUsers();
//	}
//	
	
	@Autowired
	private final RestTemplate restTemplate;
	
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
