package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest7 {
	@JsonProperty("rows")
    private List<Row7> rows;

	public ConnectorRequest7() {
		super();
	}

	public List<Row7> getRows() {
		return rows;
	}

	public void setRows(List<Row7> rows) {
		this.rows = rows;
	}
	
	public static class Row7 {

        @JsonProperty("NUMERO_CLIENTE")
        private int numeroCliente;

        @JsonProperty("CUPO_ASIGNADO")
        private int cupoAsignado;

        @JsonProperty("CARTERA_VENCIDA")
        private int carteraVencida;

        @JsonProperty("CARTERA_POR_VENCER")
        private int carteraPorVencer;

        @JsonProperty("TOTAL_CARTERA")
        private int totalCartera;

        @JsonProperty("CUPO_DISPONIBLE")
        private int cupoDisponible;

		public Row7() {
			super();
		}

		public int getNumeroCliente() {
			return numeroCliente;
		}

		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}

		public int getCupoAsignado() {
			return cupoAsignado;
		}

		public void setCupoAsignado(int cupoAsignado) {
			this.cupoAsignado = cupoAsignado;
		}

		public int getCarteraVencida() {
			return carteraVencida;
		}

		public void setCarteraVencida(int carteraVencida) {
			this.carteraVencida = carteraVencida;
		}

		public int getCarteraPorVencer() {
			return carteraPorVencer;
		}

		public void setCarteraPorVencer(int carteraPorVencer) {
			this.carteraPorVencer = carteraPorVencer;
		}

		public int getTotalCartera() {
			return totalCartera;
		}

		public void setTotalCartera(int totalCartera) {
			this.totalCartera = totalCartera;
		}

		public int getCupoDisponible() {
			return cupoDisponible;
		}

		public void setCupoDisponible(int cupoDisponible) {
			this.cupoDisponible = cupoDisponible;
		}

        
    }
}
