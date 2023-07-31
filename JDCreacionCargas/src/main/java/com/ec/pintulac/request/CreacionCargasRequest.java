package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreacionCargasRequest {
	@JsonProperty("Deposito") 
    public String deposito;
    @JsonProperty("Vehiculo") 
    public String vehiculo;
    @JsonProperty("Modo_de_Transporte") 
    public String modo_de_Transporte;
    @JsonProperty("Fecha_de_Envio") 
    public String fecha_de_Envio;
    @JsonProperty("Hora_de_Envio") 
    public String hora_de_Envio;
    @JsonProperty("Nº_de_zona") 
    public String nº_de_zona;
    @JsonProperty("Carga") 
    public String carga;
    @JsonProperty("Ruta") 
    public String ruta;
    @JsonProperty("Transportista") 
    public String transportista;
    @JsonProperty("Nombre_Chofer") 
    public String nombre_Chofer;
    @JsonProperty("Placa_Vehiculo") 
    public String placa_Vehiculo;
    @JsonProperty("Telefono_Chofer") 
    public String telefono_Chofer;
    @JsonProperty("Cedula_Chofer") 
    public String cedula_Chofer;
    @JsonProperty("Observacion") 
    public String observacion;
    
    
    
	
	public CreacionCargasRequest() {
		super();
	}
	public String getDeposito() {
		return deposito;
	}
	public void setDeposito(String deposito) {
		this.deposito = deposito;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getModo_de_Transporte() {
		return modo_de_Transporte;
	}
	public void setModo_de_Transporte(String modo_de_Transporte) {
		this.modo_de_Transporte = modo_de_Transporte;
	}
	public String getFecha_de_Envio() {
		return fecha_de_Envio;
	}
	public void setFecha_de_Envio(String fecha_de_Envio) {
		this.fecha_de_Envio = fecha_de_Envio;
	}
	public String getHora_de_Envio() {
		return hora_de_Envio;
	}
	public void setHora_de_Envio(String hora_de_Envio) {
		this.hora_de_Envio = hora_de_Envio;
	}
	public String getNº_de_zona() {
		return nº_de_zona;
	}
	public void setNº_de_zona(String nº_de_zona) {
		this.nº_de_zona = nº_de_zona;
	}
	public String getCarga() {
		return carga;
	}
	public void setCarga(String carga) {
		this.carga = carga;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getTransportista() {
		return transportista;
	}
	public void setTransportista(String transportista) {
		this.transportista = transportista;
	}
	public String getNombre_Chofer() {
		return nombre_Chofer;
	}
	public void setNombre_Chofer(String nombre_Chofer) {
		this.nombre_Chofer = nombre_Chofer;
	}
	public String getPlaca_Vehiculo() {
		return placa_Vehiculo;
	}
	public void setPlaca_Vehiculo(String placa_Vehiculo) {
		this.placa_Vehiculo = placa_Vehiculo;
	}
	public String getTelefono_Chofer() {
		return telefono_Chofer;
	}
	public void setTelefono_Chofer(String telefono_Chofer) {
		this.telefono_Chofer = telefono_Chofer;
	}
	public String getCedula_Chofer() {
		return cedula_Chofer;
	}
	public void setCedula_Chofer(String cedula_Chofer) {
		this.cedula_Chofer = cedula_Chofer;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
