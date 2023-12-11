package com.ec.pintulac.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ec.pintulac.entidad.VwJdeGeneracionReclasificacionInventarios;
import com.google.gson.JsonObject;

@Service
public class RepositoryGenerico {
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Transactional
	public List<VwJdeGeneracionReclasificacionInventarios> callStoreProcedure(String procedureName, BigDecimal params) {
		JsonObject jsonObject = new JsonObject();
		try {
			StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery(procedureName);

			query.registerStoredProcedureParameter("w_ve_numero", BigDecimal.class, ParameterMode.IN);
			query.registerStoredProcedureParameter("json_param", String.class, ParameterMode.OUT);
			query.setParameter("w_ve_numero", params);
			Boolean valida= query.execute();
			String json = (String) query.getOutputParameterValue("json_param");
			
			return entityManager
					.createQuery("SELECT u FROM VwJdeGeneracionReclasificacionInventarios u WHERE  u.numero=:numero",
							VwJdeGeneracionReclasificacionInventarios.class)
					.setParameter("numero", params).getResultList();
			
//			if(valida) {
//				return jsonObject = new Gson().fromJson("{\"estado\":True, \"message\":\"ejecutado correcto\"}",
//						JsonObject.class);	
//			}else {
//				
//				return jsonObject = new Gson().fromJson("{\"estado\":false, \"message\":\"error al ejecutar el procedimiento\"}",
//						JsonObject.class);
//			}

//			String json = (String) query.getOutputParameterValue("json_param");
//			jsonObject = new Gson().fromJson(json, JsonObject.class);

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

//		return jsonObject;
	}



}
