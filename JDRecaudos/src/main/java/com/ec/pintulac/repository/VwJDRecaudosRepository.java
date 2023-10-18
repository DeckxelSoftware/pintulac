package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeJDRecaudos;


@SuppressWarnings("unused")
@Repository
public interface VwJDRecaudosRepository  extends JpaRepository<VwJdeJDRecaudos, String>{

}
