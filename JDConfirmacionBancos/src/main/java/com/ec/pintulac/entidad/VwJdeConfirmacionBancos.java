package com.ec.pintulac.entidad;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_JDE_VENTA_POS")
public class VwJdeConfirmacionBancos {
	@Id
	@Column(name = "FACTURA")
	private String factura;

	@Column(name = "dato_json")
	private String dato_json;

	public VwJdeConfirmacionBancos() {
		super();
	}

	public VwJdeConfirmacionBancos(String factura, String dato_json) {
		super();
		this.factura = factura;
		this.dato_json = dato_json;
	}
	
	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public String getDato_json() {
		return dato_json;
	}

	public void setDato_json(String dato_json) {
		this.dato_json = dato_json;
	}

	

}