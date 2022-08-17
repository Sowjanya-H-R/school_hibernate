package com.ty.student.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Teacher;

public class TeacherMain {
public static void main(String[] args) {
	Teacher teacher=new Teacher();
	teacher.setId(5);
	teacher.setName("padma");
	teacher.setEmail("padma@gmail.com");
	teacher.setPhno(789777222);
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=factory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(teacher);
	transaction.commit();
}
}
