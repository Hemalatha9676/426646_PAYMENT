package com.paymentswebapp.MySpringProject.controller;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePagecontroller
{
	@GetMapping("/Home")
public String displayhomepage()
{
	System.out.println("welcome to payment app");
	return "Homepage";
	
}
}
