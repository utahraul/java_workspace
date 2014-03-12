package com.atrium.controlador;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.atrium.vista.ICrear_Interface;

import java.awt.Rectangle;

public class Ventana extends JFrame implements ICrear_Interface {

	// ******************* PROPIEDADES DE CLASE **********************
	// propiedades del menu
	// Barra de menus general para la ventana. Contiene todas las opciones de
	// menus posibles

	private JMenuBar barra_menu;
	private JMenu archivo;
	private JMenu clientes;
	private JMenu proveedores;
	private JMenu almacen;
	private JMenu vencimientos;
	private JMenu ayuda;

	private JMenuItem archivo_configuracion;
	private JMenuItem archivo_salir;
	private JMenuItem clientes_gestion;
	private JMenuItem clientes_pedidos;
	private JMenuItem clientes_historico;
	private JMenu listado_clientes;
	private JMenuItem listadoclientes_activos;
	private JMenuItem listadoclientes_morosos;
	private JMenuItem listadoclientes_bajas;
	private JMenuItem proveedores_gestion;
	private JMenuItem proveedores_pedidos;
	private JMenuItem proveedores_servicios;
	private JMenuItem almacen_articulos;
	private JMenuItem almacen_almacen;
	private JMenuItem almacen_catalogo;
	private JMenuItem vencimientos_pagos;
	private JMenuItem vencimientos_cobros;
	private JMenuItem vencimientos_morosos;
	private JMenuItem vencimientos_flujo;
	private JMenu listado_vencimientos;
	private JMenuItem listadovencimientos_facturacion;
	private JMenuItem listadovencimientos_pendientes;
	private JMenuItem listadovencimientos_morosidad;
	private JMenuItem ayuda_manual;
	private JMenuItem ayuda_acercade;
	private JMenuItem ayuda_calculadora;

	public Ventana() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setResizable(false);

		this.crear_Interface();

		setVisible(true);
	}

	@Override
	public void crear_Interface() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajustes_Reflexion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void establecer_GestionFoco() {
		// TODO Auto-generated method stub

	}

}
