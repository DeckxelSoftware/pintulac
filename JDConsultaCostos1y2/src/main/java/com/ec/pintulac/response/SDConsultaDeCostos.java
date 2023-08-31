package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SDConsultaDeCostos {
	@JsonProperty("tableId")
	private String tableId;

	@JsonProperty("rowset")
	private List<Costo> rowsets;

	@JsonProperty("records")
	private int records;

	@JsonProperty("moreRecords")
	private boolean moreRecords;

	public SDConsultaDeCostos() {
		super();
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public List<Costo> getRowsets() {
		return rowsets;
	}

	public void setRowsets(List<Costo> rowsets) {
		this.rowsets = rowsets;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	public boolean isMoreRecords() {
		return moreRecords;
	}

	public void setMoreRecords(boolean moreRecords) {
		this.moreRecords = moreRecords;
	}
	
	
}
