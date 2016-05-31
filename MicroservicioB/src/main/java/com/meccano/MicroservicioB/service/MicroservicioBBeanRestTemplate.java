package com.meccano.MicroservicioB.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MicroservicioBBeanRestTemplate {
	
	private Integer sumando1;
	private Integer sumando2;
	
	//Getters & Setters
	public Integer getSumando1() {
		return sumando1;
	}
	public Integer getSumando2() {
		return sumando2;
	}
	
	

}
