package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeVentaLogisticaFacturacion;


@SuppressWarnings("unused")
@Repository
public interface VwJDVentaLogisticaFacturacionRepository  extends JpaRepository<VwJdeVentaLogisticaFacturacion, String>{

}
