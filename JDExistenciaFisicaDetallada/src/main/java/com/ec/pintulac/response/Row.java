package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Row {
	  @JsonProperty("HORA") 
	    public int hORA;
	    @JsonProperty("COMPROMISO") 
	    public int cOMPROMISO;
	    @JsonProperty("DISPONIBLE") 
	    public double dISPONIBLE;
	    @JsonProperty("COMPROMISO_FLEXIBLE_VENTAS") 
	    public int cOMPROMISO_FLEXIBLE_VENTAS;
	    @JsonProperty("COMPROMISO_DURO_VENTAS") 
	    public int cOMPROMISO_DURO_VENTAS;
	    @JsonProperty("CODEUM") 
	    public String cODEUM;
	    @JsonProperty("DES_UOM") 
	    public String dES_UOM;
	    @JsonProperty("FECHA_UPDATE") 
	    public String fECHA_UPDATE;
	    @JsonProperty("FECHA_UPDATE2") 
	    public String fECHA_UPDATE2;
	    @JsonProperty("CODE_CORTO") 
	    public int cODE_CORTO;
	    @JsonProperty("CODE_BODEGA") 
	    public String cODE_BODEGA;
	    @JsonProperty("DES_BODEGA") 
	    public String dES_BODEGA;
	    @JsonProperty("UBICACION_DEPOSITO") 
	    public String uBICACION_DEPOSITO;
	    @JsonProperty("LOTE") 
	    public String lOTE;
	    @JsonProperty("EXISTENCIA_FISICA") 
	    public double eXISTENCIA_FISICA;
	    @JsonProperty("CODE_SKU") 
	    public String cODE_SKU;
	    @JsonProperty("CODE_SKU3") 
	    public String cODE_SKU3;
	    @JsonProperty("DESCRIPCION_ITEM") 
	    public String dESCRIPCION_ITEM;
		public int gethORA() {
			return hORA;
		}
		public void sethORA(int hORA) {
			this.hORA = hORA;
		}
		public int getcOMPROMISO() {
			return cOMPROMISO;
		}
		public void setcOMPROMISO(int cOMPROMISO) {
			this.cOMPROMISO = cOMPROMISO;
		}
		public double getdISPONIBLE() {
			return dISPONIBLE;
		}
		public void setdISPONIBLE(double dISPONIBLE) {
			this.dISPONIBLE = dISPONIBLE;
		}
		public int getcOMPROMISO_FLEXIBLE_VENTAS() {
			return cOMPROMISO_FLEXIBLE_VENTAS;
		}
		public void setcOMPROMISO_FLEXIBLE_VENTAS(int cOMPROMISO_FLEXIBLE_VENTAS) {
			this.cOMPROMISO_FLEXIBLE_VENTAS = cOMPROMISO_FLEXIBLE_VENTAS;
		}
		public int getcOMPROMISO_DURO_VENTAS() {
			return cOMPROMISO_DURO_VENTAS;
		}
		public void setcOMPROMISO_DURO_VENTAS(int cOMPROMISO_DURO_VENTAS) {
			this.cOMPROMISO_DURO_VENTAS = cOMPROMISO_DURO_VENTAS;
		}
		public String getcODEUM() {
			return cODEUM;
		}
		public void setcODEUM(String cODEUM) {
			this.cODEUM = cODEUM;
		}
		public String getdES_UOM() {
			return dES_UOM;
		}
		public void setdES_UOM(String dES_UOM) {
			this.dES_UOM = dES_UOM;
		}
		public String getfECHA_UPDATE() {
			return fECHA_UPDATE;
		}
		public void setfECHA_UPDATE(String fECHA_UPDATE) {
			this.fECHA_UPDATE = fECHA_UPDATE;
		}
		public String getfECHA_UPDATE2() {
			return fECHA_UPDATE2;
		}
		public void setfECHA_UPDATE2(String fECHA_UPDATE2) {
			this.fECHA_UPDATE2 = fECHA_UPDATE2;
		}
		public int getcODE_CORTO() {
			return cODE_CORTO;
		}
		public void setcODE_CORTO(int cODE_CORTO) {
			this.cODE_CORTO = cODE_CORTO;
		}
		public String getcODE_BODEGA() {
			return cODE_BODEGA;
		}
		public void setcODE_BODEGA(String cODE_BODEGA) {
			this.cODE_BODEGA = cODE_BODEGA;
		}
		public String getdES_BODEGA() {
			return dES_BODEGA;
		}
		public void setdES_BODEGA(String dES_BODEGA) {
			this.dES_BODEGA = dES_BODEGA;
		}
		public String getuBICACION_DEPOSITO() {
			return uBICACION_DEPOSITO;
		}
		public void setuBICACION_DEPOSITO(String uBICACION_DEPOSITO) {
			this.uBICACION_DEPOSITO = uBICACION_DEPOSITO;
		}
		public String getlOTE() {
			return lOTE;
		}
		public void setlOTE(String lOTE) {
			this.lOTE = lOTE;
		}
		public double geteXISTENCIA_FISICA() {
			return eXISTENCIA_FISICA;
		}
		public void seteXISTENCIA_FISICA(double eXISTENCIA_FISICA) {
			this.eXISTENCIA_FISICA = eXISTENCIA_FISICA;
		}
		public String getcODE_SKU() {
			return cODE_SKU;
		}
		public void setcODE_SKU(String cODE_SKU) {
			this.cODE_SKU = cODE_SKU;
		}
		public String getcODE_SKU3() {
			return cODE_SKU3;
		}
		public void setcODE_SKU3(String cODE_SKU3) {
			this.cODE_SKU3 = cODE_SKU3;
		}
		public String getdESCRIPCION_ITEM() {
			return dESCRIPCION_ITEM;
		}
		public void setdESCRIPCION_ITEM(String dESCRIPCION_ITEM) {
			this.dESCRIPCION_ITEM = dESCRIPCION_ITEM;
		}	
	    
	    
}
