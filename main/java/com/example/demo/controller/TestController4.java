package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController4 {
	
	@GetMapping("/layout")
	public String view() {
		return "fragments/ex_layout";
	}

}
