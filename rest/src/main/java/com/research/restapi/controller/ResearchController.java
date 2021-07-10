package com.research.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.restapi.service.ResearchService;

@RestController 
@RequestMapping("/research")
public class ResearchController {
	
	@Autowired 
	ResearchService researchService;
	
	@PostMapping("/test") 
	public String getTest() { 
		
		return "hello";
//		String member = null; 
//		
//		System.out.println("asfnugianeruignaeuirgnauiergniaeurnug");
//		
//		try { 
//			member = researchService.getMember(); 
//		} catch (Exception e) { 
//			member = "없음"; 
//		} 
//		
//		return new String("Member 조회 : "+member); 
	}
	
	/*
	@GetMapping("/members") 
	public String getMember() { 
		String member = null; 
		
		System.out.println("asfnugianeruignaeuirgnauiergniaeurnug");
		
		try { 
			member = researchService.getMember(); 
		} catch (Exception e) { 
			member = "없음"; 
		} 
		
		return new String("Member 조회 : "+member); 
	} 
	
	@PostMapping("/members") 
	public String addMember() { 
		return new String("Member 추가"); 
	} 
	
	@PutMapping("/members") 
	public String modMember() { 
		return new String("Member 수정"); 
	} 
	
	@DeleteMapping("/members/{id}") 
	public String delMember(@PathVariable("id") String id) { 
		return new String("Member 삭제 : id"+id); 
	}
	*/

}
