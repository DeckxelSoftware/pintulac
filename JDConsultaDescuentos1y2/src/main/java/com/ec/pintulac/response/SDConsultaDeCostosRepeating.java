package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SDConsultaDeCostosRepeating {
	@JsonProperty("SD Consulta de Costos")
    private SDConsultaDeCostos sdConsultaDeCostos;

	public SDConsultaDeCostosRepeating() {
		super();
	}

	public SDConsultaDeCostos getSdConsultaDeCostos() {
		return sdConsultaDeCostos;
	}

	public void setSdConsultaDeCostos(SDConsultaDeCostos sdConsultaDeCostos) {
		this.sdConsultaDeCostos = sdConsultaDeCostos;
	}
	
	
}
