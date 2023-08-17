package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest7 {
	@JsonProperty("rows")
    private List<Row7> rows;

	public ConnectorRequest7() {
		super();
	}

	public List<Row7> getRows() {
		return rows;
	}

	public void setRows(List<Row7> rows) {
		this.rows = rows;
	}
	
	
}
