package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenVenta {
	 @JsonProperty("Cía orden")
	    private String ciaOrden;

	    @JsonProperty("Número orden")
	    private int numeroOrden;

	    @JsonProperty("Tp ord")
	    private String tpOrd;

	    @JsonProperty("Número línea")
	    private double numeroLinea;

	    @JsonProperty("Unidad negocio")
	    private String unidadNegocio;

	    @JsonProperty("Nº drc")
	    private int numeroDrc;

	    @JsonProperty("Nº dest envío")
	    private int numeroDestEnvio;

	    @JsonProperty("Fecha solic")
	    private String fechaSolicitud;

	    @JsonProperty("Fecha orden")
	    private String fechaOrden;

	    @JsonProperty("Entrega prometida")
	    private String entregaPrometida;

	    @JsonProperty("Referencia")
	    private String referencia;

	    @JsonProperty("Referencia 2")
	    private String referencia2;

	    @JsonProperty("Nº corto artículo")
	    private int numeroCortoArticulo;

	    @JsonProperty("2º nº artículo")
	    private String segundoNumeroArticulo;

	    @JsonProperty("3º nº artículo")
	    private String tercerNumeroArticulo;

	    @JsonProperty("Número lote/ serie")
	    private String numeroLoteSerie;

	    @JsonProperty("Descripción")
	    private String descripcion;

	    @JsonProperty("Línea descripción 2")
	    private String lineaDescripcion2;

	    @JsonProperty("Est sig")
	    private String estSig;

	    @JsonProperty("Últ est")
	    private String ultEst;

	    @JsonProperty("Cantidad orden")
	    private int cantidadOrden;

	    @JsonProperty("Cantidad enviada")
	    private int cantidadEnviada;

	    @JsonProperty("Cant orden atrasada")
	    private int cantOrdenAtrasada;

	    @JsonProperty("Cantidad cancelada")
	    private int cantidadCancelada;

	    @JsonProperty("Costo uni")
	    private double costoUni;

	    @JsonProperty("Costo total")
	    private double costoTotal;

	    @JsonProperty("Nº zona")
	    private String numeroZona;

	    @JsonProperty("Exist fís actzda")
	    private String existFisActzda;

	    @JsonProperty("Número envío")
	    private int numeroEnvio;

	    
		public OrdenVenta() {
			super();
		}

		public String getCiaOrden() {
			return ciaOrden;
		}

		public void setCiaOrden(String ciaOrden) {
			this.ciaOrden = ciaOrden;
		}

		public int getNumeroOrden() {
			return numeroOrden;
		}

		public void setNumeroOrden(int numeroOrden) {
			this.numeroOrden = numeroOrden;
		}

		public String getTpOrd() {
			return tpOrd;
		}

		public void setTpOrd(String tpOrd) {
			this.tpOrd = tpOrd;
		}

		public double getNumeroLinea() {
			return numeroLinea;
		}

		public void setNumeroLinea(double numeroLinea) {
			this.numeroLinea = numeroLinea;
		}

		public String getUnidadNegocio() {
			return unidadNegocio;
		}

		public void setUnidadNegocio(String unidadNegocio) {
			this.unidadNegocio = unidadNegocio;
		}

		public int getNumeroDrc() {
			return numeroDrc;
		}

		public void setNumeroDrc(int numeroDrc) {
			this.numeroDrc = numeroDrc;
		}

		public int getNumeroDestEnvio() {
			return numeroDestEnvio;
		}

		public void setNumeroDestEnvio(int numeroDestEnvio) {
			this.numeroDestEnvio = numeroDestEnvio;
		}

		public String getFechaSolicitud() {
			return fechaSolicitud;
		}

		public void setFechaSolicitud(String fechaSolicitud) {
			this.fechaSolicitud = fechaSolicitud;
		}

		public String getFechaOrden() {
			return fechaOrden;
		}

		public void setFechaOrden(String fechaOrden) {
			this.fechaOrden = fechaOrden;
		}

		public String getEntregaPrometida() {
			return entregaPrometida;
		}

		public void setEntregaPrometida(String entregaPrometida) {
			this.entregaPrometida = entregaPrometida;
		}

		public String getReferencia() {
			return referencia;
		}

		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}

		public String getReferencia2() {
			return referencia2;
		}

		public void setReferencia2(String referencia2) {
			this.referencia2 = referencia2;
		}

		public int getNumeroCortoArticulo() {
			return numeroCortoArticulo;
		}

		public void setNumeroCortoArticulo(int numeroCortoArticulo) {
			this.numeroCortoArticulo = numeroCortoArticulo;
		}

		public String getSegundoNumeroArticulo() {
			return segundoNumeroArticulo;
		}

		public void setSegundoNumeroArticulo(String segundoNumeroArticulo) {
			this.segundoNumeroArticulo = segundoNumeroArticulo;
		}

		public String getTercerNumeroArticulo() {
			return tercerNumeroArticulo;
		}

		public void setTercerNumeroArticulo(String tercerNumeroArticulo) {
			this.tercerNumeroArticulo = tercerNumeroArticulo;
		}

		public String getNumeroLoteSerie() {
			return numeroLoteSerie;
		}

		public void setNumeroLoteSerie(String numeroLoteSerie) {
			this.numeroLoteSerie = numeroLoteSerie;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getLineaDescripcion2() {
			return lineaDescripcion2;
		}

		public void setLineaDescripcion2(String lineaDescripcion2) {
			this.lineaDescripcion2 = lineaDescripcion2;
		}

		public String getEstSig() {
			return estSig;
		}

		public void setEstSig(String estSig) {
			this.estSig = estSig;
		}

		public String getUltEst() {
			return ultEst;
		}

		public void setUltEst(String ultEst) {
			this.ultEst = ultEst;
		}

		public int getCantidadOrden() {
			return cantidadOrden;
		}

		public void setCantidadOrden(int cantidadOrden) {
			this.cantidadOrden = cantidadOrden;
		}

		public int getCantidadEnviada() {
			return cantidadEnviada;
		}

		public void setCantidadEnviada(int cantidadEnviada) {
			this.cantidadEnviada = cantidadEnviada;
		}

		public int getCantOrdenAtrasada() {
			return cantOrdenAtrasada;
		}

		public void setCantOrdenAtrasada(int cantOrdenAtrasada) {
			this.cantOrdenAtrasada = cantOrdenAtrasada;
		}

		public int getCantidadCancelada() {
			return cantidadCancelada;
		}

		public void setCantidadCancelada(int cantidadCancelada) {
			this.cantidadCancelada = cantidadCancelada;
		}

		public double getCostoUni() {
			return costoUni;
		}

		public void setCostoUni(double costoUni) {
			this.costoUni = costoUni;
		}

		public double getCostoTotal() {
			return costoTotal;
		}

		public void setCostoTotal(double costoTotal) {
			this.costoTotal = costoTotal;
		}

		public String getNumeroZona() {
			return numeroZona;
		}

		public void setNumeroZona(String numeroZona) {
			this.numeroZona = numeroZona;
		}

		public String getExistFisActzda() {
			return existFisActzda;
		}

		public void setExistFisActzda(String existFisActzda) {
			this.existFisActzda = existFisActzda;
		}

		public int getNumeroEnvio() {
			return numeroEnvio;
		}

		public void setNumeroEnvio(int numeroEnvio) {
			this.numeroEnvio = numeroEnvio;
		}

	    

}
