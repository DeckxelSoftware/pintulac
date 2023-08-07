package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SDComunicacionUnidadesMedida {
	@JsonProperty("tableId")
    private String tableId;

    @JsonProperty("rowset")
    private List<UnidadMedida> rowset;

    @JsonProperty("records")
    private int records;

    @JsonProperty("moreRecords")
    private boolean moreRecords;

	public SDComunicacionUnidadesMedida() {
		super();
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public List<UnidadMedida> getRowset() {
		return rowset;
	}

	public void setRowset(List<UnidadMedida> rowset) {
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
