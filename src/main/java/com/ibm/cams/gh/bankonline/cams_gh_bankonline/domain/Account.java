package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account implements Serializable {

	private static final long serialVersionUID = -2343243243242432341L;
	@Id
	@Column(name = "id", unique=true, columnDefinition="VARCHAR(10)", nullable = false)
	private String id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;
	
	public Account() {
	}
	
	public Account(String id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String toString() {
		return String.format("Account[id='%s', firstname='%s', lastname='%s']", id, firstname, lastname);
	}
	
//	@Column(name = "address")
//	private String address;
//	
//	@Column(name = "gender")
//	private String gender;
//	
//	@Column(name = "birthdate")
//	private String birthdate;
//	
//	@Column(name = "username")
//	private String username;
//	
//	@Column(name = "password")
//	private String password;
//	
//	@Column(name = "role")
//	private String role;
//	
//	@Column(name = "datecreated")
//	private String datecreated;
	
	
//GETTERS & SETTERS
	 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getBirthdate() {
//		return birthdate;
//	}
//
//	public void setBirthdate(String birthdate) {
//		this.birthdate = birthdate;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	public String getDatecreated() {
//		return datecreated;
//	}
//
//	public void setDatecreated(String datecreated) {
//		this.datecreated = datecreated;
//	}

}