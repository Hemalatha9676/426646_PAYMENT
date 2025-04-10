
package com.paymentswebapp.MySpringProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentswebapp.MySpringProject.Entities.BankAccountsEntity;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountsEntity,Integer>{
	List<BankAccountsEntity> findByUserUserId(int userId);


}  