package com.atrium.controlador;


import com.atrium.modelo.Modelo;
import com.atrium.vista.Vista;

public class Controlador {
	
	private Modelo modelo;
	private Vista vista;
	
	public Controlador(){
		modelo= new Modelo();
		vista=new Vista();
		
		prueba_Uno();
	}

	public void prueba_Uno(){
		modelo.setTexto("HOLA MUNDO JAVA 66666");
		vista.mostrar_Texto(modelo.getTexto());
	}
}
