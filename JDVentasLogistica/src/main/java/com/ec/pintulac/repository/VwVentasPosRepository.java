package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeVentasLogistica;


@SuppressWarnings("unused")
@Repository
public interface VwVentasPosRepository  extends JpaRepository<VwJdeVentasLogistica, String>{

}
