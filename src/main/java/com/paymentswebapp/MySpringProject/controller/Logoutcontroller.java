package com.paymentswebapp.MySpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import jakarta.servlet.http.HttpSession;

@Controller
public class Logoutcontroller
{
	
		@GetMapping("/logout")
		public String loggingOut(HttpSession session, Model model) 
		{
			session.invalidate();
            return "Loginpage";
		}
}

