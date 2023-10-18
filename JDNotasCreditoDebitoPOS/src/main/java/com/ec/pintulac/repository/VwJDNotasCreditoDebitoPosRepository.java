package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeNotasCreditoDebitoPos;


@SuppressWarnings("unused")
@Repository
public interface VwJDNotasCreditoDebitoPosRepository  extends JpaRepository<VwJdeNotasCreditoDebitoPos, String>{

}
