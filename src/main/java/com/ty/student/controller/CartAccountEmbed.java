package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.AccountId;
import com.ty.student.dto.CartAccount;

public class CartAccountEmbed {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transcation = entityManager.getTransaction();
		CartAccount account = new CartAccount();
		account.setPass("sonu");
		account.setGender("female");
		account.setName("disha");
		AccountId accountId = new AccountId();
		accountId.setEmail("soonu@123");
		accountId.setPhone(1234568);
		account.setAccountId(accountId);
		transcation.begin();
		entityManager.persist(account);
		transcation.commit();
		System.out.println("data stored");
	}
}
