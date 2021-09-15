package com.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.dao.ContactDao;
import com.contacts.entity.Contact;
@Service
public class ContactService {
	@Autowired
	public ContactDao contactdao;

	

	public Contact getContactById(int id) {
		Contact contactDetail= contactdao.findById(id).get();
		return contactDetail;
		
		
	}

}
