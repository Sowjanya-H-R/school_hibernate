package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Teacher;

public class UpdateTeacher {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Teacher teacher = new Teacher();
		teacher.setId(5);
		teacher.setName("anish");
		teacher.setEmail("anish@gmail.com");
		teacher.setPhno(782134597);

		transaction.begin();
		entityManager.merge(teacher);
		transaction.commit();
		System.out.println("data updated");
	}
}
