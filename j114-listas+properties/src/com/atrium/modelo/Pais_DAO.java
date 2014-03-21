package com.atrium.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * Dao de la entidad Pais.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 1.0
 * @since 13-3-2014
 * 
 */
//public class Pais_DAO {
//
//	/**
//	 * Proceso de acceso a la fuente de datos.</br> Simulacion, datos no reales.
//	 * 
//	 * @return Coleccion con los objetos persistentes obtenidos en la consulta.
//	 */
//	public List<Pais> consultar_Todos() {
//		// CREACION DE LA COLECCION
//		List<Pais> lista = new ArrayList<>();
//		// CREACION DE LOS DTO SIMULADOS
//		Pais pais_nuevo = new Pais();
//		pais_nuevo.setCodigopais(new Integer(1));
//		pais_nuevo.setPaisnombre("Pais prueba uno");
//		lista.add(pais_nuevo);
//		pais_nuevo = new Pais();
//		pais_nuevo.setCodigopais(new Integer(2));
//		pais_nuevo.setPaisnombre("Pais prueba dos");
//		lista.add(pais_nuevo);
//		pais_nuevo = new Pais();
//		pais_nuevo.setCodigopais(new Integer(73));
//		pais_nuevo.setPaisnombre("España");
//		lista.add(pais_nuevo);
//		// DEVOLVEMOS LA INFORMACION OBTENIDA
//		return lista;
//	}

public class Pais_DAO {

	private Properties lector;
	private Pais datos;

	public Pais_DAO() {
		lector = new Properties();
		datos = new Pais();
	}

	public List <Pais> consultar_Todos() {
		//CREACIÓN DE LA COLECCIÓN
		List<Pais> lista = new ArrayList<>();
		try {
			lector.load(this.getClass().getResourceAsStream(
					"/com/atrium/modelo/paises.properties"));
			Set<Object> claves= lector.keySet();
			for(Object clave:lista_claves){
				String pais_texto=lector.getProperty((String)clave);
				String partes[]=pais_texto.split(",");
				Pais pais_nuevo=new Pais();
				pais_nuevo.setPaisnombre(partes[0]);
				pais_nuevo.setCodigopais(new Integer(partes[1]));
				lista.add(pais_nuevo);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}

}
