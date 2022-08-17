package com.ty.student.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.student.dto.Student;
import com.ty.student.dto.User;

public class NamedBased {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		String jpql = "SELECT s FROM Student s WHERE s.age > : myage";
		
		Query query=entityManager.createQuery(jpql);
		query.setParameter("myage",15);
		List<Student> list = query.getResultList();
		System.out.println(list);

		
	}
}
