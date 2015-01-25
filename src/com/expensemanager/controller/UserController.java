package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.expensemanager.domain.User;
import com.expensemanager.service.UserService;

@Controller()
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/add")
	public String getRegister(){
		return "register";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String doRegister(User user){
		userService.addUser(user);
		return "register";
	}
}
