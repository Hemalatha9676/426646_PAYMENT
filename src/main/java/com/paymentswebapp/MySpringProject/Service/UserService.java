package com.paymentswebapp.MySpringProject.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
import com.paymentswebapp.MySpringProject.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public void saveUser(UserEntity user) {
        userRepo.save(user);
    }

    public Optional<UserEntity> authenticateUser(String userName, String password) {
        return userRepo.findByUserNameAndPassword(userName, password);
    }
}

