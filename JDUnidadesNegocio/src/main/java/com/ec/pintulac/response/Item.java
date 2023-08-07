package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	

    @JsonProperty("DESCRIPCION")
    private String descripcion;

    @JsonProperty("AN8")
    private int an8;

    @JsonProperty("TIPO_UNIDAD_NEGOCIO")
    private String tipoUnidadNegocio;

    @JsonProperty("DESCRIPCION_TIPO_MCU")
    private String descripcionTipoMcu;

    @JsonProperty("CODIGO_UNIDAD_NEGOCIO")
    private String codigoUnidadNegocio;

    @JsonProperty("TIPO_BODEGA")
    private String tipoBodega;

    @JsonProperty("DESCRIPCION_TIPO_BODEGA")
    private String descripcionTipoBodega;

    @JsonProperty("COD_DYNASIF")
    private String codDynasif;

    @JsonProperty("DESCRIPCION_COD_DYNASIF")
    private String descripcionCodDynasif;

    @JsonProperty("ESTADO")
    private String estado;

    @JsonProperty("FECHA_ACTUALIZACION")
    private String fechaActualizacion;

    @JsonProperty("UNIDAD_RELACIONADA")
    private String unidadRelacionada;

    @JsonProperty("LATITUD")
    private String latitud;

    @JsonProperty("LONGITUD")
    private String longitud;

    @JsonProperty("DIRECCION")
    private String direccion;

    @JsonProperty("CIUDAD")
    private String ciudad;

    @JsonProperty("CODIGO_PROVINCIA")
    private String codigoProvincia;

    @JsonProperty("DESCRIPCION_PROVINCIA")
    private String descripcionProvincia;

    @JsonProperty("PAIS")
    private String pais;

	public Item() {
		super();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAn8() {
		return an8;
	}

	public void setAn8(int an8) {
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
    
    
}
