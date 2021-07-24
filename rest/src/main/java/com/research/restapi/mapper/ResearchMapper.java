package com.research.restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.research.restapi.vo.SurveyVo;

@Mapper
public interface ResearchMapper {
	
	List<SurveyVo> getSurveyList(SurveyVo surveyVo);
	
}
