package com.user.entity;




public class Contacts {
	

	private Long id;
	private String email;
	private String contactname;
	
	
	public Contacts(Long id, String email, String contactname) {
		this.id = id;
		this.email = email;
		this.contactname = contactname;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	
	

}
