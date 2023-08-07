package com.ec.pintulac.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescuentoResponse {
	@JsonProperty("Nom ajuste 1")
	public String nomAjuste1;
	@JsonProperty("Fecha vto 1")
	public String fechaVto1;
	@JsonProperty("Clasf mcía 1")
	public String clasfMcía1;
	@JsonProperty("Result")
	public boolean result;
	@JsonProperty("SD Descuentos x Item")
	public SDDescuentosXItem sDDescuentosxItem;
	public String jde__status;
	public Date jde__startTimestamp;
	public Date jde__endTimestamp;
	public double jde__serverExecutionSeconds;

	public String getNomAjuste1() {
		return nomAjuste1;
	}

	public void setNomAjuste1(String nomAjuste1) {
		this.nomAjuste1 = nomAjuste1;
	}

	public String getFechaVto1() {
		return fechaVto1;
	}

	public void setFechaVto1(String fechaVto1) {
		this.fechaVto1 = fechaVto1;
	}

	public String getClasfMcía1() {
		return clasfMcía1;
	}

	public void setClasfMcía1(String clasfMcía1) {
		this.clasfMcía1 = clasfMcía1;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public SDDescuentosXItem getsDDescuentosxItem() {
		return sDDescuentosxItem;
	}

	public void setsDDescuentosxItem(SDDescuentosXItem sDDescuentosxItem) {
		this.sDDescuentosxItem = sDDescuentosxItem;
	}

	public String getJde__status() {
		return jde__status;
	}

	public void setJde__status(String jde__status) {
		this.jde__status = jde__status;
	}

	public Date getJde__startTimestamp() {
		return jde__startTimestamp;
	}

	public void setJde__startTimestamp(Date jde__startTimestamp) {
		this.jde__startTimestamp = jde__startTimestamp;
	}

	public Date getJde__endTimestamp() {
		return jde__endTimestamp;
	}

	public void setJde__endTimestamp(Date jde__endTimestamp) {
		this.jde__endTimestamp = jde__endTimestamp;
	}

	public double getJde__serverExecutionSeconds() {
		return jde__serverExecutionSeconds;
	}

	public void setJde__serverExecutionSeconds(double jde__serverExecutionSeconds) {
		this.jde__serverExecutionSeconds = jde__serverExecutionSeconds;
	}

}
