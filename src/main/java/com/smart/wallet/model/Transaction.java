package com.smart.wallet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {

	@Id
	String Id;
	String name;
	String category;
	String iconName;
	String comment;
	String date;
	int amount;
	
	public Transaction(String name, String iconName, String comment, String date, int amount) {
		this.name = name;
		this.iconName = iconName;
		this.comment = comment;
		this.date = date;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
