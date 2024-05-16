package com.cjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping("/getAdmis")
	public String preLogin()
	{
		return "Welcome to Admission";
	}

}
