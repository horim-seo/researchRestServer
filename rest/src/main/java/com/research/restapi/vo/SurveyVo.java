package com.research.restapi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
@Getter
@Setter
public class SurveyVo {
	
	// 제목
	private String surveyTitle;

	// 설명
	private String surveyDescription;

	// 사용자
	private String surveyRegUser;

	// 상태
	private String surveyState;

	// 최초입력시간
	private String surveyRegDt;

	// 업데이트입력시간
	private String surveyUpdateDt;

	// 시작일시
	private String surveyStartDt;

	// 종료일시
	private String surveyEndDt;

	// 사용자 ID
	private String surveyId;

	// 타겟층
	private String surveyTarget;
	
}
