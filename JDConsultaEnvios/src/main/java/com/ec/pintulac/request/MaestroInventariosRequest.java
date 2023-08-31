package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaestroInventariosRequest {
	@JsonProperty("LITM")
    private String litm;

    @JsonProperty("UPMJ")
    private String upmj;

    @JsonProperty("TDAY")
    private String tday;

    @JsonProperty("MCU")
    private String mcu;

    // Constructor, getters y setters

    public MaestroInventariosRequest() {
        super();
    }

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm;
    }

    public String getUpmj() {
        return upmj;
    }

    public void setUpmj(String upmj) {
        this.upmj = upmj;
    }

    public String getTday() {
        return tday;
    }

    public void setTday(String tday) {
        this.tday = tday;
    }

    public String getMcu() {
        return mcu;
    }

    public void setMcu(String mcu) {
        this.mcu = mcu;
    }
}
