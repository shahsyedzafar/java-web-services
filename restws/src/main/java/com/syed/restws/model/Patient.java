package com.syed.restws.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="Patient")
public class Patient {
	private String id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
