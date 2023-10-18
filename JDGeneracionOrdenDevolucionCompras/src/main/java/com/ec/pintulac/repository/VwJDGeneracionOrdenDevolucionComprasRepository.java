package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeGeneracionOrdenDevolucionCompras;


@SuppressWarnings("unused")
@Repository
public interface VwJDGeneracionOrdenDevolucionComprasRepository  extends JpaRepository<VwJdeGeneracionOrdenDevolucionCompras, String>{

}
