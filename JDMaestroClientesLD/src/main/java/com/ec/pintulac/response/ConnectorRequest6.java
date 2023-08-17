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
	
	
}
