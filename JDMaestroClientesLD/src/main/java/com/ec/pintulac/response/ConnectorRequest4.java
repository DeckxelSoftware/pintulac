package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest4 {
	
	@JsonProperty("rows")
    private List<Row4> rows;

	public ConnectorRequest4() {
		super();
	}

	public List<Row4> getRows() {
		return rows;
	}

	public void setRows(List<Row4> rows) {
		this.rows = rows;
	}
	
	
}
