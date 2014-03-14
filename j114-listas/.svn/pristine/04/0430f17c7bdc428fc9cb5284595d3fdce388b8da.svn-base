package com.atrium.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Dao de la entidad Pais.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 1.0
 * @since 13-3-2014
 * 
 */
public class Pais_DAO {

	/**
	 * Proceso de acceso a la fuente de datos.</br> Simulacion, datos no reales.
	 * 
	 * @return Coleccion con los objetos persistentes obtenidos en la consulta.
	 */
	public List<Pais> consultar_Todos() {
		// CREACION DE LA COLECCION
		List<Pais> lista = new ArrayList<>();
		// CREACION DE LOS DTO SIMULADOS
		Pais pais_nuevo = new Pais();
		pais_nuevo.setCodigopais(new Integer(1));
		pais_nuevo.setPaisnombre("Pais prueba uno");
		lista.add(pais_nuevo);
		pais_nuevo = new Pais();
		pais_nuevo.setCodigopais(new Integer(2));
		pais_nuevo.setPaisnombre("Pais prueba dos");
		lista.add(pais_nuevo);
		pais_nuevo = new Pais();
		pais_nuevo.setCodigopais(new Integer(73));
		pais_nuevo.setPaisnombre("España");
		lista.add(pais_nuevo);
		// DEVOLVEMOS LA INFORMACION OBTENIDA
		return lista;
	}

}
