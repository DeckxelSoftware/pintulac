package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest2 {
	
	@JsonProperty("rows")
	private List<Row2> rows;

	public ConnectorRequest2() {
		super();
	}

	public List<Row2> getRows() {
		return rows;
	}

	public void setRows(List<Row2> rows) {
		this.rows = rows;
	}
	
	public static class Row2 {

        @JsonProperty("NUMERO_CLIENTE")
        private int numeroCliente;

        @JsonProperty("PRINCIPAL")
        private int principal;

        @JsonProperty("CUPO_ASIGNADO_PRINCIPAL")
        private int cupoAsignadoPrincipal;

		public Row2() {
			super();
		}

		public int getNumeroCliente() {
			return numeroCliente;
		}

		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}

		public int getPrincipal() {
			return principal;
		}

		public void setPrincipal(int principal) {
			this.principal = principal;
		}

		public int getCupoAsignadoPrincipal() {
			return cupoAsignadoPrincipal;
		}

		public void setCupoAsignadoPrincipal(int cupoAsignadoPrincipal) {
			this.cupoAsignadoPrincipal = cupoAsignadoPrincipal;
		}

        
    }

}
