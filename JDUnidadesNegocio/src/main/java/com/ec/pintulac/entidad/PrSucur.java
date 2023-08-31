package com.ec.pintulac.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "PR_SUCUR")
public class PrSucur implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrSucurPK prSucurPK;
    @Basic(optional = false)
    @Column(name = "SU_NOMBRE")
    private String suNombre;
    @Basic(optional = false)
    @Column(name = "SU_CALLE1")
    private String suCalle1;
    @Column(name = "SU_CALLE2")
    private String suCalle2;
    @Basic(optional = false)
    @Column(name = "SU_TELEF1")
    private String suTelef1;
    @Column(name = "SU_TELEF2")
    private String suTelef2;
    @Column(name = "SU_FAX")
    private String suFax;
    @Basic(optional = false)
    @Column(name = "SU_NOMREP")
    private String suNomrep;
    @Basic(optional = false)
    @Column(name = "SU_APEREP")
    private String suAperep;
    @Column(name = "SU_RUC")
    private String suRuc;
    @Column(name = "SU_JUZGADO")
    private String suJuzgado;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "SU_CIUDAD")
    private String suCiudad;
    @Column(name = "SU_REGIMEN")
    private String suRegimen;
    @Column(name = "SU_GRUPO")
    private String suGrupo;
    @Column(name = "CS_CODIGO")
    private String csCodigo;
    @Basic(optional = false)
    @Column(name = "PA_CODIGO")
    private String paCodigo;
    @Basic(optional = false)
    @Column(name = "PO_CODIGO")
    private String poCodigo;
    @Basic(optional = false)
    @Column(name = "CT_CODIGO")
    private String ctCodigo;
    @Column(name = "SU_ACTIVO")
    private String suActivo;
    @Column(name = "SU_GPS")
    private String suGps;
    @Column(name = "EP_CODIGO")
    private String epCodigo;
    @Column(name = "SU_OBSERV")
    private String suObserv;
    @Column(name = "SU_TIPO")
    private String suTipo;
    @Column(name = "SU_FECINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date suFecinicio;
    @Column(name = "SU_FECCIERRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date suFeccierre;
    @Column(name = "SU_HORARION")
    private String suHorarion;
    @Column(name = "SU_HORARIOF")
    private String suHorariof;
    @Column(name = "SU_EMAIL")
    private String suEmail;
    @Column(name = "SU_TELFIP")
    private String suTelfip;
    @Column(name = "SU_RED")
    private String suRed;
    @Column(name = "GV_CODIGO")
    private String gvCodigo;
    @Column(name = "IM_CODIGO")
    private String imCodigo;
    @Column(name = "SU_DESCIVA")
    private Short suDesciva;
    @Column(name = "PL_CODVENT")
    private String plCodvent;
    @Column(name = "PL_CODDEVO")
    private String plCoddevo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SU_MARGLOC")
    private BigDecimal suMargloc;
    @Column(name = "SU_MARGIMP")
    private BigDecimal suMargimp;
    @Column(name = "PD_MID")
    private String pdMid;
    @Column(name = "SU_TIPOTIENDA")
    private String suTipotienda;
    @Column(name = "SU_CODRAPPI")
    private String suCodrappi;
    
    
    public PrSucur() {
    }

    public PrSucur(PrSucurPK prSucurPK) {
        this.prSucurPK = prSucurPK;
    }

    public PrSucur(PrSucurPK prSucurPK, String suNombre, String suCalle1, String suTelef1, String suNomrep, String suAperep, String paCodigo, String poCodigo, String ctCodigo) {
        this.prSucurPK = prSucurPK;
        this.suNombre = suNombre;
        this.suCalle1 = suCalle1;
        this.suTelef1 = suTelef1;
        this.suNomrep = suNomrep;
        this.suAperep = suAperep;
        this.paCodigo = paCodigo;
        this.poCodigo = poCodigo;
        this.ctCodigo = ctCodigo;
    }

    public PrSucur(String emCodigo, String suCodigo) {
        this.prSucurPK = new PrSucurPK(emCodigo, suCodigo);
    }

    public PrSucurPK getPrSucurPK() {
        return prSucurPK;
    }

    public void setPrSucurPK(PrSucurPK prSucurPK) {
        this.prSucurPK = prSucurPK;
    }

    public String getSuNombre() {
        return suNombre;
    }

    public void setSuNombre(String suNombre) {
        this.suNombre = suNombre;
    }

    public String getSuCalle1() {
        return suCalle1;
    }

    public void setSuCalle1(String suCalle1) {
        this.suCalle1 = suCalle1;
    }

    public String getSuCalle2() {
        return suCalle2;
    }

    public void setSuCalle2(String suCalle2) {
        this.suCalle2 = suCalle2;
    }

    public String getSuTelef1() {
        return suTelef1;
    }

    public void setSuTelef1(String suTelef1) {
        this.suTelef1 = suTelef1;
    }

    public String getSuTelef2() {
        return suTelef2;
    }

    public void setSuTelef2(String suTelef2) {
        this.suTelef2 = suTelef2;
    }

    public String getSuFax() {
        return suFax;
    }

    public void setSuFax(String suFax) {
        this.suFax = suFax;
    }

    public String getSuNomrep() {
        return suNomrep;
    }

    public void setSuNomrep(String suNomrep) {
        this.suNomrep = suNomrep;
    }

    public String getSuAperep() {
        return suAperep;
    }

    public void setSuAperep(String suAperep) {
        this.suAperep = suAperep;
    }

    public String getSuRuc() {
        return suRuc;
    }

    public void setSuRuc(String suRuc) {
        this.suRuc = suRuc;
    }

    public String getSuJuzgado() {
        return suJuzgado;
    }

    public void setSuJuzgado(String suJuzgado) {
        this.suJuzgado = suJuzgado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSuCiudad() {
        return suCiudad;
    }

    public void setSuCiudad(String suCiudad) {
        this.suCiudad = suCiudad;
    }

    public String getSuRegimen() {
        return suRegimen;
    }

    public void setSuRegimen(String suRegimen) {
        this.suRegimen = suRegimen;
    }

    public String getSuGrupo() {
        return suGrupo;
    }

    public void setSuGrupo(String suGrupo) {
        this.suGrupo = suGrupo;
    }

    public String getCsCodigo() {
        return csCodigo;
    }

    public void setCsCodigo(String csCodigo) {
        this.csCodigo = csCodigo;
    }

    public String getPaCodigo() {
        return paCodigo;
    }

    public void setPaCodigo(String paCodigo) {
        this.paCodigo = paCodigo;
    }

    public String getPoCodigo() {
        return poCodigo;
    }

    public void setPoCodigo(String poCodigo) {
        this.poCodigo = poCodigo;
    }

    public String getCtCodigo() {
        return ctCodigo;
    }

    public void setCtCodigo(String ctCodigo) {
        this.ctCodigo = ctCodigo;
    }

    public String getSuActivo() {
        return suActivo;
    }

    public void setSuActivo(String suActivo) {
        this.suActivo = suActivo;
    }

    public String getSuGps() {
        return suGps;
    }

    public void setSuGps(String suGps) {
        this.suGps = suGps;
    }

    public String getEpCodigo() {
        return epCodigo;
    }

    public void setEpCodigo(String epCodigo) {
        this.epCodigo = epCodigo;
    }

    public String getSuObserv() {
        return suObserv;
    }

    public void setSuObserv(String suObserv) {
        this.suObserv = suObserv;
    }

    public String getSuTipo() {
        return suTipo;
    }

    public void setSuTipo(String suTipo) {
        this.suTipo = suTipo;
    }

    public Date getSuFecinicio() {
        return suFecinicio;
    }

    public void setSuFecinicio(Date suFecinicio) {
        this.suFecinicio = suFecinicio;
    }

    public Date getSuFeccierre() {
        return suFeccierre;
    }

    public void setSuFeccierre(Date suFeccierre) {
        this.suFeccierre = suFeccierre;
    }

    public String getSuHorarion() {
        return suHorarion;
    }

    public void setSuHorarion(String suHorarion) {
        this.suHorarion = suHorarion;
    }

    public String getSuHorariof() {
        return suHorariof;
    }

    public void setSuHorariof(String suHorariof) {
        this.suHorariof = suHorariof;
    }

    public String getSuEmail() {
        return suEmail;
    }

    public void setSuEmail(String suEmail) {
        this.suEmail = suEmail;
    }

    public String getSuTelfip() {
        return suTelfip;
    }

    public void setSuTelfip(String suTelfip) {
        this.suTelfip = suTelfip;
    }

    public String getSuRed() {
        return suRed;
    }

    public void setSuRed(String suRed) {
        this.suRed = suRed;
    }

    public String getGvCodigo() {
        return gvCodigo;
    }

    public void setGvCodigo(String gvCodigo) {
        this.gvCodigo = gvCodigo;
    }

    public String getImCodigo() {
        return imCodigo;
    }

    public void setImCodigo(String imCodigo) {
        this.imCodigo = imCodigo;
    }

    public Short getSuDesciva() {
        return suDesciva;
    }

    public void setSuDesciva(Short suDesciva) {
        this.suDesciva = suDesciva;
    }

    public String getPlCodvent() {
        return plCodvent;
    }

    public void setPlCodvent(String plCodvent) {
        this.plCodvent = plCodvent;
    }

    public String getPlCoddevo() {
        return plCoddevo;
    }

    public void setPlCoddevo(String plCoddevo) {
        this.plCoddevo = plCoddevo;
    }

    public BigDecimal getSuMargloc() {
        return suMargloc;
    }

    public void setSuMargloc(BigDecimal suMargloc) {
        this.suMargloc = suMargloc;
    }

    public BigDecimal getSuMargimp() {
        return suMargimp;
    }

    public void setSuMargimp(BigDecimal suMargimp) {
        this.suMargimp = suMargimp;
    }

    public String getPdMid() {
        return pdMid;
    }

    public void setPdMid(String pdMid) {
        this.pdMid = pdMid;
    }

    public String getSuTipotienda() {
        return suTipotienda;
    }

    public void setSuTipotienda(String suTipotienda) {
        this.suTipotienda = suTipotienda;
    }

    public String getSuCodrappi() {
        return suCodrappi;
    }

    public void setSuCodrappi(String suCodrappi) {
        this.suCodrappi = suCodrappi;
    }

   
    
}
