package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeTransferenciaInternaInventarios;


@SuppressWarnings("unused")
@Repository
public interface VwJDTransferenciaInternaInventariosRepository  extends JpaRepository<VwJdeTransferenciaInternaInventarios, String>{

}
