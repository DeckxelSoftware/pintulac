package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaestroClientesLDResponse {
	
	@JsonProperty("ConnectorRequest1")
    private ConnectorRequest1 connectorRequest1;

    @JsonProperty("ConnectorRequest2")
    private ConnectorRequest2 connectorRequest2;

    @JsonProperty("ConnectorRequest3")
    private ConnectorRequest3 connectorRequest3;

    @JsonProperty("ConnectorRequest4")
    private ConnectorRequest4 connectorRequest4;

    @JsonProperty("ConnectorRequest5")
    private ConnectorRequest5 connectorRequest5;

    @JsonProperty("ConnectorRequest6")
    private ConnectorRequest6 connectorRequest6;

    @JsonProperty("ConnectorRequest7")
    private ConnectorRequest7 connectorRequest7;

	public MaestroClientesLDResponse() {
		super();
	}

	public ConnectorRequest1 getConnectorRequest1() {
		return connectorRequest1;
	}

	public void setConnectorRequest1(ConnectorRequest1 connectorRequest1) {
		this.connectorRequest1 = connectorRequest1;
	}

	public ConnectorRequest2 getConnectorRequest2() {
		return connectorRequest2;
	}

	public void setConnectorRequest2(ConnectorRequest2 connectorRequest2) {
		this.connectorRequest2 = connectorRequest2;
	}

	public ConnectorRequest3 getConnectorRequest3() {
		return connectorRequest3;
	}

	public void setConnectorRequest3(ConnectorRequest3 connectorRequest3) {
		this.connectorRequest3 = connectorRequest3;
	}

	public ConnectorRequest4 getConnectorRequest4() {
		return connectorRequest4;
	}

	public void setConnectorRequest4(ConnectorRequest4 connectorRequest4) {
		this.connectorRequest4 = connectorRequest4;
	}

	public ConnectorRequest5 getConnectorRequest5() {
		return connectorRequest5;
	}

	public void setConnectorRequest5(ConnectorRequest5 connectorRequest5) {
		this.connectorRequest5 = connectorRequest5;
	}

	public ConnectorRequest6 getConnectorRequest6() {
		return connectorRequest6;
	}

	public void setConnectorRequest6(ConnectorRequest6 connectorRequest6) {
		this.connectorRequest6 = connectorRequest6;
	}

	public ConnectorRequest7 getConnectorRequest7() {
		return connectorRequest7;
	}

	public void setConnectorRequest7(ConnectorRequest7 connectorRequest7) {
		this.connectorRequest7 = connectorRequest7;
	}
    
    
}
