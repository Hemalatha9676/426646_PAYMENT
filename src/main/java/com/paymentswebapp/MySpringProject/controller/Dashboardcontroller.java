
package com.paymentswebapp.MySpringProject.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        UserEntity user = (UserEntity) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("user", user);
            return "Dashboardpage";
        } else {
            return "login";
        }
        
       
    }
} 
