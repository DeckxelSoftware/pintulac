package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenVentaGeneralResponse {

	  @JsonProperty("Result")
	    private boolean result;

	    @JsonProperty("SD V4211A Consulta de Ordenes WMS V1")
	    private SDV4211AData sdv4211AData;

	    @JsonProperty("jde__status")
	    private String jdeStatus;

	    
		public OrdenVentaGeneralResponse() {
			super();
		}

		public boolean isResult() {
			return result;
		}

		public void setResult(boolean result) {
			this.result = result;
		}

		public SDV4211AData getSdv4211AData() {
			return sdv4211AData;
		}

		public void setSdv4211AData(SDV4211AData sdv4211aData) {
			sdv4211AData = sdv4211aData;
		}

		public String getJdeStatus() {
			return jdeStatus;
		}

		public void setJdeStatus(String jdeStatus) {
			this.jdeStatus = jdeStatus;
		}

	    
}
