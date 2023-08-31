package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.PrSucur;
import com.ec.pintulac.entidad.TmUnidadNegocio;


@SuppressWarnings("unused")
@Repository
public interface PrSucurRepository  extends JpaRepository<PrSucur, Integer>{

}
