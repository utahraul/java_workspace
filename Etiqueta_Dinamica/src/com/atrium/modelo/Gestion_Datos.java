package com.atrium.modelo;

public class Gestion_Datos implements IGestionDatos {
	
	private Datos_DAO datos_dao;
	
	public Gestion_Datos () {
		datos_dao= new Datos_DAO();
	}

	/* (non-Javadoc)
	 * @see com.atrium.modelo.IGestionDatos#leer_Datos()
	 */
	@Override
	public Datos_DTO leer_Datos(){
		return datos_dao.leer_Datos();
	}
	
}
