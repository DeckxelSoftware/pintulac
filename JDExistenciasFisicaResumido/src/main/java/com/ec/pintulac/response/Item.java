package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	

    @JsonProperty("EXISTENCIA_FISICA")
    private int existenciaFisica;

    @JsonProperty("FECHA_UPDATE")
    private String fechaUpdate;

    @JsonProperty("HORA")
    private String hora;

    @JsonProperty("CODEUM")
    private String codeUM;

    @JsonProperty("DES_UOM")
    private String desUOM;

    @JsonProperty("DISPONIBLE")
    private int disponible;

    @JsonProperty("COMPROMISO")
    private int compromiso;

    @JsonProperty("CODE_SKU")
    private String codeSKU;

    @JsonProperty("CODE_CORTO")
    private int codeCorto;

    @JsonProperty("DESCRIPCION_ITEM")
    private String descripcionItem;

    @JsonProperty("CODE_BODEGA")
    private String codeBodega;

    @JsonProperty("DES_BODEGA")
    private String desBodega;

    @JsonProperty("MAGENTO")
    private String magento;


	public Item() {
		super();
	}


	public int getExistenciaFisica() {
		return existenciaFisica;
	}


	public void setExistenciaFisica(int existenciaFisica) {
		this.existenciaFisica = existenciaFisica;
	}


	public String getFechaUpdate() {
		return fechaUpdate;
	}


	public void setFechaUpdate(String fechaUpdate) {
		this.fechaUpdate = fechaUpdate;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getCodeUM() {
		return codeUM;
	}


	public void setCodeUM(String codeUM) {
		this.codeUM = codeUM;
	}


	public String getDesUOM() {
		return desUOM;
	}


	public void setDesUOM(String desUOM) {
		this.desUOM = desUOM;
	}


	public int getDisponible() {
		return disponible;
	}


	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}


	public int getCompromiso() {
		return compromiso;
	}


	public void setCompromiso(int compromiso) {
		this.compromiso = compromiso;
	}


	public String getCodeSKU() {
		return codeSKU;
	}


	public void setCodeSKU(String codeSKU) {
		this.codeSKU = codeSKU;
	}


	public int getCodeCorto() {
		return codeCorto;
	}


	public void setCodeCorto(int codeCorto) {
		this.codeCorto = codeCorto;
	}


	public String getDescripcionItem() {
		return descripcionItem;
	}


	public void setDescripcionItem(String descripcionItem) {
		this.descripcionItem = descripcionItem;
	}


	public String getCodeBodega() {
		return codeBodega;
	}


	public void setCodeBodega(String codeBodega) {
		this.codeBodega = codeBodega;
	}


	public String getDesBodega() {
		return desBodega;
	}


	public void setDesBodega(String desBodega) {
		this.desBodega = desBodega;
	}


	public String getMagento() {
		return magento;
	}


	public void setMagento(String magento) {
		this.magento = magento;
	}


}
