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
		setBounds(100, 200, 300, 300);
		setResizable(false);
		setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
		setLayout(null);
		
		crear_Interface();

		setVisible(true);
	}

	public void crear_Interface() {
		etiqueta=new JLabel("Envíenos su opinión");
		texto=new JTextField();
		boton=new JButton("Enviar");

		etiqueta.setBounds(15, 30, 160, 18);
		texto.setBounds(15, 60, 200, 18);
		boton.setBounds(15, 90, 70, 20);
		
		this.add(boton);
		this.add(texto);
		this.getContentPane().add(etiqueta);
	}

}
