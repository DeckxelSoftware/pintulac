package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest3 {
	
	@JsonProperty("rows")
    private List<Row3> rows;

	public ConnectorRequest3() {
		super();
	}

	public List<Row3> getRows() {
		return rows;
	}

	public void setRows(List<Row3> rows) {
		this.rows = rows;
	}
	
	public static class Row3 {

        @JsonProperty("NUMERO_CLIENTE")
        private int numeroCliente;

        @JsonProperty("ID_LINEA")
        private int idLinea;

        @JsonProperty("NUM_TRANS")
        private int numTrans;

        @JsonProperty("PREFIJO_TEL")
        private String prefijoTel;

        @JsonProperty("NUMERO_TEL")
        private String numeroTel;

        @JsonProperty("TIPO_TEL")
        private String tipoTel;

		public Row3() {
			super();
		}

		public int getNumeroCliente() {
			return numeroCliente;
		}

		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}

		public int getIdLinea() {
			return idLinea;
		}

		public void setIdLinea(int idLinea) {
			this.idLinea = idLinea;
		}

		public int getNumTrans() {
			return numTrans;
		}

		public void setNumTrans(int numTrans) {
			this.numTrans = numTrans;
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
