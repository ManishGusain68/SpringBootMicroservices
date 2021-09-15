package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "usersdata")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_Id")
	private int userid;
	private String name;
	private String phone;
	@Transient	
	private Contacts contact;
		
	

	public User(int userid, String name, String phone) {
		this.userid = userid;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

  
	public Contacts getContact() {
	return contact;
}

public void setContact(Contacts contact) {
	this.contact = contact;
}
	
	
	
	public long getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}
