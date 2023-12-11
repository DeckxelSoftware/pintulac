package com.ec.pintulac.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeVentasLogistica;


@SuppressWarnings("unused")
@Repository
public interface VwCrearOrderTransferenciaLogisticaRepository  extends JpaRepository<VwJdeVentasLogistica, String>{

	
	@Query("SELECT u FROM VwJdeVentasLogistica u WHERE  u.numero=:numero")
	List<VwJdeVentasLogistica> buscarPorNumeroFactura(
			@Param("numero") BigDecimal numero);
}
