package com.ec.pintulac.request;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaUnidadesMedidaFechaHoraItemRequest {

	@JsonProperty("Fecha_actz_1")
    private String fechaActz;

    @JsonProperty("Hora_día")
    private String horaDia;

    @JsonProperty("N_corto_artículo_1")
    private String nCortoArticulo;

	public ConsultaUnidadesMedidaFechaHoraItemRequest() {
		super();
	}

	public String getFechaActz() {
		return fechaActz;
	}

	public void setFechaActz(String fechaActz) {
		this.fechaActz = fechaActz;
	}

	public String getHoraDia() {
		return horaDia;
	}

	public void setHoraDia(String horaDia) {
		this.horaDia = horaDia;
	}

	public String getnCortoArticulo() {
		return nCortoArticulo;
	}

	public void setnCortoArticulo(String nCortoArticulo) {
		this.nCortoArticulo = nCortoArticulo;
	}
    
    
}
