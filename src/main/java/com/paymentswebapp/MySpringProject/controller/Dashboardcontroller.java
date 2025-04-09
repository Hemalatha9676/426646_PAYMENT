package com.paymentswebapp.MySpringProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.util.StringUtils;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class Dashboardcontroller {

    @Autowired
    UserService userservice;

    @GetMapping("/sendmoney")
    public String showSendMoneyPage() {
        return "SendMoney";
    }

    @GetMapping("/editprofile")
    public String showEditProfilePage() {
        return "EditProfilepage";
    }

    @GetMapping("/addbankaccount")
    public String showAddBankAccountPage() {
        return "AddbankAccount";
    }

    @GetMapping("/detailedstatement")
    public String showDetailedStatementPage() {
        return "DetailedStatement";
    }

    @GetMapping("/dashboard")
    public String showDashBoardPage(HttpSession session, Model model) {
        String email = (String) session.getAttribute("email");
        if (StringUtils.hasText(email)) {
            Optional<UserEntity> profiledetails = userservice.getUserByEmail(email);
            if (profiledetails.isPresent())
            {
                UserEntity user = profiledetails.get();
                session.setAttribute("user", user);
                model.addAttribute("user", user);
            } 
        }
        return "Dashboardpage";
    }
}

