package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeAjustesIngresoInventarios;


@SuppressWarnings("unused")
@Repository
public interface VwJDAjustesIngresoInventariosRepository  extends JpaRepository<VwJdeAjustesIngresoInventarios, String>{

}
