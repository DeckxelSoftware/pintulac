package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeCreacionDireccionesEntrega;


@SuppressWarnings("unused")
@Repository
public interface VwJDCreacionDireccionesEntrega  extends JpaRepository<VwJdeCreacionDireccionesEntrega, String>{

}
