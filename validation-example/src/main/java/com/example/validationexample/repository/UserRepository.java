package com.example.validationexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.validationexample.entity.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserId(int id);
}
