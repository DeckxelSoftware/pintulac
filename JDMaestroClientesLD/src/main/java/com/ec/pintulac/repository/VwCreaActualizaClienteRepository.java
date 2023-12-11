package com.ec.pintulac.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwCrearActualizaCliente;


@SuppressWarnings("unused")
@Repository
public interface VwCreaActualizaClienteRepository  extends JpaRepository<VwCrearActualizaCliente, String>{

	
	@Query("SELECT u FROM VwCrearActualizaCliente u WHERE  u.ruc=:ruc")
	List<VwCrearActualizaCliente> buscarPorRuc(
			@Param("ruc") String ruc);
}
