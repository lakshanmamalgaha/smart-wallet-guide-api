package com.smart.wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.wallet.model.Transaction;
import com.smart.wallet.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping(
			  value = "/createTransaction", consumes = "application/json", produces = "application/json")
	public Transaction createTransaction(@RequestBody Transaction transaction ) {
		return transactionService.createTransaction(transaction);
	}
	
	@RequestMapping(value="/getFilterByDate",method=RequestMethod.GET)
	public List<Transaction> getFilterByDate(@RequestParam(value="filter", required=false, defaultValue="")String filter){
		return transactionService.getFilterByDate(filter);
	}
	
	@RequestMapping("/getAll")
	public List<Transaction> getAll(){
		return transactionService.getAll();
	}
	
	@RequestMapping(value="/getAllByMonthYear",method=RequestMethod.GET)
	public List<Transaction> getAllByMonthYear(@RequestParam(value="filter", required=false, defaultValue="")String filter){
		return transactionService.getAllByMothYear(filter);
	}
	
	
}
