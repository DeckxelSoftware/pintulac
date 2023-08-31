package com.ec.pintulac.entidad;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Darwin
 */
@Embeddable
public class PrSucurPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EM_CODIGO")
    private String emCodigo;
    @Basic(optional = false)
    @Column(name = "SU_CODIGO")
    private String suCodigo;

    public PrSucurPK() {
    }

    public PrSucurPK(String emCodigo, String suCodigo) {
        this.emCodigo = emCodigo;
        this.suCodigo = suCodigo;
    }

    public String getEmCodigo() {
        return emCodigo;
    }

    public void setEmCodigo(String emCodigo) {
        this.emCodigo = emCodigo;
    }

    public String getSuCodigo() {
        return suCodigo;
    }

    public void setSuCodigo(String suCodigo) {
        this.suCodigo = suCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emCodigo != null ? emCodigo.hashCode() : 0);
        hash += (suCodigo != null ? suCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrSucurPK)) {
            return false;
        }
        PrSucurPK other = (PrSucurPK) object;
        if ((this.emCodigo == null && other.emCodigo != null) || (this.emCodigo != null && !this.emCodigo.equals(other.emCodigo))) {
            return false;
        }
        if ((this.suCodigo == null && other.suCodigo != null) || (this.suCodigo != null && !this.suCodigo.equals(other.suCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.pintulac.modelo.PrSucurPK[ emCodigo=" + emCodigo + ", suCodigo=" + suCodigo + " ]";
    }
    
}
