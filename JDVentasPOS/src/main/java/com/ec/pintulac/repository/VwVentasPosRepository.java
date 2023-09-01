package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeVentasPos;


@SuppressWarnings("unused")
@Repository
public interface VwVentasPosRepository  extends JpaRepository<VwJdeVentasPos, Integer>{

}
