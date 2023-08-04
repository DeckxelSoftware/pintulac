package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaUnidadesMedidaFechaHoraItemResponse {
	@JsonProperty("Result")
    private boolean result;

    @JsonProperty("SD Comunicacion de Unidades de Medida")
    private SDComunicacionUnidadesMedida sdComunicacionUnidadesMedida;

    @JsonProperty("jde__status")
    private String jdeStatus;

    @JsonProperty("jde__startTimestamp")
    private String jdeStartTimestamp;

    @JsonProperty("jde__endTimestamp")
    private String jdeEndTimestamp;

    @JsonProperty("jde__serverExecutionSeconds")
    private double jdeServerExecutionSeconds;

	public ConsultaUnidadesMedidaFechaHoraItemResponse() {
		super();
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public SDComunicacionUnidadesMedida getSdComunicacionUnidadesMedida() {
		return sdComunicacionUnidadesMedida;
	}

	public void setSdComunicacionUnidadesMedida(SDComunicacionUnidadesMedida sdComunicacionUnidadesMedida) {
		this.sdComunicacionUnidadesMedida = sdComunicacionUnidadesMedida;
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
