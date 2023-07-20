package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rowset {
	 @JsonProperty("Nom ajuste") 
	    public String nomAjuste;
	    @JsonProperty("Descripción") 
	    public String descripción;
	    @JsonProperty("2º nº artículo") 
	    public String _2nArtículo;
	    @JsonProperty("Valor factor nmco") 
	    public int valorFactorNmco;
	    @JsonProperty("Fecha efectiva") 
	    public String fechaEfectiva;
	    @JsonProperty("Fecha vto") 
	    public String fechaVto;
	    @JsonProperty("ID clave gp clnt") 
	    public int iDClaveGpClnt;
	    @JsonProperty("Línea descripción 2") 
	    public String líneaDescripción2;
	    @JsonProperty("Línea descr 3") 
	    public String líneaDescr3;
	    @JsonProperty("Clasf mcía") 
	    public String clasfMcía;
		public String getNomAjuste() {
			return nomAjuste;
		}
		public void setNomAjuste(String nomAjuste) {
			this.nomAjuste = nomAjuste;
		}
		public String getDescripción() {
			return descripción;
		}
		public void setDescripción(String descripción) {
			this.descripción = descripción;
		}
		public String get_2nArtículo() {
			return _2nArtículo;
		}
		public void set_2nArtículo(String _2nArtículo) {
			this._2nArtículo = _2nArtículo;
		}
		public int getValorFactorNmco() {
			return valorFactorNmco;
		}
		public void setValorFactorNmco(int valorFactorNmco) {
			this.valorFactorNmco = valorFactorNmco;
		}
		public String getFechaEfectiva() {
			return fechaEfectiva;
		}
		public void setFechaEfectiva(String fechaEfectiva) {
			this.fechaEfectiva = fechaEfectiva;
		}
		public String getFechaVto() {
			return fechaVto;
		}
		public void setFechaVto(String fechaVto) {
			this.fechaVto = fechaVto;
		}
		public int getiDClaveGpClnt() {
			return iDClaveGpClnt;
		}
		public void setiDClaveGpClnt(int iDClaveGpClnt) {
			this.iDClaveGpClnt = iDClaveGpClnt;
		}
		public String getLíneaDescripción2() {
			return líneaDescripción2;
		}
		public void setLíneaDescripción2(String líneaDescripción2) {
			this.líneaDescripción2 = líneaDescripción2;
		}
		public String getLíneaDescr3() {
			return líneaDescr3;
		}
		public void setLíneaDescr3(String líneaDescr3) {
			this.líneaDescr3 = líneaDescr3;
		}
		public String getClasfMcía() {
			return clasfMcía;
		}
		public void setClasfMcía(String clasfMcía) {
			this.clasfMcía = clasfMcía;
		}
	    
	    
}
