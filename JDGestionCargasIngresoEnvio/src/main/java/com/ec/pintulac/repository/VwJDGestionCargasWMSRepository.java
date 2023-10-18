package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeGestionCargasWMS;


@SuppressWarnings("unused")
@Repository
public interface VwJDGestionCargasWMSRepository  extends JpaRepository<VwJdeGestionCargasWMS, String>{

}
