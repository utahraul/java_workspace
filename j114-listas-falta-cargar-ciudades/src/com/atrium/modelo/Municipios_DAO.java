package com.atrium.modelo;

import java.util.ArrayList;
import java.util.List;

public class Municipios_DAO {

	public List<Municipios> consultar_Todos() {
		List<Municipios> lista = new ArrayList<>();
		Municipios municipio_nuevo = new Municipios();
		municipio_nuevo.setCodigomunicipio(new Integer(1));
		municipio_nuevo.setMunicipio("Municipio Uno");
		lista.add(municipio_nuevo);
		municipio_nuevo = new Municipios();
		municipio_nuevo.setCodigomunicipio(new Integer(2));
		municipio_nuevo.setMunicipio("Municipio Dos");
		lista.add(municipio_nuevo);
		municipio_nuevo = new Municipios();
		municipio_nuevo.setCodigomunicipio(new Integer(3));
		municipio_nuevo.setMunicipio("Municipio Tres");
		lista.add(municipio_nuevo);
		municipio_nuevo = new Municipios();
		municipio_nuevo.setCodigomunicipio(new Integer(4));
		municipio_nuevo.setMunicipio("Municipio Cuatro");
		lista.add(municipio_nuevo);
		return lista;
	}
}
