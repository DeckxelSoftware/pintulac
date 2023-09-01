
package com.ec.pintulac.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "EM_CODIGO", "SU_CODIGO", "SU_NOMBRE", "SU_CALLE1", "SU_TELEF1", "SU_TELEF2", "SU_FAX",
		"SU_NOMREP", "SU_JUZGADO", "SU_CIUDAD", "SU_REGIMEN", "SU_GRUPO", "CS_CODIGO", "PA_CODIGO", "PO_CODIGO",
		"CT_CODIGO", "SU_GPS", "EP_CODIGO", "SU_HORARION", "SU_EMAIL", "SU_RED", "GV_CODIGO", "IM_CODIGO", "SU_DESCIVA",
		"SU_MARGLOC", "SU_MARGIMP", "PD_MID", "SU_TIPOTIENDA", "UNIDAD_RELACIONADA", "SU_ACTIVO", "SU_FECINICIO",
		"BO_WEBACTIVO", "BO_CONSTRANS", "BO_TRANSITO", "BO_LOCAL", "BO_MOVDESPACHO", "BO_AJCONSIGNA" })
@Generated("jsonschema2pojo")
public class Row {

	@JsonProperty("EM_CODIGO")
	private String emCodigo;
	@JsonProperty("SU_CODIGO")
	private String suCodigo;
	@JsonProperty("SU_NOMBRE")
	private String suNombre;
	@JsonProperty("SU_CALLE1")
	private String suCalle1;
	@JsonProperty("SU_TELEF1")
	private String suTelef1;
	@JsonProperty("SU_TELEF2")
	private String suTelef2;
	@JsonProperty("SU_FAX")
	private String suFax;
	@JsonProperty("SU_NOMREP")
	private String suNomrep;
	@JsonProperty("SU_JUZGADO")
	private String suJuzgado;
	@JsonProperty("SU_CIUDAD")
	private String suCiudad;
	@JsonProperty("SU_REGIMEN")
	private String suRegimen;
	@JsonProperty("SU_GRUPO")
	private String suGrupo;
	@JsonProperty("CS_CODIGO")
	private String csCodigo;
	@JsonProperty("PA_CODIGO")
	private String paCodigo;
	@JsonProperty("PO_CODIGO")
	private String poCodigo;
	@JsonProperty("CT_CODIGO")
	private String ctCodigo;
	@JsonProperty("SU_GPS")
	private String suGps;
	@JsonProperty("EP_CODIGO")
	private String epCodigo;
	@JsonProperty("SU_HORARION")
	private String suHorarion;
	@JsonProperty("SU_EMAIL")
	private String suEmail;
	@JsonProperty("SU_RED")
	private String suRed;
	@JsonProperty("GV_CODIGO")
	private String gvCodigo;
	@JsonProperty("IM_CODIGO")
	private String imCodigo;
	@JsonProperty("SU_DESCIVA")
	private String suDesciva;
	@JsonProperty("SU_MARGLOC")
	private String suMargloc;
	@JsonProperty("SU_MARGIMP")
	private String suMargimp;
	@JsonProperty("PD_MID")
	private String pdMid;
	@JsonProperty("SU_TIPOTIENDA")
	private String suTipotienda;
	@JsonProperty("UNIDAD_RELACIONADA")
	private String unidadRelacionada;
	@JsonProperty("SU_ACTIVO")
	private String suActivo;
	@JsonProperty("SU_FECINICIO")
	private String suFecinicio;
	@JsonProperty("BO_WEBACTIVO")
	private String boWebactivo;
	@JsonProperty("BO_CONSTRANS")
	private String boConstrans;
	@JsonProperty("BO_TRANSITO")
	private String boTransito;
	@JsonProperty("BO_LOCAL")
	private String boLocal;
	@JsonProperty("BO_MOVDESPACHO")
	private String boMovdespacho;
	@JsonProperty("BO_AJCONSIGNA")
	private String boAjconsigna;

	@JsonProperty("EM_CODIGO")
	public String getEmCodigo() {
		return emCodigo;
	}

	@JsonProperty("EM_CODIGO")
	public void setEmCodigo(String emCodigo) {
		this.emCodigo = emCodigo;
	}

	@JsonProperty("SU_CODIGO")
	public String getSuCodigo() {
		return suCodigo;
	}

	@JsonProperty("SU_CODIGO")
	public void setSuCodigo(String suCodigo) {
		this.suCodigo = suCodigo;
	}

	@JsonProperty("SU_NOMBRE")
	public String getSuNombre() {
		return suNombre;
	}

