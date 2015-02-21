package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.expensemanager.domain.User;
import com.expensemanager.service.UserService;

@Controller
public class RegisterController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/register")
	public String getRegister(User user){
		return "register";
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String doRegister(User user){
		user.setRole("ROLE_USER");
		user.setEnabled(true);
		userService.addUser(user);
		return "register";
	}
}
