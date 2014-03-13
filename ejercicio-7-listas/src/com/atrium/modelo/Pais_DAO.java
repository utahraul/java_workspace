package com.atrium.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pais_DAO {
	
	/**
	 * Proceso de acceso a la fuente de datos.</br>
	 * Simulación, datos no reales.
	 * @return Colección con los objetos presistentes obtenidos en la consulta.
	 */
	
	public List<Pais> consultar_Todos() {
		//CREACIÓN DE LA COLECCIÓN
		List<Pais> lista=new ArrayList<>();
		//CREACIÓN DE LOS DATOS SIMULADOS
		Pais pais_nuevo = new Pais();
		pais_nuevo.setCodigopais(new Integer(1));
		pais_nuevo.setPaisnombre("Pais Prueba 1");
		lista.add(pais_nuevo);
		pais_nuevo = new Pais();
		pais_nuevo.setCodigopais(new Integer(2));
		pais_nuevo.setPaisnombre("Pais Prueba 2");
		lista.add(pais_nuevo);
		pais_nuevo = new Pais();
		pais_nuevo.setCodigopais(new Integer(73));
		pais_nuevo.setPaisnombre("España");
		lista.add(pais_nuevo);
		//DEVOLVEMOS LA INFORMACIÓN OBTENIDA
		return lista;
	}

}
