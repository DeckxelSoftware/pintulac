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
	public JsonObject callStoreProcedure(String procedureName) {
		JsonObject jsonObject = new JsonObject();
		try {
			StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery(procedureName);

			query.registerStoredProcedureParameter("json_param", String.class, ParameterMode.OUT);
			String json = (String) query.getOutputParameterValue("json_param");
			jsonObject = new Gson().fromJson(json, JsonObject.class);
			return jsonObject = new Gson().fromJson(json, JsonObject.class);

		} catch (Exception e) {
			// TODO: handle exception
			return jsonObject = new Gson()
					.fromJson("{\"estado\":false, \"message\":\"error en el procedimiento Java\"}", JsonObject.class);
		}

//		return jsonObject;
	}

	
	@Transactional
	public String update(String emCodigo,String suCodigo,String boCodigo,String esCodigo,BigDecimal veNumero) {
		JsonObject jsonObject = new JsonObject();
		try {
			String SQL="UPDATE fa_venta vn SET vn.VE_PROCESA_JDE ='E' WHERE "
					+ " vn.es_codigo = "+esCodigo
					+ "and vn.em_codigo = "+emCodigo
					+ "and vn.su_codigo = "+suCodigo
					+ "and vn.bo_codigo = "+boCodigo
					+ "and vn.ve_numero= "+ veNumero;
			Query query = this.entityManager.createNativeQuery(SQL);
			 int updateCount = query.executeUpdate();
			
			return "Correcto";

		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}

//		return jsonObject;
	}
}
