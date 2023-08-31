package com.ec.pintulac.repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
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
	
//	@SuppressWarnings({ "unchecked" })
//	
//	public JsonObject callProcedurev2(String procedureName, String params) {
//		JsonObject jsonObject = new JsonObject();
//		Session session = entityManager.unwrap(Session.class);
//		try {
//			ProcedureCall call = session.createStoredProcedureCall(procedureName);
//			call.registerParameter("json_param1", String.class, ParameterMode.IN);
//			call.registerParameter("json_param", String.class, ParameterMode.OUT);
//
//			call.setParameter("json_param1", params);
//
//			call.execute();
//			String json = (String) call.getOutputParameterValue("json_param");
//			System.out.println("RESPUESTA BASE  " + json);
//
//		} catch (Exception e) {
//
//		} finally {
//			session.close();
//		}
//
//		return jsonObject;
//	}

}
