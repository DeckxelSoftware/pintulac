package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsutasPreciosItemResponse {

	@JsonProperty("SD Consulta P4106")
	private P4106DataWrapper p4106DataWrapper;

	public ConsutasPreciosItemResponse() {
		super();
	}

	public P4106DataWrapper getP4106DataWrapper() {
		return p4106DataWrapper;
	}

	public void setP4106DataWrapper(P4106DataWrapper p4106DataWrapper) {
		this.p4106DataWrapper = p4106DataWrapper;
	}
	
	
}
