package com.paymentswebapp.MySpringProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentswebapp.MySpringProject.Entities.BankAccountsEntity;
import com.paymentswebapp.MySpringProject.Repository.BankAccountRepository;

@Service
public class BankService
{
	@Autowired
	public BankAccountRepository BankAccountRepo;
	

    public void addBankAccount(BankAccountsEntity bankAccEntity) {
	BankAccountRepo.save(bankAccEntity);
}
	
		public List<BankAccountsEntity> getBankAccountsByUserId(int userId) {
			return BankAccountRepo.findByUserUserId(userId);
		}

	}

