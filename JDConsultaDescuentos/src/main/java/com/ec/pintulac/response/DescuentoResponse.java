package com.ec.pintulac.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescuentoResponse {

    @JsonProperty("Nom_ajuste")
    private String nomAjuste;

    @JsonProperty("Descripcion")
    private String descripcion;

    @JsonProperty("2_n_articulo")
    private String nArticulo;

    @JsonProperty("Valor_factor_nmco")
    private int valorFactorNmco;

    @JsonProperty("Fecha_efectiva")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaEfectiva;

    @JsonProperty("Fecha_vto")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaVto;

    @JsonProperty("ID_clave_gp_clnt")
    private int idClaveGpClnt;

    @JsonProperty("Linea_descripcion_2")
    private String lineaDescripcion2;

    @JsonProperty("Linea_descr_3")
    private String lineaDescr3;

    @JsonProperty("Clasf_mcia")
    private String clasfMcia;

    @JsonProperty("Fecha_actz")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaActz;

    @JsonProperty("Hora_dia")
    private int horaDia;

    @JsonProperty("jde__status")
    private String jdeStatus;

    @JsonProperty("jde__startTimestamp")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date jdeStartTimestamp;

    @JsonProperty("jde__endTimestamp")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date jdeEndTimestamp;

    @JsonProperty("jde__serverExecutionSeconds")
    private double jdeServerExecutionSeconds;


}
