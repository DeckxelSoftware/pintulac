package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest6 {
	
	@JsonProperty("rows")
    private List<Row6> rows;

	public ConnectorRequest6() {
		super();
	}

	public List<Row6> getRows() {
		return rows;
	}

	public void setRows(List<Row6> rows) {
		this.rows = rows;
	}
	
	public static class Row6 {

        @JsonProperty("NUMERO_CLIENTE")
        private int numeroCliente;

        @JsonProperty("NOMBRE")
        private String nombre;

        @JsonProperty("ID_FISCAL")
        private String idFiscal;

        @JsonProperty("TIPO_BUSQUEDA")
        private String tipoBusqueda;

        @JsonProperty("CANTON")
        private String canton;

        @JsonProperty("TIPO_ID_FISCAL")
        private String tipoIdFiscal;

        @JsonProperty("VENDEDOR")
        private String vendedor;

        @JsonProperty("CANAL")
        private String canal;

        @JsonProperty("RELACIONADA_SRI")
        private String relacionadaSRI;

        @JsonProperty("ESTADO_CIVIL")
        private String estadoCivil;

        @JsonProperty("TIPO_PERSONA")
        private String tipoPersona;

        @JsonProperty("DIRECCION_ENTREGA")
        private int direccionEntrega;

        @JsonProperty("SISTEMA")
        private String sistema;

        @JsonProperty("LINEA_DIRECCION1")
        private String lineaDireccion1;

        @JsonProperty("LINEA_DIRECCION2")
        private String lineaDireccion2;

        @JsonProperty("LINEA_DIRECCION3")
        private String lineaDireccion3;

        @JsonProperty("LINEA_DIRECCION4")
        private String lineaDireccion4;

        @JsonProperty("PROVINCIA")
        private String provincia;

        @JsonProperty("PAIS")
        private String pais;

        @JsonProperty("PARROQUIA")
        private String parroquia;

        @JsonProperty("NOMBRE_COMERCIAL")
        private String nombreComercial;

        @JsonProperty("PRINCIPAL")
        private int principal;

		public Row6() {
			super();
		}

		public int getNumeroCliente() {
			return numeroCliente;
		}

		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getIdFiscal() {
			return idFiscal;
		}

		public void setIdFiscal(String idFiscal) {
			this.idFiscal = idFiscal;
		}

		public String getTipoBusqueda() {
			return tipoBusqueda;
		}

		public void setTipoBusqueda(String tipoBusqueda) {
			this.tipoBusqueda = tipoBusqueda;
		}

		public String getCanton() {
			return canton;
		}

		public void setCanton(String canton) {
			this.canton = canton;
		}

		public String getTipoIdFiscal() {
			return tipoIdFiscal;
		}

		public void setTipoIdFiscal(String tipoIdFiscal) {
			this.tipoIdFiscal = tipoIdFiscal;
		}

		public String getVendedor() {
			return vendedor;
		}

		public void setVendedor(String vendedor) {
			this.vendedor = vendedor;
		}

		public String getCanal() {
			return canal;
		}

		public void setCanal(String canal) {
			this.canal = canal;
		}

		public String getRelacionadaSRI() {
			return relacionadaSRI;
		}

		public void setRelacionadaSRI(String relacionadaSRI) {
			this.relacionadaSRI = relacionadaSRI;
		}

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		public String getTipoPersona() {
			return tipoPersona;
		}

		public void setTipoPersona(String tipoPersona) {
			this.tipoPersona = tipoPersona;
		}

		public int getDireccionEntrega() {
			return direccionEntrega;
		}

		public void setDireccionEntrega(int direccionEntrega) {
			this.direccionEntrega = direccionEntrega;
		}

		public String getSistema() {
			return sistema;
		}

		public void setSistema(String sistema) {
			this.sistema = sistema;
		}

		public String getLineaDireccion1() {
			return lineaDireccion1;
		}

		public void setLineaDireccion1(String lineaDireccion1) {
			this.lineaDireccion1 = lineaDireccion1;
		}

		public String getLineaDireccion2() {
			return lineaDireccion2;
		}

		public void setLineaDireccion2(String lineaDireccion2) {
			this.lineaDireccion2 = lineaDireccion2;
		}

		public String getLineaDireccion3() {
			return lineaDireccion3;
		}

		public void setLineaDireccion3(String lineaDireccion3) {
			this.lineaDireccion3 = lineaDireccion3;
		}

		public String getLineaDireccion4() {
			return lineaDireccion4;
		}

		public void setLineaDireccion4(String lineaDireccion4) {
			this.lineaDireccion4 = lineaDireccion4;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public String getParroquia() {
			return parroquia;
		}

		public void setParroquia(String parroquia) {
			this.parroquia = parroquia;
		}

		public String getNombreComercial() {
			return nombreComercial;
		}

		public void setNombreComercial(String nombreComercial) {
			this.nombreComercial = nombreComercial;
		}

		public int getPrincipal() {
			return principal;
		}

		public void setPrincipal(int principal) {
			this.principal = principal;
		}

        
    }
}
