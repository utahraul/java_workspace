package com.atrium.controlador;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Inicio {

	public static void main(String[] args) {
		LookAndFeelInfo tabla_laf[] = UIManager.getInstalledLookAndFeels();
		for (LookAndFeelInfo objeto_apariencia : tabla_laf) {
			//COMPROBAMOS SI EXISTE NIMBUS
			if (objeto_apariencia.getName().equals("Nimbus")) {
				try {
					//CARGAMOS NIMBUS CUANDO EXISTA SEGUN LA VERSION DE JDK
					//USADA
					UIManager.setLookAndFeel(objeto_apariencia.getClassName());
					System.out.println("Cargando Nimbus.....");
				}
				catch (Exception ex) {
					System.out.println("Error en la carga de Nimbus");
				}
			}
		}
		
		
		Ventana ventana = new Ventana ();

	}
}
