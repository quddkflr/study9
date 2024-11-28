package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController5 {
	
	//http://localhost:9000/if_exam
	@GetMapping("/if_exam")
	public String if_exam(Model model) {
		model.addAttribute("count0",0);
		model.addAttribute("count10",10);
		return "/test5/if_exam";
	}
	
	@GetMapping("/with")
	public String with(Model model) {
		//Thymeleaf에서는 일반적으로 문자열에서 숫자로의 자동 변환을 지원하지 않습니다.
		//데이터가 스트링이면 오류 발생합니다.
		//num=${listcount-(page-1)*limit}
		
		model.addAttribute("listcount",10);
		model.addAttribute("page",1);
		model.addAttribute("limit",10);
		
		return "/test5/with";
	}
}
