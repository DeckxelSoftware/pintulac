package com.ec.pintulac.entidad;

import java.math.BigDecimal;

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
	
	@Column(name = "NUMERO")
	private BigDecimal numero;

	@Column(name = "DATO_JSON")
	private String datoJson;
	
	@Column(name = "BO_CODIGO")
	private String BOCODIGO;
	@Column(name = "SU_CODIGO")
	private String SUCODIGO;
	@Column(name = "EP_CODIGO")
	private String EPCODIGO;
	@Column(name = "EM_CODIGO")
	private String EMCODIGO;
	@Column(name = "ES_CODIGO")
	private String ESCODIGO;
	
	

	public VwJdeVentasLogistica() {
		super();
	}

	public VwJdeVentasLogistica(String factura, String datoJson) {
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

	public String getEPCODIGO() {
		return EPCODIGO;
	}

	public void setEPCODIGO(String ePCODIGO) {
		EPCODIGO = ePCODIGO;
	}

	public String getEMCODIGO() {
		return EMCODIGO;
	}

	public void setEMCODIGO(String eMCODIGO) {
		EMCODIGO = eMCODIGO;
	}

	public String getESCODIGO() {
		return ESCODIGO;
	}

	public void setESCODIGO(String eSCODIGO) {
		ESCODIGO = eSCODIGO;
	}
	
	


}
