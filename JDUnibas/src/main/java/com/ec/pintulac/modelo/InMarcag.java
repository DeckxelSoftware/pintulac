/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.pintulac.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "IN_MARCAG")
public class InMarcag implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GM_CODIGO")
    private String gmCodigo;
    @Basic(optional = false)
    @Column(name = "EM_CODIGO")
    private String emCodigo;
    @Basic(optional = false)
    @Column(name = "GM_DESCRI")
    private String gmDescri;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "GM_GRUPO")
    private String gmGrupo;
    @Column(name = "GM_ABC")
    private String gmAbc;
    @Column(name = "WMS_CODIGO")
    private String wmsCodigo;
    @Column(name = "WMS_ESTADO")
    private String wmsEstado;
    @Column(name = "STS_MVENDOR")
    private String stsMvendor;
    @JsonIgnore
    @OneToMany(mappedBy = "gmCodigo")
    private Collection<InMarcas> inMarcasCollection;

    public InMarcag() {
    }

    public InMarcag(String gmCodigo) {
        this.gmCodigo = gmCodigo;
    }

    public InMarcag(String gmCodigo, String emCodigo, String gmDescri) {
        this.gmCodigo = gmCodigo;
        this.emCodigo = emCodigo;
        this.gmDescri = gmDescri;
    }

    public String getGmCodigo() {
        return gmCodigo;
    }

    public void setGmCodigo(String gmCodigo) {
        this.gmCodigo = gmCodigo;
    }

    public String getEmCodigo() {
        return emCodigo;
    }

    public void setEmCodigo(String emCodigo) {
        this.emCodigo = emCodigo;
    }

    public String getGmDescri() {
        return gmDescri;
    }

    public void setGmDescri(String gmDescri) {
        this.gmDescri = gmDescri;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGmGrupo() {
        return gmGrupo;
    }

    public void setGmGrupo(String gmGrupo) {
        this.gmGrupo = gmGrupo;
    }

    public String getGmAbc() {
        return gmAbc;
    }

    public void setGmAbc(String gmAbc) {
        this.gmAbc = gmAbc;
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
