package com.ec.pintulac.entidad;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_JDE_VENTA_POS")
public class VwJdeVentasPos {
	@Id
	@Column(name = "FACTURA")
	private String factura;

	@Column(name = "XXX")
	private String xxx;

	public VwJdeVentasPos() {
		super();
	}

	public VwJdeVentasPos(String factura, String xxx) {
		super();
		this.factura = factura;
		this.xxx = xxx;
	}

	
	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

}
