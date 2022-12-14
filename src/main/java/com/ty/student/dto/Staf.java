package com.ty.student.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staf {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDateTime doj;
	private LocalTime birthTime;
	private LocalDate birtDate;

	@Override
	public String toString() {
		return "Staf [id=" + id + ", name=" + name + ", doj=" + doj + ", birthTime=" + birthTime + ", birtDate="
				+ birtDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDoj() {
		return doj;
	}

	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}

	public LocalTime getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(LocalTime birthTime) {
		this.birthTime = birthTime;
	}

	public LocalDate getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(LocalDate birtDate) {
		this.birtDate = birtDate;
	}

}
