package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest1 {
	@JsonProperty("rows")
	private List<Row1> rows;

	public ConnectorRequest1() {
		super();
	}

	public List<Row1> getRows() {
		return rows;
	}

	public void setRows(List<Row1> rows) {
		this.rows = rows;
	}

	
}
