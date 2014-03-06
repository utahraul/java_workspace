package com.atrium.controlador;

import com.atrium.modelo.Modelo;
import com.atrium.vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	
	public Controlador () {
		modelo= new Modelo (); 
		vista= new Vista();
		
		prueba_Uno();
	}
	
	public void prueba_Uno () {
		modelo.setTexto("Hola Mundo 2");
		vista.mostrar_Texto(modelo.getTexto());
	}
	public void prueba_Dos () {
		Modelo modelo2 =new Modelo ();
		modelo2.setTexto("Hola Mundo");
		if (modelo2.equals(modelo)){
			vista.mostrar_Texto("Son iguales");
		}
		else {
			vista.mostrar_Texto("Son distintos");
		}
	}
	
}
