/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.pintulac.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "IN_MARCAS")

public class InMarcas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MR_CODIGO")
    private String mrCodigo;
    @Basic(optional = false)
    @Column(name = "EM_CODIGO")
    private String emCodigo;
    @Basic(optional = false)
    @Column(name = "MR_DESCRI")
    private String mrDescri;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "MR_ESTADO")
    private String mrEstado;
    @Column(name = "MR_CAT")
    private String mrCat;
    @Column(name = "STS_MVENDOR")
    private String stsMvendor;
    @JoinColumn(name = "GM_CODIGO", referencedColumnName = "GM_CODIGO")
    @ManyToOne
    private InMarcag gmCodigo;
   

    public InMarcas() {
    }

    public InMarcas(String mrCodigo) {
        this.mrCodigo = mrCodigo;
    }

    public InMarcas(String mrCodigo, String emCodigo, String mrDescri) {
        this.mrCodigo = mrCodigo;
        this.emCodigo = emCodigo;
        this.mrDescri = mrDescri;
    }

    public String getMrCodigo() {
        return mrCodigo;
    }

    public void setMrCodigo(String mrCodigo) {
        this.mrCodigo = mrCodigo;
    }

    public String getEmCodigo() {
        return emCodigo;
    }

    public void setEmCodigo(String emCodigo) {
        this.emCodigo = emCodigo;
    }

    public String getMrDescri() {
        return mrDescri;
    }

    public void setMrDescri(String mrDescri) {
        this.mrDescri = mrDescri;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMrEstado() {
        return mrEstado;
    }

    public void setMrEstado(String mrEstado) {
        this.mrEstado = mrEstado;
    }

	public String getMrCat() {
		return mrCat;
	}

	public void setMrCat(String mrCat) {
		this.mrCat = mrCat;
	}

	public String getStsMvendor() {
		return stsMvendor;
	}

	public void setStsMvendor(String stsMvendor) {
		this.stsMvendor = stsMvendor;
	}

	public InMarcag getGmCodigo() {
		return gmCodigo;
	}

	public void setGmCodigo(InMarcag gmCodigo) {
		this.gmCodigo = gmCodigo;
	}

   
    
}
