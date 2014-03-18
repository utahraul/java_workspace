package com.atrium.vista.clientes;

import javax.swing.JPanel;

import com.atrium.controlador.Ventana;
import com.atrium.vista.ICrear_Interface;

public class Clientes_Vista extends JPanel implements ICrear_Interface {

	
	// *************** IDIOMATIZACION DE LA CLASE ********************
	// NO CAMBIAR LOS PUNTOS POR BARRAS EL ASISTENTE DEJA DE FUNCIONAR.

	// *************** FIN IDIOMATIZACION DE LA CLASE ****************

	// ***** COLECCIONES PARA REFLEXION *****

	// ******************* PROPIEDADES DE CLASE **********************
private Ventana ventana;

	// ***** PANELES DE PANTALLA ******

public Clientes_Vista (Ventana ventana) {
	setBounds(0, 0, 1018, 713);
	setLayout(null);
	this.ventana=ventana;
	
	crear_Interface();
	
	
}

	// ******** AREA DE IMPLEMENTACION DE INTERFACE PROPIA ***********

@Override
public void crear_Interface() {
	
	ventana.getContentPane().add(this);
	ventana.validate();
	ventana.repaint();
	
}

@Override
public void ajustes_Reflexion() {
	// TODO Auto-generated method stub
	
}

@Override
public void establecer_GestionFoco() {
	
	}
	// TODO Auto-generated method stub

	// ******** FIN AREA DE IMPLEMENTACION DE INTERFACE PROPIA *******

	// *************** AREA DE LOGICA DE PROCESO *********************

	// ************** FIN AREA DE LOGICA DE PROCESO ******************

	// **************** AREA DE EVENTOS ******************************

	// **************** FIN AREA DE EVENTOS **************************

	// ********** ACCESORES PARA LAS PROPIEDADES DE CLASE ************

	// ************ ACCESORES PARA REFLEXION *************************

	// ************ ACCESORES PARA SPRING ****************************
}

