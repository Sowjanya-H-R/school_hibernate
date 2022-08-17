package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Student;

public class UpdateStudentName {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Student student = new Student();
		student.setId(2);
		student.setName("sowj H");
		student.setAge(25);
		transaction.begin();
		entityManager.merge(student);
		transaction.commit();
		System.out.println("data updated");

	}
}
