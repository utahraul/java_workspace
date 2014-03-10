package com.atrium.controlador;

import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.border.EtchedBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.DebugGraphics;

/**
 * Calculadora básica con interfaz gráfica
 * 
 * @author Raúl Hernández
 * @version 1.0
 * @since 10/3/2014
 * 
 */

public class Calculadora extends JFrame implements ActionListener {
	// PROPIEDADES DE CLASE
	private JPanel panel_visor;
	private JLabel visor;
	private JPanel panel_botones;
	private JButton boton_1;
	private JButton boton_3;
	private JButton boton_2;
	private JButton btnNewButton_3;
	private JButton boton_4;
	private JButton boton_5;
	private JButton boton_6;
	private JButton boton_7;
	private JButton boton_8;
	private JButton boton_9;
	private JButton boton_0;
	private JButton boton_punto;
	private JButton boton_igual;
	private JPanel panel_operaciones;
	private JButton boton_sumar;
	private JButton boton_dividir;
	private JButton boton_restar;
	private JButton boton_multiplicar;
	private JPanel panel_ce_off;
	private JButton boton_off;
	private JButton boton_ce;

	/**
	 * Creación de la ventana de la calculadora
	 */
	public Calculadora() {
		// DAMOS VALOR A LAS PROPIEDADES DE LA CLASE
		setTitle("Calculadora");
		setBounds(new Rectangle(100, 100, 300, 450));
		getContentPane().setLayout(null);
		crear_Interface();

		setVisible(true);
	}

	/**
	 * Proceso de creación de componente de la interfaz
	 */

	public void crear_Interface() {

		panel_visor = new JPanel();
		panel_visor.setBounds(0, 0, 284, 60);
		getContentPane().add(panel_visor);
		panel_visor.setLayout(null);

		visor = new JLabel("0");
		visor.setOpaque(true);
		visor.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		visor.setBackground(new Color(250, 250, 210));
		visor.setAlignmentY(0.0f);
		visor.setHorizontalAlignment(SwingConstants.RIGHT);
		visor.setHorizontalTextPosition(SwingConstants.RIGHT);
		visor.setBounds(new Rectangle(6, 6, 272, 54));
		visor.setFont(new Font("Verdana", Font.PLAIN, 34));
		panel_visor.add(visor);

		panel_botones = new JPanel();
		panel_botones.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_botones.setBounds(6, 62, 210, 265);
		getContentPane().add(panel_botones);
		panel_botones.setLayout(new GridLayout(4, 3, 3, 3));

		boton_1 = new JButton("1");
		boton_1.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_1.setToolTipText("1");
		panel_botones.add(boton_1);

		boton_2 = new JButton("2");
		boton_2.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_2.setToolTipText("2");
		panel_botones.add(boton_2);

		boton_3 = new JButton("3");
		boton_3.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_3.setToolTipText("3");
		panel_botones.add(boton_3);

		boton_4 = new JButton("4");
		boton_4.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_4.setToolTipText("4");
		panel_botones.add(boton_4);

		boton_5 = new JButton("5");
		boton_5.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_5.setToolTipText("5");
		panel_botones.add(boton_5);

		boton_6 = new JButton("6");
		boton_6.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_6.setToolTipText("6");
		panel_botones.add(boton_6);

		boton_7 = new JButton("7");
		boton_7.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_7.setToolTipText("7");
		panel_botones.add(boton_7);

		boton_8 = new JButton("8");
		boton_8.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_8.setToolTipText("8");
		panel_botones.add(boton_8);

		boton_9 = new JButton("9");
		boton_9.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_9.setToolTipText("9");
		panel_botones.add(boton_9);

		boton_punto = new JButton(".");
		boton_punto.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_punto.setToolTipText(".");
		panel_botones.add(boton_punto);

		boton_0 = new JButton("0");
		boton_0.setFont(new Font("Verdana", Font.PLAIN, 22));
		boton_0.setToolTipText("0");
		panel_botones.add(boton_0);

		boton_igual = new JButton("=");
		boton_igual.setForeground(new Color(34, 139, 34));
		boton_igual.setFont(new Font("Verdana", Font.BOLD, 22));
		boton_igual.setToolTipText("=");
		panel_botones.add(boton_igual);

		panel_operaciones = new JPanel();
		panel_operaciones.setBounds(220, 62, 60, 265);
		getContentPane().add(panel_operaciones);
		panel_operaciones.setLayout(new GridLayout(4, 1, 3, 3));

		boton_sumar = new JButton("+");
		boton_sumar.setToolTipText("+");
		boton_sumar.setFont(new Font("Verdana", Font.PLAIN, 28));
		panel_operaciones.add(boton_sumar);

		boton_restar = new JButton("-");
		boton_restar.setToolTipText("-");
		boton_restar.setFont(new Font("Verdana", Font.PLAIN, 28));
		panel_operaciones.add(boton_restar);

		boton_multiplicar = new JButton("*");
		boton_multiplicar.setToolTipText("*");
		boton_multiplicar.setFont(new Font("Verdana", Font.PLAIN, 28));
		panel_operaciones.add(boton_multiplicar);

		boton_dividir = new JButton("/");
		boton_dividir.setToolTipText("/");
		boton_dividir.setFont(new Font("Verdana", Font.PLAIN, 28));
		panel_operaciones.add(boton_dividir);

		panel_ce_off = new JPanel();
		panel_ce_off.setBounds(6, 330, 276, 80);
		getContentPane().add(panel_ce_off);
		panel_ce_off.setLayout(new GridLayout(0, 2, 5, 3));

		boton_ce = new JButton("C / CE");
		boton_ce.setFont(new Font("Verdana", Font.PLAIN, 24));
		boton_ce.setToolTipText("C / CE");
		panel_ce_off.add(boton_ce);

		boton_off = new JButton("OFF");
		boton_off.setFont(new Font("Verdana", Font.PLAIN, 24));
		boton_off.setToolTipText("Cerrar Calculadora");
		panel_ce_off.add(boton_off);
		
		boton_0.addActionListener(this);
		boton_1.addActionListener(this);
		boton_2.addActionListener(this);
		boton_3.addActionListener(this);
		boton_4.addActionListener(this);
		boton_5.addActionListener(this);
		boton_6.addActionListener(this);
		boton_7.addActionListener(this);
		boton_8.addActionListener(this);
		boton_9.addActionListener(this);
		boton_0.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String opcion_elegida = ((JButton) evento.getSource()).getText();

	}
}
