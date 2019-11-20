package com.smart.wallet.controller;

import java.util.List;
import java.util.Map;

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
	

	@RequestMapping("/getAll")
	public List<Transaction> getAll(){
		return transactionService.getAll();
	}
	
	@RequestMapping(value="/getAllByMonthYear",method=RequestMethod.GET)
	public List<Transaction> getAllByMonthYear(@RequestParam(value="filter", required=false, defaultValue="")String filter){
		return transactionService.getAllByMothYear(filter);
	}

	@RequestMapping(value="/getByUserIdAndYearMonth",method=RequestMethod.GET)
	public List<Transaction> getByCategoryYearMonth(@RequestParam Map<String,String> requestParams){
		String userId=requestParams.get("userId");
		String yearMonth=requestParams.get("yearMonth");
		return transactionService.getByUserIdAndYearMonth(userId, yearMonth);
	}
	
	@RequestMapping(value="/getAllByUserIdAndYearMonthAndCategory",method=RequestMethod.GET)
	public List<Transaction> getAllByUserIdAndYearMonthAndCategory(@RequestParam Map<String,String> requestParams){
		String userId=requestParams.get("userId");
		String yearMonth=requestParams.get("yearMonth");
		String category = requestParams.get("category");
		return transactionService.getAllByUserIdAndYearMonthAndCategory(userId, yearMonth,category);
	}
	@RequestMapping(value="/deleteAll",method=RequestMethod.GET)
	public String delete(@RequestParam Map<String,String> requestParams) {
		String id = requestParams.get("id");
		String userId=requestParams.get("userId");
		transactionService.deleteTransaction(id,userId);
		return "deleted";
	}
	
	
}
