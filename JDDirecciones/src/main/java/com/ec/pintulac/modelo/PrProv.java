/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.pintulac.modelo;

import java.io.Serializable;

public class PrProv implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrProvPK prProvPK;
  
    private String poNombre;
    
    
    private String poRegion;
    
    private String poZona;
    
    private String estado;
    
    private String poGps;
    
    private String stsMvendor;
    
    private PrPais prPais;


    public PrProv() {
    }

    public PrProv(PrProvPK prProvPK) {
        this.prProvPK = prProvPK;
    }

    public PrProv(PrProvPK prProvPK, String poNombre, String poRegion) {
        this.prProvPK = prProvPK;
        this.poNombre = poNombre;
        this.poRegion = poRegion;
    }

    public PrProv(String paCodigo, String poCodigo) {
        this.prProvPK = new PrProvPK(paCodigo, poCodigo);
    }

    public PrProvPK getPrProvPK() {
        return prProvPK;
    }

    public void setPrProvPK(PrProvPK prProvPK) {
        this.prProvPK = prProvPK;
    }

    public String getPoNombre() {
        return poNombre;
    }

    public void setPoNombre(String poNombre) {
        this.poNombre = poNombre;
    }

    public String getPoRegion() {
        return poRegion;
    }

    public void setPoRegion(String poRegion) {
        this.poRegion = poRegion;
    }

    public String getPoZona() {
        return poZona;
    }

    public void setPoZona(String poZona) {
        this.poZona = poZona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPoGps() {
        return poGps;
    }

    public void setPoGps(String poGps) {
        this.poGps = poGps;
    }

    public String getStsMvendor() {
        return stsMvendor;
    }

    public void setStsMvendor(String stsMvendor) {
        this.stsMvendor = stsMvendor;
    }

    public PrPais getPrPais() {
        return prPais;
    }

    public void setPrPais(PrPais prPais) {
        this.prPais = prPais;
    }

   
    
}
