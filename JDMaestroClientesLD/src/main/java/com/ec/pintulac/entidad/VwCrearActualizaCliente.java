package com.ec.pintulac.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_JDE_IN_CREA_ACTU_CLIEN")
public class VwCrearActualizaCliente {
	@Id
	@Column(name = "FACTURA")
	private String factura;

	@Column(name = "RUC")
	private String ruc;

	@Column(name = "DATO_JSON")
	private String datoJson;

	public VwCrearActualizaCliente() {
		super();
	}

	public VwCrearActualizaCliente(String factura, String datoJson) {
		super();
		this.factura = factura;
		this.datoJson = datoJson;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public String getDatoJson() {
		return datoJson;
	}

	public void setDatoJson(String datoJson) {
		this.datoJson = datoJson;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

}
