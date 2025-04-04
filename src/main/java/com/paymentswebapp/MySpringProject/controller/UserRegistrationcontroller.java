package com.paymentswebapp.MySpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
@Controller
public class UserRegistrationcontroller
{
	@GetMapping("/register")
	public String displayregistrationpage( Model model)
	{
	
		System.out.println("this is registration page");
		return "Registrationpage" ;
		
	}
		  @GetMapping("/login")
		    public String loginPage() {
		        System.out.println("This is the login page");
		        return "LoginPage"; // Ensure you have a 'LoginPage.html' or JSP file
		    
	}
}