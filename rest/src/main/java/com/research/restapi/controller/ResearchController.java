package com.research.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.restapi.service.ResearchService;
import com.research.restapi.vo.SurveyVo;

@RestController 
@RequestMapping("/research")
public class ResearchController {
	
	//localhost:1235/swagger-ui/index.html
	
	@Autowired
	ResearchService researchService;
	
	@PostMapping("/test") 
	public ResponseEntity<SurveyVo> getTest(@RequestBody SurveyVo surveyVo) { 
		
		String h = "Hello";
		
		return  new ResponseEntity<>(researchService.getSurveyList(surveyVo), HttpStatus.OK);
//		String member = null; 
//		
//		System.out.println("asfnugianeruignaeuirgnauiergniaeurnug");
//		
//		try { 
//			member = researchService.getMember(); 
//		} catch (Exception e) { 
//			member = "����"; 
//		} 
//		
//		return new String("Member ��ȸ : "+member); 
	}
	
	/*
	@GetMapping("/members") 
	public String getMember() { 
		String member = null; 
		
		System.out.println("asfnugianeruignaeuirgnauiergniaeurnug");
		
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
	*/

}
