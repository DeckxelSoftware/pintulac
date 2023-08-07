package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	
	@JsonProperty("INDICADORABC")
    private String indicadorAbc;

    @JsonProperty("HORA_BODEGAS")
    private String horaBodegas;

    @JsonProperty("HORA_ACTUALIZACION")
    private String horaActualizacion;

    @JsonProperty("NUMERO_CORTO")
    private int numeroCorto;

    @JsonProperty("CODIGO_PRODUCTO")
    private String codigoProducto;

    @JsonProperty("NUMERO_CATALOGO")
    private String numeroCatalogo;

    @JsonProperty("ESTADO_PRODUCTO")
    private String estadoProducto;

    @JsonProperty("DESCRIPCION1")
    private String descripcion1;

    @JsonProperty("DESCRIPCION2")
    private String descripcion2;

    @JsonProperty("PROVEEDOR")
    private int proveedor;

    @JsonProperty("DES_PROVEEDOR")
    private String desProveedor;

    @JsonProperty("DES_IMSRP1")
    private String desImsrp1;

    @JsonProperty("IMSRP1")
    private String imsrp1;

    @JsonProperty("DES_IMSRP2")
    private String desImsrp2;

    @JsonProperty("IMSRP2")
    private String imsrp2;

    @JsonProperty("DES_IMSRP3")
    private String desImsrp3;

    @JsonProperty("IMSRP3")
    private String imsrp3;

    @JsonProperty("DES_IMSRP4")
    private String desImsrp4;

    @JsonProperty("IMSRP4")
    private String imsrp4;

    @JsonProperty("DES_IMSRP5")
    private String desImsrp5;

    @JsonProperty("IMSRP5")
    private String imsrp5;

    @JsonProperty("DES_IMSRP6")
    private String desImsrp6;

    @JsonProperty("IMSRP6")
    private String imsrp6;

    @JsonProperty("DES_IMSRP7")
    private String desImsrp7;

    @JsonProperty("IMSRP7")
    private String imsrp7;

    @JsonProperty("DES_IMSRP8")
    private String desImsrp8;

    @JsonProperty("IMSRP8")
    private String imsrp8;

    @JsonProperty("DES_IMSRP9")
    private String desImsrp9;

    @JsonProperty("IMSRP9")
    private String imsrp9;

    @JsonProperty("DES_IMSRP0")
    private String desImsrp0;

    @JsonProperty("IMSRP0")
    private String imsrp0;

    @JsonProperty("ADICIONAL_01")
    private String adicional01;

    @JsonProperty("VALOR_ADICIONAL_01")
    private String valorAdicional01;

    @JsonProperty("ADICIONAL_02")
    private String adicional02;

    @JsonProperty("VALOR_ADICIONAL_02")
    private String valorAdicional02;

    @JsonProperty("ADICIONAL_03")
    private String adicional03;

    @JsonProperty("VALOR_ADICIONAL_03")
    private String valorAdicional03;

    @JsonProperty("ADICIONAL_04")
    private String adicional04;

    @JsonProperty("VALOR_ADICIONAL_04")
    private String valorAdicional04;

    @JsonProperty("ADICIONAL_05")
    private String adicional05;

    @JsonProperty("VALOR_ADICIONAL_05")
    private String valorAdicional05;

    @JsonProperty("ADICIONAL_06")
    private String adicional06;

    @JsonProperty("VALOR_ADICIONAL_06")
    private String valorAdicional06;

    @JsonProperty("ADICIONAL_07")
    private String adicional07;

    @JsonProperty("VALOR_ADICIONAL_07")
    private String valorAdicional07;

    @JsonProperty("ADICIONAL_08")
    private String adicional08;

    @JsonProperty("VALOR_ADICIONAL_08")
    private String valorAdicional08;

    @JsonProperty("BODEGA")
    private String bodega;

    @JsonProperty("DES_BODEGA")
    private String desBodega;

    @JsonProperty("PRECIO")
    private double precio;

    @JsonProperty("IVAVENTAS")
    private String ivaventas;

    @JsonProperty("CONVERSION_PESO")
    private int conversionPeso;

    @JsonProperty("UNIDAD_PESO")
    private String unidadPeso;

    @JsonProperty("UNIDAD_COMPRA")
    private String unidadCompra;

    @JsonProperty("DES_UNIDAD_MEDIDA_COMPRA")
    private String desUnidadMedidaCompra;

    @JsonProperty("UNIDAD_PRINCIPAL")
    private String unidadPrincipal;

    @JsonProperty("DES_UNIDAD_MEDIDA_PRINCIPAL")
    private String desUnidadMedidaPrincipal;

    @JsonProperty("UNIDAD_SECUNDARIA")
    private String unidadSecundaria;

    @JsonProperty("DES_UNIDAD_MEDIDA_SECUNDARIA")
    private String desUnidadMedidaSecundaria;

    @JsonProperty("CONVERSION_SECTOPRI")
    private int conversionSectopri;

    @JsonProperty("CONVERSION_COMTOPRI")
    private String conversionComtopri;

    @JsonProperty("COSTO_PROMEDIO")
    private double costoPromedio;

    @JsonProperty("COSTO_ULTIMA_COMPRA")
    private double costoUltimaCompra;

    @JsonProperty("GL_CLASS")
    private String glClass;

    @JsonProperty("TIPO_LINEA")
    private String tipoLinea;

    @JsonProperty("MARGEN")
    private double margen;

	public Item() {
		super();
	}

	public String getIndicadorAbc() {
		return indicadorAbc;
	}

	public void setIndicadorAbc(String indicadorAbc) {
		this.indicadorAbc = indicadorAbc;
	}

	public String getHoraBodegas() {
		return horaBodegas;
	}

	public void setHoraBodegas(String horaBodegas) {
		this.horaBodegas = horaBodegas;
	}

	public String getHoraActualizacion() {
		return horaActualizacion;
	}

	public void setHoraActualizacion(String horaActualizacion) {
		this.horaActualizacion = horaActualizacion;
	}

	public int getNumeroCorto() {
		return numeroCorto;
	}

	public void setNumeroCorto(int numeroCorto) {
		this.numeroCorto = numeroCorto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNumeroCatalogo() {
		return numeroCatalogo;
	}

	public void setNumeroCatalogo(String numeroCatalogo) {
		this.numeroCatalogo = numeroCatalogo;
	}

	public String getEstadoProducto() {
		return estadoProducto;
	}

	public void setEstadoProducto(String estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public String getDescripcion1() {
		return descripcion1;
	}

	public void setDescripcion1(String descripcion1) {
		this.descripcion1 = descripcion1;
	}

	public String getDescripcion2() {
		return descripcion2;
	}

	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
	}

	public int getProveedor() {
		return proveedor;
	}

	public void setProveedor(int proveedor) {
		this.proveedor = proveedor;
	}

	public String getDesProveedor() {
		return desProveedor;
	}

	public void setDesProveedor(String desProveedor) {
		this.desProveedor = desProveedor;
	}

	public String getDesImsrp1() {
		return desImsrp1;
	}

	public void setDesImsrp1(String desImsrp1) {
		this.desImsrp1 = desImsrp1;
	}

	public String getImsrp1() {
		return imsrp1;
	}

	public void setImsrp1(String imsrp1) {
		this.imsrp1 = imsrp1;
	}

	public String getDesImsrp2() {
		return desImsrp2;
	}

	public void setDesImsrp2(String desImsrp2) {
		this.desImsrp2 = desImsrp2;
	}

	public String getImsrp2() {
		return imsrp2;
	}

	public void setImsrp2(String imsrp2) {
		this.imsrp2 = imsrp2;
	}

	public String getDesImsrp3() {
		return desImsrp3;
	}

	public void setDesImsrp3(String desImsrp3) {
		this.desImsrp3 = desImsrp3;
	}

	public String getImsrp3() {
		return imsrp3;
	}

	public void setImsrp3(String imsrp3) {
		this.imsrp3 = imsrp3;
	}

	public String getDesImsrp4() {
		return desImsrp4;
	}

	public void setDesImsrp4(String desImsrp4) {
		this.desImsrp4 = desImsrp4;
	}

	public String getImsrp4() {
		return imsrp4;
	}

	public void setImsrp4(String imsrp4) {
		this.imsrp4 = imsrp4;
	}

	public String getDesImsrp5() {
		return desImsrp5;
	}

	public void setDesImsrp5(String desImsrp5) {
		this.desImsrp5 = desImsrp5;
	}

	public String getImsrp5() {
		return imsrp5;
	}

	public void setImsrp5(String imsrp5) {
		this.imsrp5 = imsrp5;
	}

	public String getDesImsrp6() {
		return desImsrp6;
	}

	public void setDesImsrp6(String desImsrp6) {
		this.desImsrp6 = desImsrp6;
	}

	public String getImsrp6() {
		return imsrp6;
	}

	public void setImsrp6(String imsrp6) {
		this.imsrp6 = imsrp6;
	}

	public String getDesImsrp7() {
		return desImsrp7;
	}

	public void setDesImsrp7(String desImsrp7) {
		this.desImsrp7 = desImsrp7;
	}

	public String getImsrp7() {
		return imsrp7;
	}

	public void setImsrp7(String imsrp7) {
		this.imsrp7 = imsrp7;
	}

	public String getDesImsrp8() {
		return desImsrp8;
	}

	public void setDesImsrp8(String desImsrp8) {
		this.desImsrp8 = desImsrp8;
	}

	public String getImsrp8() {
		return imsrp8;
	}

	public void setImsrp8(String imsrp8) {
		this.imsrp8 = imsrp8;
	}

	public String getDesImsrp9() {
		return desImsrp9;
	}

	public void setDesImsrp9(String desImsrp9) {
		this.desImsrp9 = desImsrp9;
	}

	public String getImsrp9() {
		return imsrp9;
	}

	public void setImsrp9(String imsrp9) {
		this.imsrp9 = imsrp9;
	}

	public String getDesImsrp0() {
		return desImsrp0;
	}

	public void setDesImsrp0(String desImsrp0) {
		this.desImsrp0 = desImsrp0;
	}

	public String getImsrp0() {
		return imsrp0;
	}

	public void setImsrp0(String imsrp0) {
		this.imsrp0 = imsrp0;
	}

	public String getAdicional01() {
		return adicional01;
	}

	public void setAdicional01(String adicional01) {
		this.adicional01 = adicional01;
	}

	public String getValorAdicional01() {
		return valorAdicional01;
	}

	public void setValorAdicional01(String valorAdicional01) {
		this.valorAdicional01 = valorAdicional01;
	}

	public String getAdicional02() {
		return adicional02;
	}

	public void setAdicional02(String adicional02) {
		this.adicional02 = adicional02;
	}

	public String getValorAdicional02() {
		return valorAdicional02;
	}

	public void setValorAdicional02(String valorAdicional02) {
		this.valorAdicional02 = valorAdicional02;
	}

	public String getAdicional03() {
		return adicional03;
	}

	public void setAdicional03(String adicional03) {
		this.adicional03 = adicional03;
	}

	public String getValorAdicional03() {
		return valorAdicional03;
	}

	public void setValorAdicional03(String valorAdicional03) {
		this.valorAdicional03 = valorAdicional03;
	}

	public String getAdicional04() {
		return adicional04;
	}

	public void setAdicional04(String adicional04) {
		this.adicional04 = adicional04;
	}

	public String getValorAdicional04() {
		return valorAdicional04;
	}

	public void setValorAdicional04(String valorAdicional04) {
		this.valorAdicional04 = valorAdicional04;
	}

	public String getAdicional05() {
		return adicional05;
	}

	public void setAdicional05(String adicional05) {
		this.adicional05 = adicional05;
	}

	public String getValorAdicional05() {
		return valorAdicional05;
	}

	public void setValorAdicional05(String valorAdicional05) {
		this.valorAdicional05 = valorAdicional05;
	}

	public String getAdicional06() {
		return adicional06;
	}

	public void setAdicional06(String adicional06) {
		this.adicional06 = adicional06;
	}

	public String getValorAdicional06() {
		return valorAdicional06;
	}

	public void setValorAdicional06(String valorAdicional06) {
		this.valorAdicional06 = valorAdicional06;
	}

	public String getAdicional07() {
		return adicional07;
	}

	public void setAdicional07(String adicional07) {
		this.adicional07 = adicional07;
	}

	public String getValorAdicional07() {
		return valorAdicional07;
	}

	public void setValorAdicional07(String valorAdicional07) {
		this.valorAdicional07 = valorAdicional07;
	}

	public String getAdicional08() {
		return adicional08;
	}

	public void setAdicional08(String adicional08) {
		this.adicional08 = adicional08;
	}

	public String getValorAdicional08() {
		return valorAdicional08;
	}

	public void setValorAdicional08(String valorAdicional08) {
		this.valorAdicional08 = valorAdicional08;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public String getDesBodega() {
		return desBodega;
	}

	public void setDesBodega(String desBodega) {
		this.desBodega = desBodega;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIvaventas() {
		return ivaventas;
	}

	public void setIvaventas(String ivaventas) {
		this.ivaventas = ivaventas;
	}

	public int getConversionPeso() {
		return conversionPeso;
	}

	public void setConversionPeso(int conversionPeso) {
		this.conversionPeso = conversionPeso;
	}

	public String getUnidadPeso() {
		return unidadPeso;
	}

	public void setUnidadPeso(String unidadPeso) {
		this.unidadPeso = unidadPeso;
	}

	public String getUnidadCompra() {
		return unidadCompra;
	}

	public void setUnidadCompra(String unidadCompra) {
		this.unidadCompra = unidadCompra;
	}

	public String getDesUnidadMedidaCompra() {
		return desUnidadMedidaCompra;
	}

	public void setDesUnidadMedidaCompra(String desUnidadMedidaCompra) {
		this.desUnidadMedidaCompra = desUnidadMedidaCompra;
	}

	public String getUnidadPrincipal() {
		return unidadPrincipal;
	}

	public void setUnidadPrincipal(String unidadPrincipal) {
		this.unidadPrincipal = unidadPrincipal;
	}

	public String getDesUnidadMedidaPrincipal() {
		return desUnidadMedidaPrincipal;
	}

	public void setDesUnidadMedidaPrincipal(String desUnidadMedidaPrincipal) {
		this.desUnidadMedidaPrincipal = desUnidadMedidaPrincipal;
	}

	public String getUnidadSecundaria() {
		return unidadSecundaria;
	}

	public void setUnidadSecundaria(String unidadSecundaria) {
		this.unidadSecundaria = unidadSecundaria;
	}

	public String getDesUnidadMedidaSecundaria() {
		return desUnidadMedidaSecundaria;
	}

	public void setDesUnidadMedidaSecundaria(String desUnidadMedidaSecundaria) {
		this.desUnidadMedidaSecundaria = desUnidadMedidaSecundaria;
	}

	public int getConversionSectopri() {
		return conversionSectopri;
	}

	public void setConversionSectopri(int conversionSectopri) {
		this.conversionSectopri = conversionSectopri;
	}

	public String getConversionComtopri() {
		return conversionComtopri;
	}

	public void setConversionComtopri(String conversionComtopri) {
		this.conversionComtopri = conversionComtopri;
	}

	public double getCostoPromedio() {
		return costoPromedio;
	}

	public void setCostoPromedio(double costoPromedio) {
		this.costoPromedio = costoPromedio;
	}

	public double getCostoUltimaCompra() {
		return costoUltimaCompra;
	}

	public void setCostoUltimaCompra(double costoUltimaCompra) {
		this.costoUltimaCompra = costoUltimaCompra;
	}

	public String getGlClass() {
		return glClass;
	}

	public void setGlClass(String glClass) {
		this.glClass = glClass;
	}

	public String getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(String tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

	public double getMargen() {
		return margen;
	}

	public void setMargen(double margen) {
		this.margen = margen;
	}
    
    
}
