package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultasCostos2Response {
	
	@JsonProperty("SD Consulta de Costos X Fecha Hora")
    private SDConsultaDeCostosXFechaHora sdConsultaDeCostosXFechaHora;

    @JsonProperty("jde__status")
    private String jdeStatus;

    @JsonProperty("jde__startTimestamp")
    private String jdeStartTimestamp;

    @JsonProperty("jde__endTimestamp")
    private String jdeEndTimestamp;

    @JsonProperty("jde__serverExecutionSeconds")
    private double jdeServerExecutionSeconds;

	public ConsultasCostos2Response() {
		super();
	}

	public SDConsultaDeCostosXFechaHora getSdConsultaDeCostosXFechaHora() {
		return sdConsultaDeCostosXFechaHora;
	}

	public void setSdConsultaDeCostosXFechaHora(SDConsultaDeCostosXFechaHora sdConsultaDeCostosXFechaHora) {
		this.sdConsultaDeCostosXFechaHora = sdConsultaDeCostosXFechaHora;
	}

	public String getJdeStatus() {
		return jdeStatus;
	}

	public void setJdeStatus(String jdeStatus) {
		this.jdeStatus = jdeStatus;
	}

	public String getJdeStartTimestamp() {
		return jdeStartTimestamp;
	}

	public void setJdeStartTimestamp(String jdeStartTimestamp) {
		this.jdeStartTimestamp = jdeStartTimestamp;
	}

	public String getJdeEndTimestamp() {
		return jdeEndTimestamp;
	}

	public void setJdeEndTimestamp(String jdeEndTimestamp) {
		this.jdeEndTimestamp = jdeEndTimestamp;
	}

	public double getJdeServerExecutionSeconds() {
		return jdeServerExecutionSeconds;
	}

	public void setJdeServerExecutionSeconds(double jdeServerExecutionSeconds) {
		this.jdeServerExecutionSeconds = jdeServerExecutionSeconds;
	}
    
    
}
