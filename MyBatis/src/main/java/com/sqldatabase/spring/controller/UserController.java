package com.sqldatabase.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sqldatabase.spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value = "/user" , method=RequestMethod.GET)
	public String Hello(Model model) throws Exception {
		// Spring 에서 제공하는 Model 객체를 사용하여 뷰페이지에 데이터를 넘겨준다. 
		model.addAttribute("result", userservice.selectUsers());
		// jsp 페이지 호출
		return "/user";
	}
}