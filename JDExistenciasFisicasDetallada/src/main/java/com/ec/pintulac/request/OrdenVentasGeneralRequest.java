package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenVentasGeneralRequest {
	@JsonProperty("Nº hoja acopio 1")
    private String nHojaAcopio1;

    @JsonProperty("Cía orden 1")
    private String ciaOrden1;

    @JsonProperty("Tp ord 1")
    private String tpOrd1;

    @JsonProperty("Número orden 1")
    private String numeroOrden1;

    @JsonProperty("Referencia  1")
    private String referencia1;

	public String getnHojaAcopio1() {
		return nHojaAcopio1;
	}

	public void setnHojaAcopio1(String nHojaAcopio1) {
		this.nHojaAcopio1 = nHojaAcopio1;
	}

	public String getCiaOrden1() {
		return ciaOrden1;
	}

	public void setCiaOrden1(String ciaOrden1) {
		this.ciaOrden1 = ciaOrden1;
	}

	public String getTpOrd1() {
		return tpOrd1;
	}

	public void setTpOrd1(String tpOrd1) {
		this.tpOrd1 = tpOrd1;
	}

	public String getNumeroOrden1() {
		return numeroOrden1;
	}

	public void setNumeroOrden1(String numeroOrden1) {
		this.numeroOrden1 = numeroOrden1;
	}

	public String getReferencia1() {
		return referencia1;
	}

	public void setReferencia1(String referencia1) {
		this.referencia1 = referencia1;
	}
    
    
}
