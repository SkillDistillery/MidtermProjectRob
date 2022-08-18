package com.skilldistillery.petfinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.skilldistillery.petfinder.data.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDao;

}
