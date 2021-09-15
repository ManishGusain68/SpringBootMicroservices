package com.contacts.dao;

import org.springframework.data.repository.CrudRepository;

import com.contacts.entity.Contact;

public interface ContactDao extends CrudRepository<Contact,Integer> {

}
