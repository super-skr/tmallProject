package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloController {
	
	@RequestMapping("/man")
	public String hello() {
		return "man";
	}

}
