package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeCrearOrdenTransferenciaLogistica;


@SuppressWarnings("unused")
@Repository
public interface VwJDJDCrearOrdenTransferenciaLogisticaRepository  extends JpaRepository<VwJdeCrearOrdenTransferenciaLogistica, String>{

}
