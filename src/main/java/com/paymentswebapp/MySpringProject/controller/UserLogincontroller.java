package com.paymentswebapp.MySpringProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserLogincontroller{
	

	@Autowired
	UserService userservice;
@PostMapping("/login")
public String login(@RequestParam("UserName") String UserName,
                    @RequestParam("Password") String Password,
                    HttpSession session,
                    Model model) {

    Optional<UserEntity> user = userservice.authenticateUser(UserName, Password); 

    if (user.isPresent()) {
        UserEntity u = user.get();
        session.setAttribute("user", u); 
        session.setAttribute("firstname", u.getFirstName());
        session.setAttribute("email", u.getEmail());
        session.setAttribute("phonenumber", u.getPhonenumber());
        session.setAttribute("uname", u.getUserName());
        return "redirect:/dashboard"; // Redirect to avoid resubmit
    } else {
        model.addAttribute("error", "Invalid username or password");
        return "Loginpage";
    }
}
}
