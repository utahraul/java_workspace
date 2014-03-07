package com.atrium.controlador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JLabel etiqueta;
	private JTextField texto;
	private JButton boton;

	public Ventana() {
		setBounds(100, 200, 800, 600);
		setResizable(false);
		setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);

		crear_Interface();

		setVisible(true);
	}

	public void crear_Interface() {

	}

}
