package com.research.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.research.restapi.mapper.ResearchMapper;
import com.research.restapi.service.ResearchService;

public class ResearchServiceImpl implements ResearchService{
	
	@Autowired 
	ResearchMapper mapper; 
	
	@Override 
	public String getMember() throws Exception { 
		return mapper.getMember(); 
	}

}
