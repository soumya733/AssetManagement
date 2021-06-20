package com.asset.assetmanagement1.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee_details")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "employee_auto", strategy = "increment")
	@GeneratedValue(generator ="employee_auto")
	
	@Column(name="employee_id")
	private long  id;
	
	@Column(name="role")
	private String role;
	
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="password")
	private String password;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return String.format("Employee [id=%s, role=%s, firstName=%s, lastName=%s, email=%s, password=%s]", id, role,
				firstName, lastName, email, password);
	}
	

	
}