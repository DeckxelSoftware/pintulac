package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class P4106DataWrapper {
	@JsonProperty("tableId")
	private String tableId;

	@JsonProperty("rowset")
	private List<Rowset> rowset;

	@JsonProperty("records")
	private int records;

	@JsonProperty("moreRecords")
	private boolean moreRecords;

	public P4106DataWrapper() {
		super();
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public List<Rowset> getRowset() {
		return rowset;
	}

	public void setRowset(List<Rowset> rowset) {
		this.rowset = rowset;
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
