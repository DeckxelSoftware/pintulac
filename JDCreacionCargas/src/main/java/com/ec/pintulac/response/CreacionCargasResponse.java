package com.ec.pintulac.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreacionCargasResponse {
	@JsonProperty("Nº carga")
	public int n_carga;
	public String jde__status;
	public Date jde__startTimestamp;
	public Date jde__endTimestamp;
	public double jde__serverExecutionSeconds;
}
