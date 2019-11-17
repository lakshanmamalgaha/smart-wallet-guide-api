package com.smart.wallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smart.wallet.model.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {

}
