package com.paymentswebapp.MySpringProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserLogincontroller{
	

	@GetMapping("/login")
	public String showform()
	{
		
	   return "Loginpage" ;
	}
	
	
	
	
	
	@Autowired
	UserService userservice;

	
	
	@PostMapping("/login")
public String login(@RequestParam("UserName") String UserName,
                    @RequestParam("Password") String Password,
                    HttpSession session,
                    Model model) {

    Optional<UserEntity> user = userservice.authenticateUser(UserName, Password); 

    if (user.isPresent()) {
        UserEntity us= user.get();
        session.setAttribute("user", us); 
        session.setAttribute("firstname", us.getFirstName());
        session.setAttribute("email", us.getEmail());
        session.setAttribute("phonenumber", us.getPhonenumber());
        session.setAttribute("uname", us.getUserName());
        return "Dashboardpage"; 
    } else {
        model.addAttribute("error", "Invalid username or password");
        return "Loginpage";
    }
}
}
