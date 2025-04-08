package com.paymentswebapp.MySpringProject.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
 public  UserRepository userrepo;
	public void saveUser(UserEntity user) 
	{
		userrepo.save(user);
	}
//	public UserEntity authenticateUser(String UserName ,String Password) {
//		return userrepo.findByUserNameAndPassword(UserName, Password);
//		
//	}

}

