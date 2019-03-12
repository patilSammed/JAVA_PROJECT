package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	
	@GetMapping("/user/login")
	public Boolean login()
	{
		return true;
	}

}
