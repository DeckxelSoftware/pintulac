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

public class PrPais implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String paCodigo;
   
    private String paNombre;
  
    private String paNaciona;
    
    private String estado;
 
    private String paCodsri;
    

    public PrPais() {
    }

    public PrPais(String paCodigo) {
        this.paCodigo = paCodigo;
    }

    public PrPais(String paCodigo, String paNombre, String paNaciona) {
        this.paCodigo = paCodigo;
        this.paNombre = paNombre;
        this.paNaciona = paNaciona;
    }

    public String getPaCodigo() {
        return paCodigo;
    }

    public void setPaCodigo(String paCodigo) {
        this.paCodigo = paCodigo;
    }

    public String getPaNombre() {
        return paNombre;
    }

    public void setPaNombre(String paNombre) {
        this.paNombre = paNombre;
    }

    public String getPaNaciona() {
        return paNaciona;
    }

    public void setPaNaciona(String paNaciona) {
        this.paNaciona = paNaciona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaCodsri() {
        return paCodsri;
    }

    public void setPaCodsri(String paCodsri) {
        this.paCodsri = paCodsri;
    }

   
}
