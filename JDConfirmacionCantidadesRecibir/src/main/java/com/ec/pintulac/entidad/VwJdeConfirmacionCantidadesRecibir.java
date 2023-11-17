package com.ec.pintulac.entidad;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_JDE_CONFIRMAR_CANTIDAD_RECIBIR_COMPRA_LOGISTICA")
public class VwJdeConfirmacionCantidadesRecibir {
	@Id
	@Column(name = "FACTURA")
	private String factura;

	@Column(name = "dato_json")
	private String dato_json;
	
	@Column(name = "EC_CODIGO")
	private String ECCODIGO;
	@Column(name = "BO_CODIGO")
	private String BOCODIGO;
	@Column(name = "SU_CODIGO")
	private String SUCODIGO;
	@Column(name = "EM_CODIGO")
	private String EMCODIGO;
	@Column(name = "CO_NUMERO")
	private BigDecimal CONUMERO;

	public VwJdeConfirmacionCantidadesRecibir() {
		super();
	}

	public VwJdeConfirmacionCantidadesRecibir(String factura, String dato_json) {
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



	public String getBOCODIGO() {
		return BOCODIGO;
	}

	public void setBOCODIGO(String bOCODIGO) {
		BOCODIGO = bOCODIGO;
	}

	public String getSUCODIGO() {
		return SUCODIGO;
	}

	public void setSUCODIGO(String sUCODIGO) {
		SUCODIGO = sUCODIGO;
	}

	public String getEMCODIGO() {
		return EMCODIGO;
	}

	public void setEMCODIGO(String eMCODIGO) {
		EMCODIGO = eMCODIGO;
	}

	public BigDecimal getCONUMERO() {
		return CONUMERO;
	}

	public void setCONUMERO(BigDecimal cONUMERO) {
		CONUMERO = cONUMERO;
	}

	public String getECCODIGO() {
		return ECCODIGO;
	}

	public void setECCODIGO(String eCCODIGO) {
		ECCODIGO = eCCODIGO;
	}
	
	

	

}
