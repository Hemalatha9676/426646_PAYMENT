package com.paymentswebapp.MySpringProject.controller;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Service.UserService;
import com.paymentswebapp.MySpringProject.dtos.Userdtos;


@Controller
public class UserRegistrationcontroller
{
	@Autowired
	UserService userservice;
	
	@GetMapping("/register")
	public String showform(Model model)
	{
		model.addAttribute("user",new UserEntity());
	   return "Registrationpage" ;
	}
	
	@PostMapping("/register")
    public String registerUser(@ModelAttribute Userdtos userdto)
	{
	   System.out.println(userdto);
       UserEntity userentity=new UserEntity();
       userentity.setUserId(userdto.getUserid());
       userentity.setUserName(userdto.getUserName());
       userentity.setFirstname(userdto.getFirstName());
       userentity.setLastname(userdto.getLastName());
       userentity.setPassword(userdto.getPassword());
       userentity.setPhoneNumber(userdto.getPhoneNumber());
       userentity.setEmail(userdto.getEmail());
       userentity.setAddress(userdto.getAddress());
       System.out.println(userentity);
       userservice.saveUser(userentity);
        return "Loginpage"; 
    } 
	
}