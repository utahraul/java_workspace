package com.atrium.modelo;

import java.util.List;

public class Gestion_Municipios implements IGestion_Municipios {

	private Municipios_DAO municipios_dao;

	public Gestion_Municipios() {
		municipios_dao = new Municipios_DAO();
	}
		
	@Override
	public List<Municipios> consultar_Todos() {
		// TODO Auto-generated method stub
		return null;
	}

}
