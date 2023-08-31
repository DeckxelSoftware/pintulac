package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SDV4211AData {
	@JsonProperty("tableId")
	private String tableId;

	@JsonProperty("rowset")
	private OrdenVenta[] listaOrdenes;

	@JsonProperty("records")
	private int records;

	@JsonProperty("moreRecords")
	private boolean moreRecords;

	
	public SDV4211AData() {
		super();
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public OrdenVenta[] getListaOrdenes() {
		return listaOrdenes;
	}

	public void setListaOrdenes(OrdenVenta[] listaOrdenes) {
		this.listaOrdenes = listaOrdenes;
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
