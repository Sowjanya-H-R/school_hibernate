package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Student;

public class StudentMain {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(2);
		student.setName("soonu");
		student.setAge(15);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		System.out.println("data stored");
	}
}
