package com.example.springbootTry.springbootTrying;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/class1")
@RestController
public class class1 {
	
	@GetMapping("/test1")
	public String test1() {
		return "Hiiii....class1...test1..GET";
	}
	
	@GetMapping("/test2/{name}")
	public String test2(@PathVariable("name")String name) {
		return "Hiiii....class2...test2..GET"+name;
	}
	
	@GetMapping("/test3/{name}")
	public ResponseEntity test3(@PathVariable("name")String name) {
		return new ResponseEntity("Hiiii....class2...test2..GET"+name,HttpStatus.OK);
	}
	
	

}
