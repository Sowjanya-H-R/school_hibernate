package com.ty.student.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.student.dto.Student;

public class PositionBasedAgeOfStudentGetting {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		String jpql = "SELECT s FROM Student s WHERE s.age > ?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, 20);
		List<Student> list = query.getResultList();
		System.out.println(list);
	}
}
