package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Teacher;

public class TestGetTeacherById {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 6);
		if (teacher != null) {
			System.out.println(teacher);
		} else {
			System.out.println("id doesnot exist");

		}
	}
}
