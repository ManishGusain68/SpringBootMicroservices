package com.contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.entity.Contact;
import com.contacts.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
@Autowired
	public ContactService contactService;
	
	@GetMapping("/{contactId}")
	public Contact getContact(@PathVariable("contactId") int id)
	{return contactService.getContactById(id);
		
	}
}
