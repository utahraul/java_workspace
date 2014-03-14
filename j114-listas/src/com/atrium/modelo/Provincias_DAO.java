package com.atrium.modelo;

import java.util.ArrayList;
import java.util.List;

public class Provincias_DAO {

	
	public List<Provincias> consultar_Todos(){
		List<Provincias> lista=new ArrayList<>();
		Provincias provincia_nueva=new Provincias();
		provincia_nueva.setCodigoprovincia(new Integer(1));
		provincia_nueva.setProvincia("Provincia Uno");
		lista.add(provincia_nueva);
		provincia_nueva=new Provincias();
		provincia_nueva.setCodigoprovincia(new Integer(2));
		provincia_nueva.setProvincia("Provincia Dos");
		lista.add(provincia_nueva);
		provincia_nueva=new Provincias();
		provincia_nueva.setCodigoprovincia(new Integer(3));
		provincia_nueva.setProvincia("Provincia Tres");
		lista.add(provincia_nueva);
		provincia_nueva=new Provincias();
		provincia_nueva.setCodigoprovincia(new Integer(28));
		provincia_nueva.setProvincia("Madrid");
		lista.add(provincia_nueva);
		return lista;
	}
}
