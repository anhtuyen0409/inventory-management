package com.nguyenanhtuyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpring {
	@GetMapping("/hello")
	public String Index() {
		return "index";
	}
}