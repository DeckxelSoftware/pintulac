package com.ec.pintulac.request;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaDescuentosResponse {

	@JsonProperty("Nom_ajuste_1") 
    public String nom_ajuste_1;
    @JsonProperty("Fecha_actz_1") 
    public String fecha_actz_1;
    @JsonProperty("LITM") 
    public String lITM;
	
    
}
