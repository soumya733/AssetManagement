package com.asset.assetmanagement1.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message =  "Role Can't be Empty")
	private String role;
	
	@NotBlank(message =  "FirstName Can't be Empty")
	private String firstName;
	
	@NotBlank(message =  "LastName Can't be Empty")
	private String lastName;

	@Email(message =  "Invalid Email")
	private String email;

	@NotBlank(message =  "Password Can't be Empty")
	private String password;

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
		return String.format("EmployeeDTO [role=%s, fristName=%s, lastName=%s, email=%s, password=%s]", role, firstName,
				lastName, email, password);
	}

}