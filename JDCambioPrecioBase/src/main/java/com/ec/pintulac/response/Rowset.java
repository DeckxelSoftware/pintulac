package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rowset {
	@JsonProperty("N_corto_articulo")
	private int nCortoArticulo;

	@JsonProperty("2_n_articulo")
	private String nArticulo;

	@JsonProperty("3_n_articulo")
	private String nArticulo3;

	@JsonProperty("UM")
	private String unidadMedida;

	@JsonProperty("Fecha_efectiva")
	private String fechaEfectiva;

	@JsonProperty("Fecha_vto")
	private String fechaVto;

	@JsonProperty("Precio_uni")
	private double precioUnitario;

	@JsonProperty("Fecha_actz")
	private String fechaActualizacion;

	@JsonProperty("Hora_dia")
	private int horaDia;

	public Rowset() {
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

	public String getnArticulo3() {
		return nArticulo3;
	}

	public void setnArticulo3(String nArticulo3) {
		this.nArticulo3 = nArticulo3;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getFechaEfectiva() {
		return fechaEfectiva;
	}

	public void setFechaEfectiva(String fechaEfectiva) {
		this.fechaEfectiva = fechaEfectiva;
	}

	public String getFechaVto() {
		return fechaVto;
	}

	public void setFechaVto(String fechaVto) {
		this.fechaVto = fechaVto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public int getHoraDia() {
		return horaDia;
	}

	public void setHoraDia(int horaDia) {
		this.horaDia = horaDia;
	}

}
