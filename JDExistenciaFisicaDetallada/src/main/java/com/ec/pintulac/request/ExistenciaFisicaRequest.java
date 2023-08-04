package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExistenciaFisicaRequest {
	@JsonProperty("Code_Sku")
	public String code_Sku;
	@JsonProperty("Code_Agencia")
	public String code_Agencia;
	@JsonProperty("Fecha_Actualizacion")
	public String fecha_Actualizacion;
	@JsonProperty("Hora")
	public String hora;

	public String getCode_Sku() {
		return code_Sku;
	}

	public void setCode_Sku(String code_Sku) {
		this.code_Sku = code_Sku;
	}

	public String getCode_Agencia() {
		return code_Agencia;
	}

	public void setCode_Agencia(String code_Agencia) {
		this.code_Agencia = code_Agencia;
	}

	public String getFecha_Actualizacion() {
		return fecha_Actualizacion;
	}

	public void setFecha_Actualizacion(String fecha_Actualizacion) {
		this.fecha_Actualizacion = fecha_Actualizacion;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}
