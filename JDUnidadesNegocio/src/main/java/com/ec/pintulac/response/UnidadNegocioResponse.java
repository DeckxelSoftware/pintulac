package com.ec.pintulac.response;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "rows", "jde__status", "jde__startTimestamp", "jde__endTimestamp", "jde__serverExecutionSeconds" })
@Generated("jsonschema2pojo")
public class UnidadNegocioResponse {

	@JsonProperty("rows")
	private List<Row> rows;
	@JsonProperty("jde__status")
	private String jdeStatus;
	@JsonProperty("jde__startTimestamp")
	private String jdeStartTimestamp;
	@JsonProperty("jde__endTimestamp")
	private String jdeEndTimestamp;
	@JsonProperty("jde__serverExecutionSeconds")
	private Double jdeServerExecutionSeconds;

	@JsonProperty("rows")
	public List<Row> getRows() {
		return rows;
	}

	@JsonProperty("rows")
	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	@JsonProperty("jde__status")
	public String getJdeStatus() {
		return jdeStatus;
	}

	@JsonProperty("jde__status")
	public void setJdeStatus(String jdeStatus) {
		this.jdeStatus = jdeStatus;
	}

	@JsonProperty("jde__startTimestamp")
	public String getJdeStartTimestamp() {
		return jdeStartTimestamp;
	}

	@JsonProperty("jde__startTimestamp")
	public void setJdeStartTimestamp(String jdeStartTimestamp) {
		this.jdeStartTimestamp = jdeStartTimestamp;
	}

	@JsonProperty("jde__endTimestamp")
	public String getJdeEndTimestamp() {
		return jdeEndTimestamp;
	}

	@JsonProperty("jde__endTimestamp")
	public void setJdeEndTimestamp(String jdeEndTimestamp) {
		this.jdeEndTimestamp = jdeEndTimestamp;
	}

	@JsonProperty("jde__serverExecutionSeconds")
	public Double getJdeServerExecutionSeconds() {
		return jdeServerExecutionSeconds;
	}

	@JsonProperty("jde__serverExecutionSeconds")
	public void setJdeServerExecutionSeconds(Double jdeServerExecutionSeconds) {
		this.jdeServerExecutionSeconds = jdeServerExecutionSeconds;
	}

}
