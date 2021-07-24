package com.research.restapi.service;

import com.research.restapi.response.ResearchResponse;
import com.research.restapi.vo.SurveyVo;

public interface ResearchService {
	
	public ResearchResponse getSurveyList(SurveyVo surveyVo);
}
