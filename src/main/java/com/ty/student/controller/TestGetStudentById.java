package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.student.dto.Student;

public class TestGetStudentById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Student student = entityManager.find(Student.class, 3);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("id doesnot exist");

		}

	}
}
