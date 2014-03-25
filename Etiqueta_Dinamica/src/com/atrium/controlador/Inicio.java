/**
 * Programa Ejercicio Etiqueta Din�mica
 * 
 * El programa tendr� una ventana con un formulario con 4 etiquetas y 3 botones.
 * El primer bot�n permitir� cargar desde un archivo XML contenido en las etiquetas.
 * El segundo bot�n permitir� que un texto escrito en las etiquetas se guarde en un
 * archivo XML.
 * El tercer bot�n cerrar� la aplicaci�n
 * 
 * @author Ra�l Hern�ndez de Francisco.
 * @version 1.0
 * @serial 25-03-2014
 */

package com.atrium.controlador;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Inicio {
	/**
	 * Nos aseguramos la carga de NIMBUS y creamos el objeto Ventana
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// cargar el nuevo look and feel si se puede
		// RECOGEMOS TODOS LOS LOOK DISPONIBLES EN LA VERSION DE JDK
		LookAndFeelInfo tabla_laf[] = UIManager.getInstalledLookAndFeels();
		for (LookAndFeelInfo objeto_aparicencia : tabla_laf) {
			// COMPROBAMOS SI EXISTE NIMBUS
			if (objeto_aparicencia.getName().equals("Nimbus")) {
				try {
					// CARGAMOS NIMBUS CUANDO EXISTA SEGUN LA VERSION DE JDK
					// USADA
					UIManager.setLookAndFeel(objeto_aparicencia.getClassName());
					System.out.println("Cargando nimbus......");
				} catch (Exception ex) {
					System.out.println("error en la carga de nimbus");
				}
			}
		}
		// Creamos el objeto Ventana
		Ventana ventana = new Ventana();

	}

}