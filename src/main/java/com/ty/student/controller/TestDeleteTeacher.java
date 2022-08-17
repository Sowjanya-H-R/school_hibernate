package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Teacher;

public class TestDeleteTeacher {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Teacher teacher = entityManager.find(Teacher.class, 3);
		if (teacher != null) {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.remove(teacher);
			System.out.println("data removed");
			transaction.commit();
		} else {
			System.out.println("data not removed");

		}
	}
}
