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
	@Column(name = "ID_VW_VENTAS_POS")
	private Integer idVwVentasPos;

	@Column(name = "XXX")
	private String xxx;

	public VwJdeVentasPos() {
		super();
	}

	public VwJdeVentasPos(Integer idVwVentasPos, String xxx) {
		super();
		this.idVwVentasPos = idVwVentasPos;
		this.xxx = xxx;
	}

	public Integer getIdVwVentasPos() {
		return idVwVentasPos;
	}

	public void setIdVwVentasPos(Integer idVwVentasPos) {
		this.idVwVentasPos = idVwVentasPos;
	}

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

}
