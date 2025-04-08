package com.paymentswebapp.MySpringProject.controller;

import java.util.Optional; // ✅ Correct Optional import

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
public class UserLogincontroller {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String displayLoginForm() {
        System.out.println("login page");
        return "Loginpage";
    }

    @PostMapping("/login")
    public String login(@RequestParam("UserName") String UserName,
                        @RequestParam("Password") String Password,
                        HttpSession session,
                        Model model) {

        Optional<UserEntity> user = userService.authenticateUser(UserName, Password); 

        if (user.isPresent()) {
            session.setAttribute("UserName", UserName);
            return "Dashboardpage";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "Loginpage";
        }
    }
}
