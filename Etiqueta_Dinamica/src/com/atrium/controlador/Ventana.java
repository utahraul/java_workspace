/**
 * La clase ventana va a generar la interfaz gráfica del programa
 */

package com.atrium.controlador;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import Vista.Formulario;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	public Ventana() {
		// Creamos la interfaz gráfica de la ventana.
		setTitle("Ejercicio Etiqueta Din\u00E1mica");
		// Fijamos las dimensiones
		setBounds(100, 100, 500, 300);
		// Fijamos que se cierre la ventana al hacer click en el aspa de cerrar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Quitamos el layout por defecto
		getContentPane().setLayout(null);
		setResizable(false);
		
		this.crear_Interface();

		// Al final del todo fijamos la visibilidad a true
		setVisible(true);
	}

	/**
	 * El método crear_Interface lo vamos a usar para crear las etiquetas,
	 * campos de texto y botones necesarios para nuestro programa.
	 */

	public void crear_Interface() {

		Formulario formulario = new Formulario();
		getContentPane().add(formulario);

	}

}
