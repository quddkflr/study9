package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;

@Controller
public class TestController2 {
	
	//http://localhost:9000/block
	@RequestMapping("/block")
	public String list(Model model) {
		Member member = new Member();
		member.setId("사용자1");
		member.setPassword("user1_pass");
		
		Member member2 = new Member();
		member2.setId("사용자2");
		member2.setPassword("user2_pass");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		list.add(member2);
		
		model.addAttribute("list", list);
		return "/test2/block";
	}

}
