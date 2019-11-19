package com.smart.wallet.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
	private String email;
	private String password;
	private String occupation;
	private int food;
	private int transportation;
	private int health;
	private int rent;
	private int education;
	private int entertainment;
	private int others;
	private boolean enabled;
	@DBRef
	private Set<Role> roles;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getTransportation() {
		return transportation;
	}
	public void setTransportation(int transportation) {
		this.transportation = transportation;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	public int getEntertainment() {
		return entertainment;
	}
	public void setEntertainment(int entertainment) {
		this.entertainment = entertainment;
	}
	public int getOthers() {
		return others;
	}
	public void setOthers(int others) {
		this.others = others;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
