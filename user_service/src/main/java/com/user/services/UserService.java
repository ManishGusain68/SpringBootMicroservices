package com.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserRepository;
import com.user.entity.User;
@Service
public class UserService {
	@Autowired
	private UserRepository userrepo;
	
	public User getBooksById(int userid){
		User u=this.userrepo.findById(userid).get();
		return u;
	}

}
