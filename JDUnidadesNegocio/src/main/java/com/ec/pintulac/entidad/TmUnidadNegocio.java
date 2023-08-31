package com.ec.pintulac.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "TM_UNIDAD_NEGOCIO")
public class TmUnidadNegocio implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUNIDADNEG")
    private BigDecimal idunidadneg;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "AN8")
    private String an8;
    @Column(name = "TIPO_UNIDAD_NEGOCIO")
    private String tipoUnidadNegocio;
    @Column(name = "DESCRIPCION_TIPO_MCU")
    private String descripcionTipoMcu;
    @Column(name = "CODIGO_UNIDAD_NEGOCIO")
    private String codigoUnidadNegocio;
    @Column(name = "TIPO_BODEGA")
    private String tipoBodega;
    @Column(name = "DESCRIPCION_TIPO_BODEGA")
    private String descripcionTipoBodega;
    @Column(name = "COD_DYNASIF")
    private String codDynasif;
    @Column(name = "DESCRIPCION_COD_DYNASIF")
    private String descripcionCodDynasif;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_ACTUALIZACION")
    private String fechaActualizacion;
    @Column(name = "UNIDAD_RELACIONADA")
    private String unidadRelacionada;
    @Column(name = "LATITUD")
    private String latitud;
    @Column(name = "LONGITUD")
    private String longitud;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "CODIGO_PROVINCIA")
    private String codigoProvincia;
    @Column(name = "DESCRIPCION_PROVINCIA")
    private String descripcionProvincia;
    @Column(name = "PAIS")
    private String pais;

    public TmUnidadNegocio() {
    }

    public TmUnidadNegocio(BigDecimal idunidadneg) {
        this.idunidadneg = idunidadneg;
    }

    public BigDecimal getIdunidadneg() {
        return idunidadneg;
    }

    public void setIdunidadneg(BigDecimal idunidadneg) {
        this.idunidadneg = idunidadneg;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAn8() {
        return an8;
    }

    public void setAn8(String an8) {
        this.an8 = an8;
    }

    public String getTipoUnidadNegocio() {
        return tipoUnidadNegocio;
    }

    public void setTipoUnidadNegocio(String tipoUnidadNegocio) {
        this.tipoUnidadNegocio = tipoUnidadNegocio;
    }

    public String getDescripcionTipoMcu() {
        return descripcionTipoMcu;
    }

    public void setDescripcionTipoMcu(String descripcionTipoMcu) {
        this.descripcionTipoMcu = descripcionTipoMcu;
    }

    public String getCodigoUnidadNegocio() {
        return codigoUnidadNegocio;
    }

    public void setCodigoUnidadNegocio(String codigoUnidadNegocio) {
        this.codigoUnidadNegocio = codigoUnidadNegocio;
    }

    public String getTipoBodega() {
        return tipoBodega;
    }

    public void setTipoBodega(String tipoBodega) {
        this.tipoBodega = tipoBodega;
    }

    public String getDescripcionTipoBodega() {
        return descripcionTipoBodega;
    }

    public void setDescripcionTipoBodega(String descripcionTipoBodega) {
        this.descripcionTipoBodega = descripcionTipoBodega;
    }

    public String getCodDynasif() {
        return codDynasif;
    }

    public void setCodDynasif(String codDynasif) {
        this.codDynasif = codDynasif;
    }

    public String getDescripcionCodDynasif() {
        return descripcionCodDynasif;
    }

    public void setDescripcionCodDynasif(String descripcionCodDynasif) {
        this.descripcionCodDynasif = descripcionCodDynasif;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUnidadRelacionada() {
        return unidadRelacionada;
    }

    public void setUnidadRelacionada(String unidadRelacionada) {
        this.unidadRelacionada = unidadRelacionada;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    public void setDescripcionProvincia(String descripcionProvincia) {
        this.descripcionProvincia = descripcionProvincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidadneg != null ? idunidadneg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TmUnidadNegocio)) {
            return false;
        }
        TmUnidadNegocio other = (TmUnidadNegocio) object;
        if ((this.idunidadneg == null && other.idunidadneg != null) || (this.idunidadneg != null && !this.idunidadneg.equals(other.idunidadneg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.pintulac.entidad.TmUnidadNegocio[ idunidadneg=" + idunidadneg + " ]";
    }
    
}
