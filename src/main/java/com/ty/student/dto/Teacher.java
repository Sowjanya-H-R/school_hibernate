package com.ty.student.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private String email;
	private long phno;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}



}
