package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeGestionCargasEliminacionEnvio;


@SuppressWarnings("unused")
@Repository
public interface VwJDGestionCargasEliminacionEnvioRepository  extends JpaRepository<VwJdeGestionCargasEliminacionEnvio, String>{

}
