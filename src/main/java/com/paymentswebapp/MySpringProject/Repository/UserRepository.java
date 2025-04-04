package com.paymentswebapp.MySpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
