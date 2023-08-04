package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaDeCostos {
	@JsonProperty("N_corto_articulo")
	private int nCortoArticulo;

	@JsonProperty("2_n_artíiulo")
	private String nArticulo;

	@JsonProperty("Unidad_negocio")
	private String unidadNegocio;

	@JsonProperty("Metodo_costo")
	private String metodoCosto;

	@JsonProperty("Costo_uni")
	private double costoUnitario;

	@JsonProperty("Fecha_actz")
	private String fechaActz;

	@JsonProperty("Hora_dia")
	private int horaDia;

	public ConsultaDeCostos() {
		super();
	}

	public int getnCortoArticulo() {
		return nCortoArticulo;
	}

	public void setnCortoArticulo(int nCortoArticulo) {
		this.nCortoArticulo = nCortoArticulo;
	}

	public String getnArticulo() {
		return nArticulo;
	}

	public void setnArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}

	public String getUnidadNegocio() {
		return unidadNegocio;
	}

	public void setUnidadNegocio(String unidadNegocio) {
		this.unidadNegocio = unidadNegocio;
	}

	public String getMetodoCosto() {
		return metodoCosto;
	}

	public void setMetodoCosto(String metodoCosto) {
		this.metodoCosto = metodoCosto;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	public String getFechaActz() {
		return fechaActz;
	}

	public void setFechaActz(String fechaActz) {
		this.fechaActz = fechaActz;
	}

	public int getHoraDia() {
		return horaDia;
	}

	public void setHoraDia(int horaDia) {
		this.horaDia = horaDia;
	}
	
	
}
