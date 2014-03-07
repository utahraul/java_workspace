package com.atrium.controlador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class Ventana extends JFrame {

	private JLabel etiqueta;
	private JTextField texto;
	private JButton boton;
	private JPasswordField passwordField;
	private JCheckBox chckbxPrueba;
	private JTextArea textArea;

	public Ventana() {
		setTitle("Ejercicio-3");
		setBounds(100, 200, 300, 300);
		setResizable(false);
		setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		crear_Interface();

		setVisible(true);
	}

	public void crear_Interface() {
		etiqueta=new JLabel("Inserte Usuario y Password");
		etiqueta.setToolTipText("Inserte Usuario y Password");
		etiqueta.setFont(new Font("Verdana", Font.PLAIN, 11));
		texto=new JTextField();
		boton=new JButton("Enviar");
		boton.setDisplayedMnemonicIndex(0);
		boton.setFont(new Font("Verdana", Font.BOLD, 11));
		boton.setToolTipText("Enviar");
		boton.setForeground(Color.BLACK);
		boton.setBackground(Color.WHITE);

		etiqueta.setBounds(15, 30, 200, 18);
		texto.setBounds(15, 60, 200, 18);
		boton.setBounds(15, 120, 80, 20);
		
		getContentPane().add(boton);
		getContentPane().add(texto);
		this.getContentPane().add(etiqueta);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(15, 90, 100, 20);
		getContentPane().add(passwordField);
		
		chckbxPrueba = new JCheckBox("Acepto");
		chckbxPrueba.setSelected(true);
		chckbxPrueba.setToolTipText("Acepto");
		chckbxPrueba.setBounds(15, 150, 97, 23);
		getContentPane().add(chckbxPrueba);
		
		textArea = new JTextArea();
		textArea.setBounds(15, 180, 244, 56);
		getContentPane().add(textArea);
	}
}
