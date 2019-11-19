package com.smart.wallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smart.wallet.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	  public User findByEmail(String email);
	  //public
	}
