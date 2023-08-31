package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Costo {
	@JsonProperty("N_corto_articulo")
	private int nCortoArticulo;

	@JsonProperty("2_n_articulo")
	private String n2Articulo;

	@JsonProperty("Unidad_negocio")
	private String unidadNegocio;

	@JsonProperty("Metodo_costo")
	private String metodoCosto;

	@JsonProperty("Costo_uni")
	private double costoUni;

	public Costo() {
		super();
	}

	public int getnCortoArticulo() {
		return nCortoArticulo;
	}

	public void setnCortoArticulo(int nCortoArticulo) {
		this.nCortoArticulo = nCortoArticulo;
	}

	public String getN2Articulo() {
		return n2Articulo;
	}

	public void setN2Articulo(String n2Articulo) {
		this.n2Articulo = n2Articulo;
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

	public double getCostoUni() {
		return costoUni;
	}

	public void setCostoUni(double costoUni) {
		this.costoUni = costoUni;
	}
	
	
}
