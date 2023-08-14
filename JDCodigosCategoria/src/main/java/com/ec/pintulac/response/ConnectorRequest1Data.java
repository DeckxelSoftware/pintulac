package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest1Data {
	
	 @JsonProperty("rows")
     private List<Item> item;

	public ConnectorRequest1Data() {
		super();
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	 
	 
}
