package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultasPreciosItemRequest {
	
	@JsonProperty("2_n_ artículo_1")
    private String nArticulo1;

    @JsonProperty("Hora_dia_1")
    private int horaDia1;

    @JsonProperty("Fecha_actz_1")
    private String fechaActz1;

	public ConsultasPreciosItemRequest() {
		super();
	}

	public String getnArticulo1() {
		return nArticulo1;
	}

	public void setnArticulo1(String nArticulo1) {
		this.nArticulo1 = nArticulo1;
	}

	public int getHoraDia1() {
		return horaDia1;
	}

	public void setHoraDia1(int horaDia1) {
		this.horaDia1 = horaDia1;
	}

	public String getFechaActz1() {
		return fechaActz1;
	}

	public void setFechaActz1(String fechaActz1) {
		this.fechaActz1 = fechaActz1;
	}
    
    
}
