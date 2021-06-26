package com.research.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.restapi.service.ResearchService;

@RestController 
@RequestMapping("/api/research")
public class ResearchController {
	
	@Autowired 
	ResearchService researchService;
	
	
	@GetMapping("/members") 
	public String getMember() { 
		String member = null; 
		
		try { 
			member = researchService.getMember(); 
		} catch (Exception e) { 
			member = "����"; 
		} 
		
		return new String("Member ��ȸ : "+member); 
	} 
	
	@PostMapping("/members") 
	public String addMember() { 
		return new String("Member �߰�"); 
	} 
	
	@PutMapping("/members") 
	public String modMember() { 
		return new String("Member ����"); 
	} 
	
	@DeleteMapping("/members/{id}") 
	public String delMember(@PathVariable("id") String id) { 
		return new String("Member ���� : id"+id); 
	}

}
