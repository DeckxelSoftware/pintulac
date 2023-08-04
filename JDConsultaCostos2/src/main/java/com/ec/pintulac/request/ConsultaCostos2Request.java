package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCostos2Request {
	@JsonProperty("Fecha_actz_1")
    private String fechaActz1;

    @JsonProperty("Hora_dia_1")
    private String horaDia1;

    @JsonProperty("Bodega_Franja")
    private String bodegaFranja;

	public ConsultaCostos2Request() {
		super();
	}

	public String getFechaActz1() {
		return fechaActz1;
	}

	public void setFechaActz1(String fechaActz1) {
		this.fechaActz1 = fechaActz1;
	}

	public String getHoraDia1() {
		return horaDia1;
	}

	public void setHoraDia1(String horaDia1) {
		this.horaDia1 = horaDia1;
	}

	public String getBodegaFranja() {
		return bodegaFranja;
	}

	public void setBodegaFranja(String bodegaFranja) {
		this.bodegaFranja = bodegaFranja;
	}
    
}
