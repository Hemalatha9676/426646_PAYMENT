package com.paymentswebapp.MySpringProject.controller;

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
public class UserLogincontroller
{
	

    @Autowired
    private UserService userservice;
    
	@GetMapping("/login")
	public String dispalyloginform()
	{
		System.out.println("login page");
		return "Loginpage" ;
	}
//	@PostMapping("/login")
//	public String  login(@RequestParam("email") String email,
//            @RequestParam("password") String password,
//            HttpSession session) {
//		UserEntity loggedInUser=userservice.authenticateUser(UserName,Password);
//		
//		if(loggedInUser!=null) {
//			session.setAttribute("email", email);
//			
//			System.out.println("login successfull");
//			 return "redirect:/dashboard";
//			
//		}else {
//			System.out.println("login not successfull");
//			return "login";
//		}
//		
	@PostMapping("/login")
   public String displaydashboard()
   {
	return "Dashboardpage";
	   
   }
    
}

//}
