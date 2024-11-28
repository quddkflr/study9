package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;

@Controller
public class TestController3 {
	
	//http://localhost:9000/link
	@RequestMapping("/link")
	public String list(Model model) {
		Member member = new Member();
		member.setId("user1");
		member.setPassword("user1_pass");
		
		Member member2 = new Member();
		member2.setId("user2");
		member2.setPassword("user2_pass");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		list.add(member2);
		
		model.addAttribute("list", list);
		return "/test3/link";
	}
	
	@GetMapping("/view")
	public String view(Model model) {
		Member member = new Member();
		member.setId("user1");
		member.setPassword("user1_pass");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		
		model.addAttribute("list",list);
		return "/test1/list";
	}
	
	@RequestMapping("/link2")
	public String list2(Model model) {
		Member member = new Member();
		member.setId("user1");
		member.setPassword("user1_pass");
		
		Member member2 = new Member();
		member2.setId("user2");
		member2.setPassword("user2_pass");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		list.add(member2);
		
		model.addAttribute("list", list);
		return "/test3/link2";
	}
	
	@GetMapping("/view2")
	public String view2(Model model, String id) {
		Member member = new Member();
		member.setId(id);
		member.setPassword( id + "_pass");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		
		model.addAttribute("list",list);
		return "/test1/list";
	}

}
