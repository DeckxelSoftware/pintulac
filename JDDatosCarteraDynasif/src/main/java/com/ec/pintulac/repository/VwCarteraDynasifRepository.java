package com.ec.pintulac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeDatosCarteraDynasif;


@SuppressWarnings("unused")
@Repository
public interface VwCarteraDynasifRepository  extends JpaRepository<VwJdeDatosCarteraDynasif, String>{

}
