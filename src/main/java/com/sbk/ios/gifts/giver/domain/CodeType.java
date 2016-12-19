package com.sbk.ios.gifts.giver.domain;

import lombok.Getter;
import lombok.Setter;


public class CodeType {
	private Long id;
	private String typeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
