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
	
	
}
