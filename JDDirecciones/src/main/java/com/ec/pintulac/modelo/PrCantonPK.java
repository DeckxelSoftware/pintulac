/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.pintulac.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 *
 * @author Darwin
 */
@Embeddable
public class PrCantonPK implements Serializable {

  
    private String paCodigo;
   
    private String poCodigo;

    private String ctCodigo;

    public PrCantonPK() {
    }

    public PrCantonPK(String paCodigo, String poCodigo, String ctCodigo) {
        this.paCodigo = paCodigo;
        this.poCodigo = poCodigo;
        this.ctCodigo = ctCodigo;
    }

    public String getPaCodigo() {
        return paCodigo;
    }

    public void setPaCodigo(String paCodigo) {
        this.paCodigo = paCodigo;
    }

    public String getPoCodigo() {
        return poCodigo;
    }

    public void setPoCodigo(String poCodigo) {
        this.poCodigo = poCodigo;
    }

    public String getCtCodigo() {
        return ctCodigo;
    }

    public void setCtCodigo(String ctCodigo) {
        this.ctCodigo = ctCodigo;
    }

 
}
