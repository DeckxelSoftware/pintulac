package com.ec.pintulac.entidad;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_JDE_VENTA_KIT")
public class VwJdeVentaKit {
	@Id
	@Column(name = "FACTURA")
	private String factura;
	
	@Column(name = "NUMERO")
	private BigDecimal numero;

	@Column(name = "DATO_JSON")
	private String datoJson;

	public VwJdeVentaKit() {
		super();
	}

	public VwJdeVentaKit(String factura, String datoJson) {
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

	public BigDecimal getNumero() {
		return numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

	
}
