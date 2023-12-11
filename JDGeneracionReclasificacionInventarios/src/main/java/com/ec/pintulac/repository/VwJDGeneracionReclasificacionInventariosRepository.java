package com.ec.pintulac.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeGeneracionReclasificacionInventarios;



@SuppressWarnings("unused")
@Repository
public interface VwJDGeneracionReclasificacionInventariosRepository  extends JpaRepository<VwJdeGeneracionReclasificacionInventarios, String>{
	@Query("SELECT u FROM VwJdeGeneracionReclasificacionInventarios u WHERE  u.numero=:numero")
	List<VwJdeGeneracionReclasificacionInventarios> buscarPorNumeroFactura(
			@Param("numero") BigDecimal numero);
}
