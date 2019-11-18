package com.smart.wallet.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smart.wallet.model.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction,String>  {

	public Transaction findByName(String name);
	public List<Transaction> findByDate(String date);
	public List<Transaction> findByYearMonth(String yearMoth);
	public List<Transaction> findByUserIdAndYearMonth(String userId,String yearMonth);
}
