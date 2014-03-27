package com.atrium.modelo;


import java.util.List;

import com.atrium.modelo.dao.Municipios_DAO;

public class Gestion_Municipios implements IGestion_Municipios{
		 

	private Municipios_DAO municipios_dao;

	public Gestion_Municipios() {
		municipios_dao = new Municipios_DAO();
	}

	@Override
	public List<Municipios> consultar_PorProvincias(Integer codigoprovincia) {

		return municipios_dao.consultar_PorProvincia(codigoprovincia);
	}

}
