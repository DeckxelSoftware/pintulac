/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.pintulac.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "IN_UNIBAS")
public class InUnibas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UB_CODIGO")
    private String ubCodigo;
    @Basic(optional = false)
    @Column(name = "UB_NOMBRE")
    private String ubNombre;
    @Basic(optional = false)
    @Column(name = "UB_SIGLA")
    private String ubSigla;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "UB_MEDIDA")
    private String ubMedida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UB_CANTID")
    private BigDecimal ubCantid;
    @Column(name = "WMS_CODIGO")
    private String wmsCodigo;
    @Column(name = "WMS_ESTADO")
    private String wmsEstado;
    @Column(name = "STS_MVENDOR")
    private String stsMvendor;
   

    public InUnibas() {
    }

    public InUnibas(String ubCodigo) {
        this.ubCodigo = ubCodigo;
    }

    public InUnibas(String ubCodigo, String ubNombre, String ubSigla) {
        this.ubCodigo = ubCodigo;
        this.ubNombre = ubNombre;
        this.ubSigla = ubSigla;
    }

    public String getUbCodigo() {
        return ubCodigo;
    }

    public void setUbCodigo(String ubCodigo) {
        this.ubCodigo = ubCodigo;
    }

    public String getUbNombre() {
        return ubNombre;
    }

    public void setUbNombre(String ubNombre) {
        this.ubNombre = ubNombre;
    }

    public String getUbSigla() {
        return ubSigla;
    }

    public void setUbSigla(String ubSigla) {
        this.ubSigla = ubSigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbMedida() {
        return ubMedida;
    }

    public void setUbMedida(String ubMedida) {
        this.ubMedida = ubMedida;
    }

    public BigDecimal getUbCantid() {
        return ubCantid;
    }

    public void setUbCantid(BigDecimal ubCantid) {
        this.ubCantid = ubCantid;
    }

    public String getWmsCodigo() {
        return wmsCodigo;
    }

    public void setWmsCodigo(String wmsCodigo) {
        this.wmsCodigo = wmsCodigo;
    }

	public String getWmsEstado() {
		return wmsEstado;
	}

	public void setWmsEstado(String wmsEstado) {
		this.wmsEstado = wmsEstado;
	}

	public String getStsMvendor() {
		return stsMvendor;
	}

	public void setStsMvendor(String stsMvendor) {
		this.stsMvendor = stsMvendor;
	}

    
}
