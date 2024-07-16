package com.learn.movie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HomeController {
	
	 @GetMapping("/")
	    public String sayHello() {
	        return "Hello";
	    }
	 
	 @GetMapping("/home")
	 public String getHello()
	 {
		 return "Returning from getHellooMethod";
	 }
	 
}
