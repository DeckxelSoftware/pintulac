package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnidadMedida {

	@JsonProperty("N_corto_articulo")
	private int nCortoArticulo;

	@JsonProperty("2_n_articulo")
	private String nArticulo;

	@JsonProperty("3_n_articulo")
	private String nArticulo3;

	@JsonProperty("Descripción")
	private String descripcion;

	@JsonProperty("Linea_descripcion_2")
	private String lineaDescripcion2;

	@JsonProperty("UM")
	private String um;

	@JsonProperty("D")
	private String d;

	@JsonProperty("Descripcion")
	private String descripcion2;

	@JsonProperty("Factor_conversion")
	private int factorConversion;

	@JsonProperty("UM_rel")
	private String umRel;

	@JsonProperty("Fecha_actz")
	private String fechaActz;

	@JsonProperty("Hora_dia")
	private int horaDia;

	// Constructor, getters y setters

	public UnidadMedida() {
		super();
	}

	public int getNCortoArticulo() {
		return nCortoArticulo;
	}

	public void setNCortoArticulo(int nCortoArticulo) {
		this.nCortoArticulo = nCortoArticulo;
	}

	public String getNArticulo() {
		return nArticulo;
	}

	public void setNArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}

	public String getNArticulo3() {
		return nArticulo3;
	}

	public void setNArticulo3(String nArticulo3) {
		this.nArticulo3 = nArticulo3;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLineaDescripcion2() {
		return lineaDescripcion2;
	}

	public void setLineaDescripcion2(String lineaDescripcion2) {
		this.lineaDescripcion2 = lineaDescripcion2;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getDescripcion2() {
		return descripcion2;
	}

	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
	}

	public int getFactorConversion() {
		return factorConversion;
	}

	public void setFactorConversion(int factorConversion) {
		this.factorConversion = factorConversion;
	}

	public String getUmRel() {
		return umRel;
	}

	public void setUmRel(String umRel) {
		this.umRel = umRel;
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