	@JsonProperty("SU_NOMBRE")
	public void setSuNombre(String suNombre) {
		this.suNombre = suNombre;
	}

	@JsonProperty("SU_CALLE1")
	public String getSuCalle1() {
		return suCalle1;
	}

	@JsonProperty("SU_CALLE1")
	public void setSuCalle1(String suCalle1) {
		this.suCalle1 = suCalle1;
	}

	@JsonProperty("SU_TELEF1")
	public String getSuTelef1() {
		return suTelef1;
	}

	@JsonProperty("SU_TELEF1")
	public void setSuTelef1(String suTelef1) {
		this.suTelef1 = suTelef1;
	}

	@JsonProperty("SU_TELEF2")
	public String getSuTelef2() {
		return suTelef2;
	}

	@JsonProperty("SU_TELEF2")
	public void setSuTelef2(String suTelef2) {
		this.suTelef2 = suTelef2;
	}

	@JsonProperty("SU_FAX")
	public String getSuFax() {
		return suFax;
	}

	@JsonProperty("SU_FAX")
	public void setSuFax(String suFax) {
		this.suFax = suFax;
	}

	@JsonProperty("SU_NOMREP")
	public String getSuNomrep() {
		return suNomrep;
	}

	@JsonProperty("SU_NOMREP")
	public void setSuNomrep(String suNomrep) {
		this.suNomrep = suNomrep;
	}

	@JsonProperty("SU_JUZGADO")
	public String getSuJuzgado() {
		return suJuzgado;
	}

	@JsonProperty("SU_JUZGADO")
	public void setSuJuzgado(String suJuzgado) {
		this.suJuzgado = suJuzgado;
	}

	@JsonProperty("SU_CIUDAD")
	public String getSuCiudad() {
		return suCiudad;
	}

	@JsonProperty("SU_CIUDAD")
	public void setSuCiudad(String suCiudad) {
		this.suCiudad = suCiudad;
	}

	@JsonProperty("SU_REGIMEN")
	public String getSuRegimen() {
		return suRegimen;
	}

	@JsonProperty("SU_REGIMEN")
	public void setSuRegimen(String suRegimen) {
		this.suRegimen = suRegimen;
	}

	@JsonProperty("SU_GRUPO")
	public String getSuGrupo() {
		return suGrupo;
	}

	@JsonProperty("SU_GRUPO")
	public void setSuGrupo(String suGrupo) {
		this.suGrupo = suGrupo;
	}

	@JsonProperty("CS_CODIGO")
	public String getCsCodigo() {
		return csCodigo;
	}

	@JsonProperty("CS_CODIGO")
	public void setCsCodigo(String csCodigo) {
		this.csCodigo = csCodigo;
	}

	@JsonProperty("PA_CODIGO")
	public String getPaCodigo() {
		return paCodigo;
	}

	@JsonProperty("PA_CODIGO")
	public void setPaCodigo(String paCodigo) {
		this.paCodigo = paCodigo;
	}

	@JsonProperty("PO_CODIGO")
	public String getPoCodigo() {
		return poCodigo;
	}

	@JsonProperty("PO_CODIGO")
	public void setPoCodigo(String poCodigo) {
		this.poCodigo = poCodigo;
	}

	@JsonProperty("CT_CODIGO")
	public String getCtCodigo() {
		return ctCodigo;
	}

	@JsonProperty("CT_CODIGO")
	public void setCtCodigo(String ctCodigo) {
		this.ctCodigo = ctCodigo;
	}

	@JsonProperty("SU_GPS")
	public String getSuGps() {
		return suGps;
	}

	@JsonProperty("SU_GPS")
	public void setSuGps(String suGps) {
		this.suGps = suGps;
	}

	@JsonProperty("EP_CODIGO")
	public String getEpCodigo() {
		return epCodigo;
	}

	@JsonProperty("EP_CODIGO")
	public void setEpCodigo(String epCodigo) {
		this.epCodigo = epCodigo;
	}

	@JsonProperty("SU_HORARION")
	public String getSuHorarion() {
		return suHorarion;
	}

	@JsonProperty("SU_HORARION")
	public void setSuHorarion(String suHorarion) {
		this.suHorarion = suHorarion;
	}

	@JsonProperty("SU_EMAIL")
	public String getSuEmail() {
		return suEmail;
	}

	@JsonProperty("SU_EMAIL")
	public void setSuEmail(String suEmail) {
		this.suEmail = suEmail;
	}

