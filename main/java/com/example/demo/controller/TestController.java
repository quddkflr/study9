package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;

@Controller
public class TestController {
	
	@RequestMapping("/sample1") //http://localhost:9000/sample1
	public String sample1(Model model) {
		model.addAttribute("data", "hello!!");
		return "test1/sample1";
	}
	
	//http://localhost:9000/sample2?memo=lunch
	@RequestMapping("/sample2") 
	public String sample2(Model model) {
		model.addAttribute("data", "hello2!!");
		model.addAttribute("data2","오늘도 행복한 하루 되세요~");
		return "test1/sample2";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		Member member = new Member();
		member.setId("홍길동1");
		member.setPassword("비번1");
		
		Member member2 = new Member();
		member2.setId("홍길동2");
		member2.setPassword("비번2");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		list.add(member2);
		
		model.addAttribute("list", list);
		return "test1/list";
	}
	
	@RequestMapping("/list2")
	public String list2(Model model) {
		Member member = new Member();
		member.setId("user1");
		member.setPassword("user1_pass");
		
		Member member2 = new Member();
		member2.setId("user2");
		member2.setPassword("user2_pass");
		
		Member member3 = new Member();
		member3.setId("user3");
		member3.setPassword("user3_pass");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(member);
		list.add(member2);
		list.add(member3);
		
		model.addAttribute("list", list);
		return "test1/list2";
	}
}
