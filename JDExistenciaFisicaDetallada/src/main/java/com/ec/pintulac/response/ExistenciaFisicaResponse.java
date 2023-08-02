package com.ec.pintulac.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExistenciaFisicaResponse {
	@JsonProperty("ConnectorRequest1")
	public ConnectorRequest1 connectorRequest1;

	public ConnectorRequest1 getConnectorRequest1() {
		return connectorRequest1;
	}

	public void setConnectorRequest1(ConnectorRequest1 connectorRequest1) {
		this.connectorRequest1 = connectorRequest1;
	}
	
	
}
