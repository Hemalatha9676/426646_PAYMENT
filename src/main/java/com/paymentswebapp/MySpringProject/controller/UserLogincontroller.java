package com.paymentswebapp.MySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserLogincontroller
{
	@GetMapping("/login")
 public String login()
 {
		
	 System.out.println("Login page");
	return "Loginpage";
	 
 }
}
