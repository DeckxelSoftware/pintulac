package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeGeneracionComprasInventariables;


@SuppressWarnings("unused")
@Repository
public interface VwJDGeneracionComprasInventariablesRepository  extends JpaRepository<VwJdeGeneracionComprasInventariables, String>{

}
