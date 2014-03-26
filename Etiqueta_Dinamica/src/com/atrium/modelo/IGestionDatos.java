package com.atrium.modelo;

public interface IGestionDatos {

	public Datos_DTO leer_Datos();

	public abstract boolean escribir_Datos(Datos_DTO datos);

}