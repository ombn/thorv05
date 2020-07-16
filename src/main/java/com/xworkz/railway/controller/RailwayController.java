package com.xworkz.railway.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//http://localhost:8080/xorkz/book.odc
@Component
@RequestMapping("/")
public class RailwayController {

	public RailwayController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	

	@RequestMapping(value = "/book.odc", method = RequestMethod.POST)
	public String onBook() {
		System.out.println("invoked onBook");

		System.out.println("sending respose to index.jsp");

		 return "Success";

		
	}

	@RequestMapping(value = "/create.odc", method = RequestMethod.POST)
	public String onCreate() {
		System.out.println("invoked onBook");

		System.out.println("sending respose to index.jsp");
		return "index";
	}
}
