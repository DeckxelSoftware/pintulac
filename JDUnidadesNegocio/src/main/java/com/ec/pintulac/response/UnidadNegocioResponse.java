
package com.ec.pintulac.response;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class UnidadNegocioResponse {

    @SerializedName("rows")
    @Expose
    private List<Row> rows;
    @SerializedName("jde__status")
    @Expose
    private String jdeStatus;
    @SerializedName("jde__startTimestamp")
    @Expose
    private String jdeStartTimestamp;
    @SerializedName("jde__endTimestamp")
    @Expose
    private String jdeEndTimestamp;
    @SerializedName("jde__serverExecutionSeconds")
    @Expose
    private Double jdeServerExecutionSeconds;

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public String getJdeStatus() {
        return jdeStatus;
    }

    public void setJdeStatus(String jdeStatus) {
        this.jdeStatus = jdeStatus;
    }

    public String getJdeStartTimestamp() {
        return jdeStartTimestamp;
    }

    public void setJdeStartTimestamp(String jdeStartTimestamp) {
        this.jdeStartTimestamp = jdeStartTimestamp;
    }

    public String getJdeEndTimestamp() {
        return jdeEndTimestamp;
    }

    public void setJdeEndTimestamp(String jdeEndTimestamp) {
        this.jdeEndTimestamp = jdeEndTimestamp;
    }

    public Double getJdeServerExecutionSeconds() {
        return jdeServerExecutionSeconds;
    }

    public void setJdeServerExecutionSeconds(Double jdeServerExecutionSeconds) {
        this.jdeServerExecutionSeconds = jdeServerExecutionSeconds;
    }

}
