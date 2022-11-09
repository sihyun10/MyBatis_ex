package com.sqldatabase.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqldatabase.spring.dto.UserDTO;
import com.sqldatabase.spring.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/users")
	public List<UserDTO> users() throws Exception{
		return userservice.selectUsers();
	}
}