package com.example.demo.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Users;

//@Service
public class UsersServiceImpl{ //implements UserService{
//
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@Override
//	public List<Users> listarUsers() {
//		List<Users> users = Arrays.asList(restTemplate.getForObject("${url}", Users[].class));
//		return users.stream().map(p-> new Users()).collect(Collectors.toList());
//	}
//
//	@Override
//	public Users userPorId(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
	//}

}
