package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.Loginservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
@Controller
public class LoginController {
	@Autowired
	Loginservice loginservice;
	
	
	//@ResponseBody
	@RequestMapping("/h")
	public String sayHi() {
		
		String response = "index";
		
		
		
		return response;
	}
	
	//@ResponseBody
	@RequestMapping("/signup")
public String sayHello() {
		
		return "signup";
	}
	//@ResponseBody
	@RequestMapping("/signin")
	public String say() {
		return "signin";
	}
	@RequestMapping("/create-user")
	public String createUser(HttpServletRequest incomingRequest, Model model) {
		String email = incomingRequest.getParameter("email");
		String password = incomingRequest.getParameter("password");
		String confirmPassword = incomingRequest.getParameter("confirm-password");
		String dob = incomingRequest.getParameter("dob");
		
		System.out.println(String.format(" Details are email %s and password is %s and confirm password is %s and dob is %s ",email,password,confirmPassword,dob));
				User u=new User(email,password);
				loginservice.signupuser(u);
				
				
		

		
		
		return "travel-book";
	}

	}
