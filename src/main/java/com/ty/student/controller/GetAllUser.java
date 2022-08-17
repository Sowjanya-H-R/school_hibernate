package com.ty.student.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.student.dto.User;

public class GetAllUser {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		String jpql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(jpql);
		List<User> list = query.getResultList();
		System.out.println(list);
	}
}
