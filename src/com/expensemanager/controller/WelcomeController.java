package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.expensemanager.domain.User;
import com.expensemanager.service.UserService;

@Controller
public class WelcomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/")
	public String getWelcomePage(Model model){
		model.addAttribute("page", "headerPre");
		return "index";
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signIn(Model model, User user) {
		boolean valid=userService.isValid(user);
		if(valid){
			model.addAttribute("page", "header");
			model.addAttribute("user", userService.getCurrentUser());
		}else{
			model.addAttribute("page", "headerPre");
		}
		return "index";
	}
	
	@RequestMapping(value="/signout", method = RequestMethod.POST)
	public String signOut(Model model, SessionStatus sessionStatus, User user) {
		sessionStatus.setComplete();
		model.addAttribute("page", "headerPre");
		return "index";
		
	}
	
}
