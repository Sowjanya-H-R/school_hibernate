package com.ty.student.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.student.dto.User;

public class UserEmail {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		String jpql = "SELECT u FROM  User u WHERE u.email= ?1 AND u.pass= ?2";
		Query query = entityManager.createQuery(jpql);

		query.setParameter(1, "sowj@123");
		query.setParameter(2, "sowj");
		List<User> list = query.getResultList();
		System.out.println(list);
	}
}
