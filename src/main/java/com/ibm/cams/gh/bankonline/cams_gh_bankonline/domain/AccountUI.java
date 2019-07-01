package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

public class AccountUI {
	private String id;
	private String firstname;
    private String lastname;
    
    public AccountUI() {
	}

	public AccountUI(String id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

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
	
	public String toString() {
		return String.format("Account[id='%s', firstname='%s', lastname='%s']", id, firstname, lastname);
		
	}
}
