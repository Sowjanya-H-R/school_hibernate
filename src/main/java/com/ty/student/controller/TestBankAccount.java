package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.BankAccount;

public class TestBankAccount {
public static void main(String[] args) {
	BankAccount account=new BankAccount();
	account.setName("soonu");
	account.setAddress("mysuru");
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=factory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(account);
	transaction.commit();
}
}
