package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	@JsonProperty("Numero_articulo")
	private String numeroArticulo;

	@JsonProperty("Metodo_costo_1")
	private String metodoCosto1;

	@JsonProperty("Unidad_negocio_1")
	private String unidadNegocio1;

	public Item() {
		super();
	}

	public String getNumeroArticulo() {
		return numeroArticulo;
	}

	public void setNumeroArticulo(String numeroArticulo) {
		this.numeroArticulo = numeroArticulo;
	}

	public String getMetodoCosto1() {
		return metodoCosto1;
	}

	public void setMetodoCosto1(String metodoCosto1) {
		this.metodoCosto1 = metodoCosto1;
	}

	public String getUnidadNegocio1() {
		return unidadNegocio1;
	}

	public void setUnidadNegocio1(String unidadNegocio1) {
		this.unidadNegocio1 = unidadNegocio1;
	}	
}
