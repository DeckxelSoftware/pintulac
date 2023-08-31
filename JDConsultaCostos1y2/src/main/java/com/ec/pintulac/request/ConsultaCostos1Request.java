package com.ec.pintulac.request;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCostos1Request {
	
	@JsonProperty("Costos")
	private List<Item> costos;
	
	

	public ConsultaCostos1Request() {
		super();
	}

	public List<Item> getCostos() {
		return costos;
	}

	public void setCostos(List<Item> costos) {
		this.costos = costos;
	}
	
	
}
