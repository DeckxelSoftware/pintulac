package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Row4 {
	@JsonProperty("NUMERO_CLIENTE")
	private int numeroCliente;

	@JsonProperty("ID_LINEA")
	private int idLinea;

	@JsonProperty("CATEGORIA_EMAIL")
	private String categoriaEmail;

	@JsonProperty("CORREO")
	private String correo;

	@JsonProperty("IND_NOTIFICACION")
	private int indNotificacion;

	@JsonProperty("EMAIL_FRA_ELECTRONICA")
	private String emailFraElectronica;

	public Row4() {
		super();
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}

	public String getCategoriaEmail() {
		return categoriaEmail;
	}

	public void setCategoriaEmail(String categoriaEmail) {
		this.categoriaEmail = categoriaEmail;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getIndNotificacion() {
		return indNotificacion;
	}

	public void setIndNotificacion(int indNotificacion) {
		this.indNotificacion = indNotificacion;
	}

	public String getEmailFraElectronica() {
		return emailFraElectronica;
	}

	public void setEmailFraElectronica(String emailFraElectronica) {
		this.emailFraElectronica = emailFraElectronica;
	}
}
