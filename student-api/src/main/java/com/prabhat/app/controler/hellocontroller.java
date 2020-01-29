package com.prabhat.app.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {
	@RequestMapping("/hello")
	public String sayhi() {
		return "hi";
	}

}
