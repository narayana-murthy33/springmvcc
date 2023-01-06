package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.Loginservicerepository;
@Service
public class Loginserviceimpl implements Loginservice {
	@Autowired
	Loginservicerepository loginservicerepository;
	@Override
	public void signupuser(User user) {
		// TODO Auto-generated method stub
		loginservicerepository.signupuser(user);
		
		
	}

}
