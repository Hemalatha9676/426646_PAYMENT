package com.paymentswebapp.MySpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demo
{
	@GetMapping("/test")
	public String sample() 
	{
		System.out.println("welcome to payment app");
		return "testing";
		
	}

}
