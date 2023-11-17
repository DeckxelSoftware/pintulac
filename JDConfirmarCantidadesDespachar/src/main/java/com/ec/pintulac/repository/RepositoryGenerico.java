package com.ec.pintulac.repository;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Service
public class RepositoryGenerico {
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Transactional
	public JsonObject callStoreProcedure(String procedureName, String params) {
		JsonObject jsonObject = new JsonObject();
		try {
			StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery(procedureName);

			query.registerStoredProcedureParameter("json_param1", String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter("json_param", String.class, ParameterMode.OUT);
			query.setParameter("json_param1", params);

			 query.execute();

			String json = (String) query.getOutputParameterValue("json_param");
			jsonObject = new Gson().fromJson(json, JsonObject.class);

		} catch (Exception e) {
			// TODO: handle exception
			return jsonObject = new Gson().fromJson("{\"estado\":false, \"message\":\"error en el procedimiento Java\"}",
					JsonObject.class);
		}

		return jsonObject;
	}

	@Transactional
	public JsonObject callStoreProcedureArray(String procedureName, String params) {
		JsonObject jsonObject = new JsonObject();
		try {
			StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery(procedureName);

			query.registerStoredProcedureParameter("json_param1", String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter("json_param", String.class, ParameterMode.OUT);
			query.setParameter("json_param1", params);

			 query.execute();

			String json = (String) query.getOutputParameterValue("json_param");
			jsonObject = new Gson().fromJson(json, JsonObject.class);

		} catch (Exception e) {
			// TODO: handle exception
			return jsonObject = new Gson().fromJson("{\"estado\":false, \"message\":\"error en el procedimiento Java\"}",
					JsonObject.class);
		}

		return jsonObject;
	}
	

}
