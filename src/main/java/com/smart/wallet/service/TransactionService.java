package com.smart.wallet.service;

import java.util.List;

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
	
	public List<Transaction> getFilterByDate(String filter){
		
		return transactionRepository.findByDate(filter);
	}
	
	public List<Transaction> getAll(){
		return transactionRepository.findAll();
	}
	
	public List<Transaction> getAllByMothYear(String yearMoth){
		return transactionRepository.findByYearMonth(yearMoth);
	}
}
