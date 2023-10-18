package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeBajasInventarios;


@SuppressWarnings("unused")
@Repository
public interface VwJDBajasInventariosRepository  extends JpaRepository<VwJdeBajasInventarios, String>{

}
