package com.research.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.restapi.mapper.ResearchMapper;
import com.research.restapi.response.ResearchResponse;
import com.research.restapi.vo.SurveyVo;

@Service
public class ResearchServiceImpl implements ResearchService {
	
	@Autowired
	ResearchMapper researchMapper;
	
	@Override
	public ResearchResponse getSurveyList(SurveyVo surveyVo) {
		System.out.println("getSurveyList(SurveyVo surveyVo)========================================");
//		return researchMapper.getSurveyList(surveyVo);
		return ResearchResponse.builder().surveyList(researchMapper.getSurveyList(surveyVo)).build();
	}
	
}
