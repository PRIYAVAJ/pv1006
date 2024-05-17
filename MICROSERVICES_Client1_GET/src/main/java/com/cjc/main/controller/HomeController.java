package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServiceI;

@RestController
public class HomeController 
{       
	 @Autowired
	     StudentServiceI ssi;

	@GetMapping("/getm")
	public String getme()
	{
	return "done"
		}
		@GetMapping("/getAllData")
		public Iterable<Student>getAllData()
		{
			         Iterable<Student>list =ssi.getAllData();
			         return list;
		}
		
	}

