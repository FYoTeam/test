package com.tototwo.controller.register.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	@RequestMapping("/hello")
	public String helloWord() {
		return "hello-word";
	}

}
