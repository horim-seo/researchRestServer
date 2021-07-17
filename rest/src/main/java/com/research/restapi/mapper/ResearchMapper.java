package com.research.restapi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.research.restapi.vo.SurveyVo;

@Repository
@Mapper
public interface ResearchMapper {
	
	public SurveyVo getSurveyList(SurveyVo surveyVo);
	
}
