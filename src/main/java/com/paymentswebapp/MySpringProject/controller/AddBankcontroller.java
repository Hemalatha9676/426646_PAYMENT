package com.paymentswebapp.MySpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddBankcontroller
{
	@GetMapping("/addbank")
	public String addbank()
	{
		System.out.println("adding bank account");
		return "Addbankform";
		
	}
	

}
