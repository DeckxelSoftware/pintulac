package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeGeneracionRequisicionComprasNoInventariables;


@SuppressWarnings("unused")
@Repository
public interface VwJDGeneracionRequisicionComprasNoInventariablesRepository  extends JpaRepository<VwJdeGeneracionRequisicionComprasNoInventariables, String>{

}
