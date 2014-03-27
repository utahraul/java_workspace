package com.atrium.modelo;

import java.util.List;

import com.atrium.modelo.Articulos_DAO;

public class Gestion_Articulos implements IGestion_Articulos {

	private Articulos_DAO articulo_dao;

	public Gestion_Articulos() {
		articulo_dao = new Articulos_DAO();
	}

	@Override
	public List<Articulos_DTO> consultar_Todos() {
		List<Articulos_DTO> lista = articulo_dao.consultar_Todos();
		// TODO Auto-generated method stub
		return null;
	}

}
