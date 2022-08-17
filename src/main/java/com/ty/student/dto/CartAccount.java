package com.ty.student.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CartAccount {
	@EmbeddedId
	private AccountId accountId;
	private String name;
	private String pass;
	private String gender;
	public AccountId getAccountId() {
		return accountId;
	}
	public void setAccountId(AccountId accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
