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
public class PrProvPK implements Serializable {

    private String paCodigo; 
    private String poCodigo;

    public PrProvPK() {
    }

    public PrProvPK(String paCodigo, String poCodigo) {
        this.paCodigo = paCodigo;
        this.poCodigo = poCodigo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paCodigo != null ? paCodigo.hashCode() : 0);
        hash += (poCodigo != null ? poCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrProvPK)) {
            return false;
        }
        PrProvPK other = (PrProvPK) object;
        if ((this.paCodigo == null && other.paCodigo != null) || (this.paCodigo != null && !this.paCodigo.equals(other.paCodigo))) {
            return false;
        }
        if ((this.poCodigo == null && other.poCodigo != null) || (this.poCodigo != null && !this.poCodigo.equals(other.poCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.pintulac.modelo.PrProvPK[ paCodigo=" + paCodigo + ", poCodigo=" + poCodigo + " ]";
    }
    
}
