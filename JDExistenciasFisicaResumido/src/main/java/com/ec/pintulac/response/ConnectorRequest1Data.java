package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest1Data {
	
	 @JsonProperty("rows")
     private List<Rows> rows;

	public ConnectorRequest1Data() {
		super();
	}

	public List<Rows> getItem() {
		return rows;
	}

	public void setItem(List<Rows> rows) {
		this.rows = rows;
	}
	 
	 
}
