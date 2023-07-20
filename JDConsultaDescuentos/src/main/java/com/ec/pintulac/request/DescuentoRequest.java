package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescuentoRequest {
	@JsonProperty("Nom ajuste 1")
	public String nomAjuste1;
	@JsonProperty("Fecha vto 1")
	public String fechaVto1;
	@JsonProperty("Clasf mcía 1")
	public String clasfMcía1;
	@JsonProperty("LITM")
	public String lITM;

	public DescuentoRequest() {
		super();
	}

	public DescuentoRequest(String nomAjuste1, String fechaVto1, String clasfMcía1, String lITM) {
		super();
		this.nomAjuste1 = nomAjuste1;
		this.fechaVto1 = fechaVto1;
		this.clasfMcía1 = clasfMcía1;
		this.lITM = lITM;
	}

	public String getNomAjuste1() {
		return nomAjuste1;
	}

	public void setNomAjuste1(String nomAjuste1) {
		this.nomAjuste1 = nomAjuste1;
	}

	public String getFechaVto1() {
		return fechaVto1;
	}

	public void setFechaVto1(String fechaVto1) {
		this.fechaVto1 = fechaVto1;
	}

	public String getClasfMcía1() {
		return clasfMcía1;
	}

	public void setClasfMcía1(String clasfMcía1) {
		this.clasfMcía1 = clasfMcía1;
	}

	public String getlITM() {
		return lITM;
	}

	public void setlITM(String lITM) {
		this.lITM = lITM;
	}

}
