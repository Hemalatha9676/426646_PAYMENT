package com.paymentswebapp.MySpringProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Service.UserService;
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
	   @PostMapping("/login")
	    public String showdashboard(@RequestParam("UserName") String UserName,
	                                @RequestParam("Password") String Password,
	                                Model model) {

	        try {
	            UserEntity user = userservice.getUserByUsernameAndPassword(UserName, Password);

	            if (user != null) {
	                return "Dashboardpage"; // Login success
	            } else {
	                model.addAttribute("error", "Invalid username or password");
	                return "Loginpage"; // Login failed
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	            model.addAttribute("error", "Something went wrong. Please try again.");
	            return "Loginpage";
	        }
   
    
}

}
