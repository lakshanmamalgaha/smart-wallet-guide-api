package com.smart.wallet.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smart.wallet.model.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction,String>  {

	public Transaction findByName(String name);
	public Transaction findByIdAndUserId(String id,String userId);
	public List<Transaction> findByYearMonth(String yearMoth);
	public List<Transaction> findByUserIdAndYearMonth(String userId,String yearMonth);
	public List<Transaction> findByUserIdAndYearMonthAndCategory(String userId,String yearMonth, String category);
}
