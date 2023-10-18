package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeJDDespachoPedidos;


@SuppressWarnings("unused")
@Repository
public interface VwJDJDDespachoPedidosRepository  extends JpaRepository<VwJdeJDDespachoPedidos, String>{

}
