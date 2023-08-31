package com.ec.pintulac.mapper;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

import com.ec.pintulac.entidad.PrSucur;
import com.ec.pintulac.entidad.PrSucurPK;

import com.ec.pintulac.response.Row;
public class UnidadNegocioMapper {
//	public static Function<TmUnidadNegocio, Row> TO_DTO;
	public static Function<Row, PrSucur> TO_ENTITY;
//	public static Function<List<TmUnidadNegocio>, List<Row> >TO_LISTDAO;
	
	static {
		TO_ENTITY = (model -> {
			
			PrSucurPK pk= new PrSucurPK();
			pk.setEmCodigo(model.getEmCodigo());
			pk.setSuCodigo(model.getSuCodigo());
			PrSucur dto = new PrSucur();
			
			dto.setSuNombre(model.getSuNombre());
			dto.setSuCalle1(model.getSuCalle1());
			//dto.setSuCalle2(model.getsuc());
			dto.setSuTelef1(model.getSuTelef1());
			dto.setSuTelef2(model.getSuTelef2());
			String fax=model.getSuFax().replace(" ", "").replace("593", "");
		
			dto.setSuFax(fax);
			dto.setSuNomrep(model.getSuNomrep());
			dto.setSuJuzgado(model.getSuJuzgado());
			dto.setSuCiudad(model.getSuCiudad());			
			dto.setSuRegimen(model.getSuRegimen());
			dto.setSuGrupo(model.getSuGrupo());
			dto.setCsCodigo(model.getCsCodigo());
			dto.setPaCodigo(model.getPaCodigo());
			dto.setPoCodigo(model.getPoCodigo());
			dto.setCtCodigo(model.getCtCodigo());
			dto.setSuGps(model.getSuGps());
			dto.setEpCodigo(model.getEpCodigo());
			dto.setSuHorarion(model.getSuHorarion());
			dto.setSuEmail(model.getSuEmail());
			dto.setSuRed(model.getSuRed());
			dto.setGvCodigo(model.getGvCodigo());
			dto.setSuAperep("PRUEBA");
			dto.setSuDesciva(Short.valueOf(model.getSuDesciva()));
			dto.setSuMargloc(BigDecimal.valueOf(Double.valueOf(model.getSuMargloc())));
			dto.setSuMargimp(BigDecimal.valueOf(Double.valueOf(model.getSuMargimp())));
			dto.setPdMid(model.getPdMid());
			dto.setSuTipotienda(model.getSuTipotienda());
			dto.setSuActivo(model.getSuActivo());
			try {
				Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(model.getSuFecinicio());  
				dto.setSuFecinicio(date1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR "+e.getMessage());
			}
			
			dto.setPrSucurPK(pk);

			
			
			

			return dto;
		});
//		TO_ENTITY = (dto -> {
//			Libro model = new Libro();
//			dto.setIdLibro(model.getIdLibro());
//			model.setEdicion(dto.getEdicion());
//			model.setNombre(dto.getNombre());
//			model.setTitulo(dto.getTitulo());
//			return model;
//		});
//		
//		TO_LISTDAO = (dto ->{
//				return (List<LibroDao>)StreamSupport.stream(dto.spliterator(), true)
//			    .map(LibroMapper.TO_DTO).collect(Collectors.toList());
//				
//				
//		});

	}
}
