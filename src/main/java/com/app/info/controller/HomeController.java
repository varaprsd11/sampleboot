package com.app.info.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@RequestMapping("/test")
	public String test() {
		return "hello api start ";
	}

}
