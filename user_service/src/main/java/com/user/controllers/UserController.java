package com.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contacts;
import com.user.entity.User;
import com.user.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	public UserService userservice;
	@Autowired
	private RestTemplate restTemplate;

@GetMapping("/{userId}")
	
public User getUsers(@PathVariable("userId") int userid)
{
	User user=this.userservice.getBooksById(userid);
	
	Contacts con= restTemplate.getForObject("http://CONTACT-SERVICE/contact/"+user.getUserid(), Contacts.class);
	user.setContact(con);
	return user;
	
}

}
