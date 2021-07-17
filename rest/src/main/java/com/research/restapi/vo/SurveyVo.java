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
	
	// ����
	private String surveyTitle;

	// ����
	private String surveyDescription;

	// �����
	private String surveyRegUser;

	// ����
	private String surveyState;

	// �����Է½ð�
	private String surveyRegDt;

	// ������Ʈ�Է½ð�
	private String surveyUpdateDt;

	// �����Ͻ�
	private String surveyStartDt;

	// �����Ͻ�
	private String surveyEndDt;

	// ����� ID
	private String surveyId;

	// Ÿ����
	private String surveyTarget;
	
}
