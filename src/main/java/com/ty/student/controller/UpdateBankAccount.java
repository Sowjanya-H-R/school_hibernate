package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.BankAccount;

public class UpdateBankAccount {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		BankAccount account = entityManager.find(BankAccount.class, 2);
		if (account != null) {
			transaction.begin();
			account.setName("soonu M");
			entityManager.merge(account);
			transaction.commit();

		} else {
			System.out.println("account not found");
		}
	}
}
