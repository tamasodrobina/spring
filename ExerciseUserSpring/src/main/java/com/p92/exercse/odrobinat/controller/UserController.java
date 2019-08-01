package com.p92.exercse.odrobinat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.p92.exercse.odrobinat.domain.User;
import com.p92.exercse.odrobinat.repository.UserRepository;

@Controller
public class UserController
{
	@Autowired
	UserRepository userRepository;


	@RequestMapping("/users")
	public List<User> users()
	{
		return getAllUsers();
	}

	private List<User> getAllUsers()
	{
		List<User> users = userRepository.findAll();
		return users;
	}

}
