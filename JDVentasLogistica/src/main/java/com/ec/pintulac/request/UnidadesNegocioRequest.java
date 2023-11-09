package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnidadesNegocioRequest {
	@JsonProperty("Tipo_Unidad_de_Negocio")
	private String tipoUnidadNegocio;

	@JsonProperty("Código_Unidad_de_Negocio")
	private String codigoUnidadNegocio;

	public UnidadesNegocioRequest() {
		super();
	
	}

	public String getTipoUnidadNegocio() {
		return tipoUnidadNegocio;
	
	}

	public void setTipoUnidadNegocio(String tipoUnidadNegocio) {
		this.tipoUnidadNegocio = tipoUnidadNegocio;
	}

	public String getCodigoUnidadNegocio() {
		return codigoUnidadNegocio;
	}

	public void setCodigoUnidadNegocio(String codigoUnidadNegocio) {
		this.codigoUnidadNegocio = codigoUnidadNegocio;
	}
	
	
}
