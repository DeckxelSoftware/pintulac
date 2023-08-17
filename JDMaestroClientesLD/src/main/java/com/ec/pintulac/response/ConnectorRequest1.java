package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest1 {
	@JsonProperty("rows")
	private List<Row1> rows;

	public ConnectorRequest1() {
		super();
	}

	public List<Row1> getRows() {
		return rows;
	}

	public void setRows(List<Row1> rows) {
		this.rows = rows;
	}

	public static class Row1 {

        @JsonProperty("NUMERO_CLIENTE")
        private int numeroCliente;

        @JsonProperty("FECHA_ACTUALIZACION")
        private String fechaActualizacion;

        @JsonProperty("RAZON_SOCIAL")
        private String razonSocial;

        @JsonProperty("NOMBRE_COMERCIAL")
        private String nombreComercial;

        @JsonProperty("ID_FISCAL")
        private String idFiscal;

        @JsonProperty("TIPO_BUSQUEDA")
        private String tipoBusqueda;

        @JsonProperty("TIPO_ID_FISCAL")
        private String tipoIdFiscal;

        @JsonProperty("TIPO_CONTRIBUYENTE")
        private String tipoContribuyente;

        @JsonProperty("VENDEDOR")
        private String vendedor;

        @JsonProperty("CANAL")
        private String canal;

        @JsonProperty("ACTIVIDAD")
        private String actividad;

        @JsonProperty("RELACIONADA_SRI")
        private String relacionadaSRI;

        @JsonProperty("ORIGEN_INGRESOS")
        private String origenIngresos;

        @JsonProperty("ESTADO_CIVIL")
        private String estadoCivil;

        @JsonProperty("TIPO_PERSONA")
        private String tipoPersona;

        @JsonProperty("DIRECCION_ENTREGA")
        private int direccionEntrega;

        @JsonProperty("LINEA_DIRECCION1")
        private String lineaDireccion1;

        @JsonProperty("LINEA_DIRECCION2")
        private String lineaDireccion2;

        @JsonProperty("LINEA_DIRECCION3")
        private String lineaDireccion3;

        @JsonProperty("LINEA_DIRECCION4")
        private String lineaDireccion4;

        @JsonProperty("PAIS")
        private String pais;

        @JsonProperty("CIUDAD")
        private String ciudad;

        @JsonProperty("PROVINCIA")
        private String provincia;

        @JsonProperty("CANTON")
        private String canton;

        @JsonProperty("PARROQUIA")
        private String parroquia;

        @JsonProperty("LATITUD")
        private double latitud;

        @JsonProperty("LONGITUD")
        private double longitud;

        @JsonProperty("COMPANIA")
        private String compania;

        @JsonProperty("CUPO_ASIGNADO")
        private int cupoAsignado;

        @JsonProperty("VERIFICACION_CREDITO")
        private String verificacionCredito;

        @JsonProperty("PLAZO_PAGO")
        private String plazoPago;

        @JsonProperty("INSTRUMENTO_PAGO")
        private String instrumentoPago;

        @JsonProperty("COMPENSACION_LM")
        private String compensacionLM;

        @JsonProperty("CODIGO_RUTA")
        private String codigoRuta;

        @JsonProperty("ZONA")
        private String zona;

        @JsonProperty("SEXO")
        private String sexo;

        @JsonProperty("TIPO_DIR_ENTREGA")
        private String tipoDirEntrega;

        @JsonProperty("SISTEMA")
        private String sistema;

        @JsonProperty("ESTADO_CLIENTE")
        private int estadoCliente;

		public Row1() {
			super();
		}

		public int getNumeroCliente() {
			return numeroCliente;
		}

		public void setNumeroCliente(int numeroCliente) {
			this.numeroCliente = numeroCliente;
		}

		public String getFechaActualizacion() {
			return fechaActualizacion;
		}

		public void setFechaActualizacion(String fechaActualizacion) {
			this.fechaActualizacion = fechaActualizacion;
		}

		public String getRazonSocial() {
			return razonSocial;
		}

		public void setRazonSocial(String razonSocial) {
			this.razonSocial = razonSocial;
		}

		public String getNombreComercial() {
			return nombreComercial;
		}

		public void setNombreComercial(String nombreComercial) {
			this.nombreComercial = nombreComercial;
		}

		public String getIdFiscal() {
			return idFiscal;
		}

		public void setIdFiscal(String idFiscal) {
			this.idFiscal = idFiscal;
		}

		public String getTipoBusqueda() {
			return tipoBusqueda;
		}

		public void setTipoBusqueda(String tipoBusqueda) {
			this.tipoBusqueda = tipoBusqueda;
		}

		public String getTipoIdFiscal() {
			return tipoIdFiscal;
		}

		public void setTipoIdFiscal(String tipoIdFiscal) {
			this.tipoIdFiscal = tipoIdFiscal;
		}

		public String getTipoContribuyente() {
			return tipoContribuyente;
		}

		public void setTipoContribuyente(String tipoContribuyente) {
			this.tipoContribuyente = tipoContribuyente;
		}

		public String getVendedor() {
			return vendedor;
		}

		public void setVendedor(String vendedor) {
			this.vendedor = vendedor;
		}

		public String getCanal() {
			return canal;
		}

		public void setCanal(String canal) {
			this.canal = canal;
		}

		public String getActividad() {
			return actividad;
		}

		public void setActividad(String actividad) {
			this.actividad = actividad;
		}

		public String getRelacionadaSRI() {
			return relacionadaSRI;
		}

		public void setRelacionadaSRI(String relacionadaSRI) {
			this.relacionadaSRI = relacionadaSRI;
		}

		public String getOrigenIngresos() {
			return origenIngresos;
		}

		public void setOrigenIngresos(String origenIngresos) {
			this.origenIngresos = origenIngresos;
		}

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		public String getTipoPersona() {
			return tipoPersona;
		}

		public void setTipoPersona(String tipoPersona) {
			this.tipoPersona = tipoPersona;
		}

		public int getDireccionEntrega() {
			return direccionEntrega;
		}

		public void setDireccionEntrega(int direccionEntrega) {
			this.direccionEntrega = direccionEntrega;
		}

		public String getLineaDireccion1() {
			return lineaDireccion1;
		}

		public void setLineaDireccion1(String lineaDireccion1) {
			this.lineaDireccion1 = lineaDireccion1;
		}

		public String getLineaDireccion2() {
			return lineaDireccion2;
		}

		public void setLineaDireccion2(String lineaDireccion2) {
			this.lineaDireccion2 = lineaDireccion2;
		}

		public String getLineaDireccion3() {
			return lineaDireccion3;
		}

		public void setLineaDireccion3(String lineaDireccion3) {
			this.lineaDireccion3 = lineaDireccion3;
		}

		public String getLineaDireccion4() {
			return lineaDireccion4;
		}

		public void setLineaDireccion4(String lineaDireccion4) {
			this.lineaDireccion4 = lineaDireccion4;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public String getCanton() {
			return canton;
		}

		public void setCanton(String canton) {
			this.canton = canton;
		}

		public String getParroquia() {
			return parroquia;
		}

		public void setParroquia(String parroquia) {
			this.parroquia = parroquia;
		}

		public double getLatitud() {
			return latitud;
		}

		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}

		public double getLongitud() {
			return longitud;
		}

		public void setLongitud(double longitud) {
			this.longitud = longitud;
		}

		public String getCompania() {
			return compania;
		}

		public void setCompania(String compania) {
			this.compania = compania;
		}

		public int getCupoAsignado() {
			return cupoAsignado;
		}

		public void setCupoAsignado(int cupoAsignado) {
			this.cupoAsignado = cupoAsignado;
		}

		public String getVerificacionCredito() {
			return verificacionCredito;
		}

		public void setVerificacionCredito(String verificacionCredito) {
			this.verificacionCredito = verificacionCredito;
		}

		public String getPlazoPago() {
			return plazoPago;
		}

		public void setPlazoPago(String plazoPago) {
			this.plazoPago = plazoPago;
		}

		public String getInstrumentoPago() {
			return instrumentoPago;
		}

		public void setInstrumentoPago(String instrumentoPago) {
			this.instrumentoPago = instrumentoPago;
		}

		public String getCompensacionLM() {
			return compensacionLM;
		}

		public void setCompensacionLM(String compensacionLM) {
			this.compensacionLM = compensacionLM;
		}

		public String getCodigoRuta() {
			return codigoRuta;
		}

		public void setCodigoRuta(String codigoRuta) {
			this.codigoRuta = codigoRuta;
		}

		public String getZona() {
			return zona;
		}

		public void setZona(String zona) {
			this.zona = zona;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getTipoDirEntrega() {
			return tipoDirEntrega;
		}

		public void setTipoDirEntrega(String tipoDirEntrega) {
			this.tipoDirEntrega = tipoDirEntrega;
		}

		public String getSistema() {
			return sistema;
		}

		public void setSistema(String sistema) {
			this.sistema = sistema;
		}

		public int getEstadoCliente() {
			return estadoCliente;
		}

		public void setEstadoCliente(int estadoCliente) {
			this.estadoCliente = estadoCliente;
		}

        
    }
}
