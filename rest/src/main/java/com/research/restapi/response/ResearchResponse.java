package com.research.restapi.response;

import java.util.List;

import com.research.restapi.vo.SurveyVo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResearchResponse {
	private List<SurveyVo> surveyList;
}
