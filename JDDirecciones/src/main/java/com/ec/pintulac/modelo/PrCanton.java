/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.pintulac.modelo;

import java.io.Serializable;

/**
 *
 * @author Darwin
 */

public class PrCanton implements Serializable {

    private static final long serialVersionUID = 1L;
    	
    protected PrCantonPK prCantonPK;
    
    private String ctNombre;
   
    private Character estado;
   
    private Character stsMvendor;
   
    private String ctCodsecue;
       private PrProv prProv;
   
    public PrCanton() {
    }

    public PrCanton(PrCantonPK prCantonPK) {
        this.prCantonPK = prCantonPK;
    }

    public PrCanton(PrCantonPK prCantonPK, String ctNombre) {
        this.prCantonPK = prCantonPK;
        this.ctNombre = ctNombre;
    }

    public PrCanton(String paCodigo, String poCodigo, String ctCodigo) {
        this.prCantonPK = new PrCantonPK(paCodigo, poCodigo, ctCodigo);
    }

    public PrCantonPK getPrCantonPK() {
        return prCantonPK;
    }

    public void setPrCantonPK(PrCantonPK prCantonPK) {
        this.prCantonPK = prCantonPK;
    }

    public String getCtNombre() {
        return ctNombre;
    }

    public void setCtNombre(String ctNombre) {
        this.ctNombre = ctNombre;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Character getStsMvendor() {
        return stsMvendor;
    }

    public void setStsMvendor(Character stsMvendor) {
        this.stsMvendor = stsMvendor;
    }

    public String getCtCodsecue() {
        return ctCodsecue;
    }

    public void setCtCodsecue(String ctCodsecue) {
        this.ctCodsecue = ctCodsecue;
    }

    public PrProv getPrProv() {
        return prProv;
    }

    public void setPrProv(PrProv prProv) {
        this.prProv = prProv;
    }

   
}
