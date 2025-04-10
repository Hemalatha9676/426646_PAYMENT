package com.paymentswebapp.MySpringProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paymentswebapp.MySpringProject.Entities.BankAccountsEntity;
import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Service.BankService;
import com.paymentswebapp.MySpringProject.Service.UserService;
import com.paymentswebapp.MySpringProject.dtos.BankAccountdto;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddBankController {
	@Autowired
	BankService bankservice;
	@Autowired
	UserService userservice;
	
	@GetMapping("/addnewbankaccount")
	public String showAdddBankAccountForm()
	{
		return "AddbankAccount";
	}
	
	@PostMapping("/addnewbankaccount")
	public String addingBankAccount(@ModelAttribute BankAccountdto bankAccDto, HttpSession session) {
	    BankAccountsEntity bankAccEntity = new BankAccountsEntity();
	    bankAccEntity.setBankAccountNo(bankAccDto.getBankAccountNo());
	    bankAccEntity.setBankName(bankAccDto.getBankName());
	    bankAccEntity.setBranch(bankAccDto.getBranch());
	    bankAccEntity.setCurrentBalance(bankAccDto.getCurrentBalance());
	    bankAccEntity.setIFSCCode(bankAccDto.getIFSCCode());
	    bankAccEntity.setIsActive(bankAccDto.getIsActive());

	    String email = (String) session.getAttribute("email");
	    Optional<UserEntity> loggedInUser = userservice.getUserByEmail(email);

	    if (loggedInUser.isPresent()) {
	        UserEntity user = loggedInUser.get();
	        bankAccEntity.setUser(user);

	        bankservice.addBankAccount(bankAccEntity);  

	       
	       
	    }return "Dashboardpage";
	}
	

}
