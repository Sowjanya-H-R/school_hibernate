package com.ty.student.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Staf;

public class TestSaveStaf {
	public static void main(String[] args) {
		Staf staf = new Staf();
		staf.setName("jagruthi");
		LocalDateTime dateTime = LocalDateTime.of(2021, 8, 20, 12, 11);
		staf.setDoj(dateTime);
		LocalTime time = LocalTime.of(9, 30);
		staf.setBirthTime(time);
		LocalDate date = LocalDate.of(2000, 06, 02);
		staf.setBirtDate(date);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(staf);
		transaction.commit();

	}
}
