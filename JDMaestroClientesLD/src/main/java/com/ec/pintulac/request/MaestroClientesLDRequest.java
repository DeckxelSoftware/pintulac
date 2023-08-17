package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaestroClientesLDRequest {

	@JsonProperty("Numero_Cliente")
	private String numeroCliente;

	@JsonProperty("Fecha_Actualización")
	private String fechaActualizacion;

	@JsonProperty("HORA")
	private String hora;

	public MaestroClientesLDRequest() {
		super();
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
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
