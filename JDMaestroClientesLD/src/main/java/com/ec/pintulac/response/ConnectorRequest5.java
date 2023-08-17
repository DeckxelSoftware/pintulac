package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest5 {

	@JsonProperty("rows")
	private List<Row5> rows;

	public ConnectorRequest5() {
		super();
	}

	public List<Row5> getRows() {
		return rows;
	}

	public void setRows(List<Row5> rows) {
		this.rows = rows;
	}
	
	public static class Row5 {

        @JsonProperty("NUMERO_CLIENTE")
        private int numeroCliente;

        @JsonProperty("NUMERO_CONTACTO")
        private int numeroContacto;

        @JsonProperty("NOMBRE_CONTACTO")
        private String nombreContacto;

        @JsonProperty("TIPO_CONTACTO")
        private String tipoContacto;

        @JsonProperty("PREFIJO_TEL")
        private String prefijoTel;

        @JsonProperty("NUMERO_TEL")
        private String numeroTel;

        @JsonProperty("TIPO_TEL")
        private String tipoTel;

		public Row5() {
			super();
		}

		public int getNumeroCliente() {
			return numeroCliente;
		}

		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}

		public int getNumeroContacto() {
			return numeroContacto;
		}

		public void setNumeroContacto(int numeroContacto) {
			this.numeroContacto = numeroContacto;
		}

		public String getNombreContacto() {
			return nombreContacto;
		}

		public void setNombreContacto(String nombreContacto) {
			this.nombreContacto = nombreContacto;
		}

		public String getTipoContacto() {
			return tipoContacto;
		}

		public void setTipoContacto(String tipoContacto) {
			this.tipoContacto = tipoContacto;
		}

		public String getPrefijoTel() {
			return prefijoTel;
		}

		public void setPrefijoTel(String prefijoTel) {
			this.prefijoTel = prefijoTel;
		}

		public String getNumeroTel() {
			return numeroTel;
		}

		public void setNumeroTel(String numeroTel) {
			this.numeroTel = numeroTel;
		}

		public String getTipoTel() {
			return tipoTel;
		}

		public void setTipoTel(String tipoTel) {
			this.tipoTel = tipoTel;
		}

        
    }
}
