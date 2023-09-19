package com.ec.pintulac.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_JDE_VENTA_LOGISTICA")
public class VwJdeVentasLogistica {
	@Id
	@Column(name = "FACTURA")
	private String factura;

	@Column(name = "XXX")
	private String xxx;

	public VwJdeVentasLogistica() {
		super();	
	}

	public VwJdeVentasLogistica(String factura, String xxx) {
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
