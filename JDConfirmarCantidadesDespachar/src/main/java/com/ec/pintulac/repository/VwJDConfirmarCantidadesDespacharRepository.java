package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeConfirmarCantidadesDespachar;


@SuppressWarnings("unused")
@Repository
public interface VwJDConfirmarCantidadesDespacharRepository  extends JpaRepository<VwJdeConfirmarCantidadesDespachar, String>{

}
