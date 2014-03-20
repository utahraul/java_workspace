package com.atrium.controlador;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import com.atrium.modelo.Gestion_Etiqueta;

public class Ventana extends JFrame implements ActionListener{
	private JButton boton;
	private JLabel etiquetadinamica;

	
	
	public Ventana() {
		setTitle("Ejercicio Etiqueta Din\u00E1mica");
		setBounds(100, 100, 500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		crear_Interface();
		setVisible(true);
	}
	
	public void crear_Interface() {
		
		boton = new JButton("Pulse para generar etiqueta a partir de archivo .properties");
		boton.setToolTipText("Pulse para generar etiqueta a partir de archivo .properties");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		boton.setBounds(50, 60, 400, 40);
		getContentPane().add(boton);
		boton.addActionListener(this);
		
		etiquetadinamica = new JLabel("Etiqueta_Dinamica");
		etiquetadinamica.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetadinamica.setBounds(50, 111, 400, 40);
		getContentPane().add(etiquetadinamica);

			
				}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Gestion_Etiqueta gestion_Etiqueta = new Gestion_Etiqueta()
		
		
	}
}
