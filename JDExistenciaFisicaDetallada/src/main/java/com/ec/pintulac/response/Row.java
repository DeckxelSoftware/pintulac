package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Row {
	  @JsonProperty("HORA") 
	    public int hora;
	    @JsonProperty("COMPROMISO") 
	    public int compromiso;
	    @JsonProperty("DISPONIBLE") 
	    public double disponible;
	    @JsonProperty("COMPROMISO_FLEXIBLE_VENTAS") 
	    public int compromisoFlexibleVentas;
	    @JsonProperty("COMPROMISO_DURO_VENTAS") 
	    public int compromisoDuroVentas;
	    @JsonProperty("CODEUM") 
	    public String codeum;
	    @JsonProperty("DES_UOM") 
	    public String desUom;
	    @JsonProperty("FECHA_UPDATE") 
	    public String fechaUpdate;
	    @JsonProperty("FECHA_UPDATE2") 
	    public String fechaUpdate2;
	    @JsonProperty("CODE_CORTO") 
	    public int codeCorto;
	    @JsonProperty("CODE_BODEGA") 
	    public String codeBodega;
	    @JsonProperty("DES_BODEGA") 
	    public String desBodega;
	    @JsonProperty("UBICACION_DEPOSITO") 
	    public String ubicacionDeposito;
	    @JsonProperty("LOTE") 
	    public String lote;
	    @JsonProperty("EXISTENCIA_FISICA") 
	    public double existenciaFisica;
	    @JsonProperty("CODE_SKU") 
	    public String codeSku;
	    @JsonProperty("CODE_SKU3") 
	    public String codeSku3;
	    @JsonProperty("DESCRIPCION_ITEM") 
	    public String descriptionItem;
		public int getHora() {
			return hora;
		}
		public void setHora(int hora) {
			this.hora = hora;
		}
		public int getCompromiso() {
			return compromiso;
		}
		public void setCompromiso(int compromiso) {
			this.compromiso = compromiso;
		}
		public double getDisponible() {
			return disponible;
		}
		public void setDisponible(double disponible) {
			this.disponible = disponible;
		}
		public int getCompromisoFlexibleVentas() {
			return compromisoFlexibleVentas;
		}
		public void setCompromisoFlexibleVentas(int compromisoFlexibleVentas) {
			this.compromisoFlexibleVentas = compromisoFlexibleVentas;
		}
		public int getCompromisoDuroVentas() {
			return compromisoDuroVentas;
		}
		public void setCompromisoDuroVentas(int compromisoDuroVentas) {
			this.compromisoDuroVentas = compromisoDuroVentas;
		}
		public String getCodeum() {
			return codeum;
		}
		public void setCodeum(String codeum) {
			this.codeum = codeum;
		}
		public String getDesUom() {
			return desUom;
		}
		public void setDesUom(String desUom) {
			this.desUom = desUom;
		}
		public String getFechaUpdate() {
			return fechaUpdate;
		}
		public void setFechaUpdate(String fechaUpdate) {
			this.fechaUpdate = fechaUpdate;
		}
		public String getFechaUpdate2() {
			return fechaUpdate2;
		}
		public void setFechaUpdate2(String fechaUpdate2) {
			this.fechaUpdate2 = fechaUpdate2;
		}
		public int getCodeCorto() {
			return codeCorto;
		}
		public void setCodeCorto(int codeCorto) {
			this.codeCorto = codeCorto;
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
		public String getUbicacionDeposito() {
			return ubicacionDeposito;
		}
		public void setUbicacionDeposito(String ubicacionDeposito) {
			this.ubicacionDeposito = ubicacionDeposito;
		}
		public String getLote() {
			return lote;
		}
		public void setLote(String lote) {
			this.lote = lote;
		}
		public double getExistenciaFisica() {
			return existenciaFisica;
		}
		public void setExistenciaFisica(double existenciaFisica) {
			this.existenciaFisica = existenciaFisica;
		}
		public String getCodeSku() {
			return codeSku;
		}
		public void setCodeSku(String codeSku) {
			this.codeSku = codeSku;
		}
		public String getCodeSku3() {
			return codeSku3;
		}
		public void setCodeSku3(String codeSku3) {
			this.codeSku3 = codeSku3;
		}
		public String getDescriptionItem() {
			return descriptionItem;
		}
		public void setDescriptionItem(String descriptionItem) {
			this.descriptionItem = descriptionItem;
		}
		
	    
	    
}
