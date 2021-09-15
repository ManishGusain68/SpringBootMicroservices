package com.contacts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Contact_id")
	private int id;
	private String bemail;
	private String contactname;
	
	public Contact(int id, String bemail, String contactname) {
		this.id = id;
		this.bemail = bemail;
		this.contactname = contactname;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return bemail;
	}
	public void setEmail(String email) {
		this.bemail = email;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	
	

}
