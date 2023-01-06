package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.controller.COSTANTS;
import com.entity.User;
@Repository
public class Loginservicerepositoryimpl implements Loginservicerepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void signupuser(User user) {
		// TODO Auto-generated method stub
		int rowCount = jdbcTemplate.update("INSERT INTO nani VALUES (?, ?)",user.getEmail(),user.getPassword());
		System.out.println("row inserted");
		
	}

}
