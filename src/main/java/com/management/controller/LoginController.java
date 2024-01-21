package com.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.management.entities.Register;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	
	@RequestMapping("/sign")
	public  String sign() {
		
		return "sign";
	}
	
	@RequestMapping("/register_page")
	public  String register_page() {
		System.out.println("run register page ");
		return "register_page";
	}
	
	@RequestMapping(path="/registerPage" , method = RequestMethod.POST)	
	public String addProduct(@ModelAttribute Register register , HttpServletRequest request) {
		 
		System.out.println(register);
		
		
		
				
		return "register_page";	
	}
	
}
