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
	
	
}