	@JsonProperty("SU_RED")
	public String getSuRed() {
		return suRed;
	}

	@JsonProperty("SU_RED")
	public void setSuRed(String suRed) {
		this.suRed = suRed;
	}

	@JsonProperty("GV_CODIGO")
	public String getGvCodigo() {
		return gvCodigo;
	}

	@JsonProperty("GV_CODIGO")
	public void setGvCodigo(String gvCodigo) {
		this.gvCodigo = gvCodigo;
	}

	@JsonProperty("IM_CODIGO")
	public String getImCodigo() {
		return imCodigo;
	}

	@JsonProperty("IM_CODIGO")
	public void setImCodigo(String imCodigo) {
		this.imCodigo = imCodigo;
	}

	@JsonProperty("SU_DESCIVA")
	public String getSuDesciva() {
		return suDesciva;
	}

	@JsonProperty("SU_DESCIVA")
	public void setSuDesciva(String suDesciva) {
		this.suDesciva = suDesciva;
	}

	@JsonProperty("SU_MARGLOC")
	public String getSuMargloc() {
		return suMargloc;
	}

	@JsonProperty("SU_MARGLOC")
	public void setSuMargloc(String suMargloc) {
		this.suMargloc = suMargloc;
	}

	@JsonProperty("SU_MARGIMP")
	public String getSuMargimp() {
		return suMargimp;
	}

	@JsonProperty("SU_MARGIMP")
	public void setSuMargimp(String suMargimp) {
		this.suMargimp = suMargimp;
	}

	@JsonProperty("PD_MID")
	public String getPdMid() {
		return pdMid;
	}

	@JsonProperty("PD_MID")
	public void setPdMid(String pdMid) {
		this.pdMid = pdMid;
	}

	@JsonProperty("SU_TIPOTIENDA")
	public String getSuTipotienda() {
		return suTipotienda;
	}

	@JsonProperty("SU_TIPOTIENDA")
	public void setSuTipotienda(String suTipotienda) {
		this.suTipotienda = suTipotienda;
	}

	@JsonProperty("UNIDAD_RELACIONADA")
	public String getUnidadRelacionada() {
		return unidadRelacionada;
	}

	@JsonProperty("UNIDAD_RELACIONADA")
	public void setUnidadRelacionada(String unidadRelacionada) {
		this.unidadRelacionada = unidadRelacionada;
	}

	@JsonProperty("SU_ACTIVO")
	public String getSuActivo() {
		return suActivo;
	}

	@JsonProperty("SU_ACTIVO")
	public void setSuActivo(String suActivo) {
		this.suActivo = suActivo;
	}

	@JsonProperty("SU_FECINICIO")
	public String getSuFecinicio() {
		return suFecinicio;
	}

	@JsonProperty("SU_FECINICIO")
	public void setSuFecinicio(String suFecinicio) {
		this.suFecinicio = suFecinicio;
	}

	@JsonProperty("BO_WEBACTIVO")
	public String getBoWebactivo() {
		return boWebactivo;
	}

	@JsonProperty("BO_WEBACTIVO")
	public void setBoWebactivo(String boWebactivo) {
		this.boWebactivo = boWebactivo;
	}

	@JsonProperty("BO_CONSTRANS")
	public String getBoConstrans() {
		return boConstrans;
	}

	@JsonProperty("BO_CONSTRANS")
	public void setBoConstrans(String boConstrans) {
		this.boConstrans = boConstrans;
	}

	@JsonProperty("BO_TRANSITO")
	public String getBoTransito() {
		return boTransito;
	}

	@JsonProperty("BO_TRANSITO")
	public void setBoTransito(String boTransito) {
		this.boTransito = boTransito;
	}

	@JsonProperty("BO_LOCAL")
	public String getBoLocal() {
		return boLocal;
	}

	@JsonProperty("BO_LOCAL")
	public void setBoLocal(String boLocal) {
		this.boLocal = boLocal;
	}

	@JsonProperty("BO_MOVDESPACHO")
	public String getBoMovdespacho() {
		return boMovdespacho;
	}

	@JsonProperty("BO_MOVDESPACHO")
	public void setBoMovdespacho(String boMovdespacho) {
		this.boMovdespacho = boMovdespacho;
	}

	@JsonProperty("BO_AJCONSIGNA")
	public String getBoAjconsigna() {
		return boAjconsigna;
	}

	@JsonProperty("BO_AJCONSIGNA")
	public void setBoAjconsigna(String boAjconsigna) {
		this.boAjconsigna = boAjconsigna;
	}

}