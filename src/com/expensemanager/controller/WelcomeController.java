package com.expensemanager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
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
	
	@RequestMapping({"/","/welcome"})
	public String getWelcomePage(Model model,HttpServletRequest request){
		if(request.getUserPrincipal()!=null){
			User user = new User();
			user.setEmail(request.getUserPrincipal().getName());
			User validUser=userService.isValid(user);
			model.addAttribute("page", "header");
			model.addAttribute("validUser", validUser);
			model.addAttribute("error",false);
		}
		if((User)((ModelMap)model).get("validUser")==null){
			model.addAttribute("page", "headerPre");
		}else{
			model.addAttribute("page", "header");
		}
		return "index";
	}
	
	@RequestMapping(value = "/signerror", method = RequestMethod.GET)
	public String signIn(Model model) {
		model.addAttribute("error",true);
		return "index";
	}
	
	@RequestMapping(value="/signout", method = RequestMethod.GET)
	public String signOut(Model model, SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		model.addAttribute("error",false);
		model.addAttribute("page", "headerPre");
		return "index";
		
	}
	
}
