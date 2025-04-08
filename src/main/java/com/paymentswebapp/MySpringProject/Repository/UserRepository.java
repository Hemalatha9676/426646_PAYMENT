package com.paymentswebapp.MySpringProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
//    UserEntity findByUserNameAndPassword(String UserName, String Password);
}
