package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ADDTest {

@RequestMapping("/add")	
	public String add ()
	{
	return "hi..";
	}
}
