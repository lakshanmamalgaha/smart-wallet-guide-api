package com.smart.wallet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.wallet.model.Transaction;
import com.smart.wallet.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository ;
	
	public Transaction createTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	
	public List<Transaction> getAll(){
		return transactionRepository.findAll();
	}
	
	public List<Transaction> getAllByMothYear(String yearMoth){
		return transactionRepository.findByYearMonth(yearMoth);
	}
	
	public List<Transaction> getByUserIdAndYearMonth(String userId,String yearMoth){
		return transactionRepository.findByUserIdAndYearMonth(userId,yearMoth);
	}
	
	public List<Transaction> getAllByUserIdAndYearMonthAndCategory(String userId,String yearMonth, String category){
		return transactionRepository.findByUserIdAndYearMonthAndCategory(userId, yearMonth, category);
	}
	
	public void deleteTransaction(String date) {
		Transaction t = transactionRepository.findByDate(date);
		transactionRepository.delete(t);
	}
}
