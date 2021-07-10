package com.research.restapi.domain;

import lombok.Data;

@Data
public class ResearchCode {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
