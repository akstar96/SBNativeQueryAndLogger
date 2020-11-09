package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
private long id;
private String fristname;
private String lastname;
private String department;
private String designation;
private int pcno;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFristname() {
	return fristname;
}
public void setFristname(String fristname) {
	this.fristname = fristname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getPcno() {
	return pcno;
}
public void setPcno(int pcno) {
	this.pcno = pcno;
}
public User(long id, String fristname, String lastname, String department, String designation, int pcno) {
	super();
	this.id = id;
	this.fristname = fristname;
	this.lastname = lastname;
	this.department = department;
	this.designation = designation;
	this.pcno = pcno;
}
public User() {
	super();
	
}
@Override
public String toString() {
	return "User [id=" + id + ", fristname=" + fristname + ", lastname=" + lastname + ", department=" + department
			+ ", designation=" + designation + ", pcno=" + pcno + "]";
}

	
	
}
