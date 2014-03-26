package com.atrium.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;

public class Formulario extends JPanel implements ActionListener {

	private JLabel eti_nombre;
	private JTextField nombre_usuario;
	private JLabel eti_apellido;
	private JTextField apellido_usuario;
	private JLabel eti_direccion;
	private JTextField textField;
	private JLabel eti_ciudad;
	private JTextField textField_1;
	private JToolBar barra_botones;
	private JButton boton_leer;
	private JButton boton_escribir;
	private JButton boton_salir;

	public Formulario() {
		setLayout(null);
		setBounds(0, 0, 394, 318);

		crear_Interface();
	}

	public void crear_Interface() {
		eti_nombre = new JLabel("Nombre:");
		eti_nombre.setBounds(26, 65, 64, 14);
		add(eti_nombre);

		nombre_usuario = new JTextField();
		nombre_usuario.setBounds(111, 62, 133, 20);
		add(nombre_usuario);
		nombre_usuario.setColumns(10);

		eti_apellido = new JLabel("Apellido:");
		eti_apellido.setBounds(26, 117, 63, 14);
		add(eti_apellido);

		apellido_usuario = new JTextField();
		apellido_usuario.setBounds(111, 114, 133, 20);
		add(apellido_usuario);
		apellido_usuario.setColumns(10);

		eti_direccion = new JLabel("Direccion:");
		eti_direccion.setBounds(26, 165, 70, 14);
		add(eti_direccion);

		textField = new JTextField();
		textField.setBounds(111, 162, 224, 20);
		add(textField);
		textField.setColumns(10);

		eti_ciudad = new JLabel("Ciudad:");
		eti_ciudad.setBounds(26, 204, 68, 14);
		add(eti_ciudad);

		textField_1 = new JTextField();
		textField_1.setBounds(111, 201, 224, 20);
		add(textField_1);
		textField_1.setColumns(10);

		barra_botones = new JToolBar();
		barra_botones.setFloatable(false);
		barra_botones.setBounds(126, 251, 168, 29);
		add(barra_botones);

		boton_leer = new JButton("Leer");
		barra_botones.add(boton_leer);

		boton_escribir = new JButton("Escribir");
		barra_botones.add(boton_escribir);

		boton_salir = new JButton("Salir");
		barra_botones.add(boton_salir);

		boton_escribir.addActionListener(this);
		boton_leer.addActionListener(this);
		boton_salir.addActionListener(this);

		boton_escribir.setName("boton_escribir");
		boton_salir.setName("boton_salir");
		boton_leer.setName("boton_leer");

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String boton_seleccion = ((JButton) evento.getSource()).getName();
		if (boton_seleccion.equals("boton_escribir")) {
			System.out.println("soy escribir");
		}
		if (boton_seleccion.equals("boton_leer")) {
			System.out.println("soy leer");
		}
		if (boton_seleccion.equals("boton_salir")) {
			System.exit(0);
		}
	}
}
