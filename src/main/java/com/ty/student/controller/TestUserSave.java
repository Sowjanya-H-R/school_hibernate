package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.User;

public class TestUserSave {
	public static void main(String[] args) {
		User user = new User();
		user.setName("sono");
		user.setEmail("sonu@145");
		user.setPhno(82178187);
		user.setPass("soonu");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(user);
		transaction.commit();

	}
}
