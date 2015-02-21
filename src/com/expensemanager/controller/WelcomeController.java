package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.expensemanager.domain.User;
import com.expensemanager.service.UserService;

@Controller
@SessionAttributes(value = {"page","validUser"})
public class WelcomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/")
	public String getWelcomePage(Model model){
		if((User)((ModelMap)model).get("validUser")==null){
			model.addAttribute("page", "headerPre");
		}else{
			model.addAttribute("page", "header");
		}
		return "index";
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signIn(Model model, User user) {
		User validUser=userService.isValid(user);
		String page = "index";
		if(validUser!=null){
			model.addAttribute("page", "header");
			model.addAttribute("validUser", validUser);
			model.addAttribute("error",false);
		}else{
			model.addAttribute("page", "headerPre");
			model.addAttribute("error",true);
		}
		return page;
	}
	
	@RequestMapping(value="/signout", method = RequestMethod.POST)
	public String signOut(Model model, SessionStatus sessionStatus, User user) {
		sessionStatus.setComplete();
		model.addAttribute("page", "headerPre");
		return "index";
		
	}
	
}
