package com.ec.pintulac.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeVentaKit;


@SuppressWarnings("unused")
@Repository
public interface VwJdeVentaKitRepository  extends JpaRepository<VwJdeVentaKit, String>{

	
	@Query("SELECT u FROM VwJdeVentaKit u WHERE  u.numero=:numero")
	List<VwJdeVentaKit> buscarPorNumeroFactura(
			@Param("numero") BigDecimal numero);
}
