package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExistenciasResumidasRequest {
	
	@JsonProperty("Code_Sku")
    private String codeSku;

    @JsonProperty("Code_Agencia")
    private String codeAgencia;

    @JsonProperty("Fecha_Actualizacion")
    private String fechaActualizacion;

    @JsonProperty("Hora")
    private String hora;

	public ExistenciasResumidasRequest() {
		super();
	}

	public String getCodeSku() {
		return codeSku;
	}

	public void setCodeSku(String codeSku) {
		this.codeSku = codeSku;
	}

	public String getCodeAgencia() {
		return codeAgencia;
	}

	public void setCodeAgencia(String codeAgencia) {
		this.codeAgencia = codeAgencia;
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
    
    
    
}
