package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController6 {
	
	//http://localhost:9000/paging
	@GetMapping("/paging")
	public String paging(Model model, @RequestParam(value="page", defaultValue="1") int page) {
		
		model.addAttribute("page",page);
		model.addAttribute("startpage", 1);
		model.addAttribute("endpage", 10);
		model.addAttribute("maxpage", 10);
		return "/test6/paging";
	}
	//http://localhost:9000/paging2
		@GetMapping("/paging2")
		public String paging2(Model model, @RequestParam(value="page", defaultValue="1") int page) {
			
			model.addAttribute("page",page);
			model.addAttribute("startpage", 1);
			model.addAttribute("endpage", 10);
			model.addAttribute("maxpage", 10);
			return "/test6/paging2";
		}
	
}
