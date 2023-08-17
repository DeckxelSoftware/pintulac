package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest3 {
	
	@JsonProperty("rows")
    private List<Row3> rows;

	public ConnectorRequest3() {
		super();
	}

	public List<Row3> getRows() {
		return rows;
	}

	public void setRows(List<Row3> rows) {
		this.rows = rows;
	}
	
	
}
