package com.atrium.controlador;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.atrium.vista.ICrear_Interface;
import com.atrium.vista.clientes.Clientes_Vista;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.util.ResourceBundle;

public class Ventana extends JFrame implements ICrear_Interface, ActionListener {
	private ResourceBundle rb = ResourceBundle.getBundle("com.atrium.controlador.textos_ventana"); //$NON-NLS-1$

	// *************** IDIOMATIZACION DE LA CLASE ********************
	// NO CAMBIAR LOS PUNTOS POR BARRAS EL ASISTENTE DEJA DE FUNCIONAR.

	// *************** FIN IDIOMATIZACION DE LA CLASE ****************

	// ***** COLECCIONES PARA REFLEXION *****

	// ******************* PROPIEDADES DE CLASE **********************
	// BARRA DE MENUS GENERAL PARA LA VENTANA. CONTIENE TODAS LAS OPCIONES DE
	// MENUS POSIBLES
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
	private JPanel panel;

	// ***** PANELES DE PANTALLA ******

	public Ventana() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setResizable(false);

		this.crear_Interface();

		setVisible(true);
	}

	// ******** AREA DE IMPLEMENTACION DE INTERFACE PROPIA ***********

	@Override
	public void crear_Interface() {
		// CREACION MENU
		// BARRRA DE MENU
		barra_menu = new JMenuBar();
		// OPCIONES DE MENU
		archivo = new JMenu(rb.getString("Ventana.archivo.text")); //$NON-NLS-1$
		clientes = new JMenu(rb.getString("Ventana.clientes.text")); //$NON-NLS-1$
		proveedores = new JMenu(rb.getString("Ventana.proveedores.text")); //$NON-NLS-1$
		almacen = new JMenu(rb.getString("Ventana.almacen.text")); //$NON-NLS-1$
		vencimientos = new JMenu(rb.getString("Ventana.vencimientos.text")); //$NON-NLS-1$
		ayuda = new JMenu(rb.getString("Ventana.ayuda.text")); //$NON-NLS-1$

		// ACCIONES DEL USUARIO
		archivo_configuracion = new JMenuItem(rb.getString("Ventana.archivo_configuracion.text")); //$NON-NLS-1$
		archivo_salir = new JMenuItem(rb.getString("Ventana.archivo_salir.text")); //$NON-NLS-1$
		clientes_gestion = new JMenuItem(rb.getString("Ventana.clientes_gestion.text")); //$NON-NLS-1$
		clientes_pedidos = new JMenuItem(rb.getString("Ventana.clientes_pedidos.text")); //$NON-NLS-1$
		clientes_historico = new JMenuItem(rb.getString("Ventana.clientes_historico.text")); //$NON-NLS-1$
		listado_clientes = new JMenu(rb.getString("Ventana.listado_clientes.text")); //$NON-NLS-1$
		listadoclientes_activos = new JMenuItem(rb.getString("Ventana.listadoclientes_activos.text")); //$NON-NLS-1$
		listadoclientes_morosos = new JMenuItem(rb.getString("Ventana.listadoclientes_morosos.text")); //$NON-NLS-1$
		listadoclientes_bajas = new JMenuItem(rb.getString("Ventana.listadoclientes_bajas.text")); //$NON-NLS-1$
		proveedores_gestion = new JMenuItem(rb.getString("Ventana.proveedores_gestion.text")); //$NON-NLS-1$
		proveedores_pedidos = new JMenuItem(rb.getString("Ventana.proveedores_pedidos.text")); //$NON-NLS-1$
		proveedores_servicios = new JMenuItem(rb.getString("Ventana.proveedores_servicios.text")); //$NON-NLS-1$
		almacen_articulos = new JMenuItem(rb.getString("Ventana.almacen_articulos.text")); //$NON-NLS-1$
		almacen_almacen = new JMenuItem(rb.getString("Ventana.almacen_almacen.text")); //$NON-NLS-1$
		almacen_catalogo = new JMenuItem(rb.getString("Ventana.almacen_catalogo.text")); //$NON-NLS-1$
		vencimientos_pagos = new JMenuItem(rb.getString("Ventana.vencimientos_pagos.text")); //$NON-NLS-1$
		vencimientos_cobros = new JMenuItem(rb.getString("Ventana.vencimientos_cobros.text")); //$NON-NLS-1$
		vencimientos_morosos = new JMenuItem(rb.getString("Ventana.vencimientos_morosos.text")); //$NON-NLS-1$
		vencimientos_flujo = new JMenuItem(rb.getString("Ventana.vencimientos_flujo.text")); //$NON-NLS-1$
		listado_vencimientos = new JMenu(rb.getString("Ventana.listado_vencimientos.text")); //$NON-NLS-1$
		listadovencimientos_facturacion = new JMenuItem(rb.getString("Ventana.listadovencimientos_facturacion.text")); //$NON-NLS-1$
		listadovencimientos_pendientes = new JMenuItem(rb.getString("Ventana.listadovencimientos_pendientes.text")); //$NON-NLS-1$
		listadovencimientos_morosidad = new JMenuItem(rb.getString("Ventana.listadovencimientos_morosidad.text")); //$NON-NLS-1$
		ayuda_manual = new JMenuItem(rb.getString("Ventana.ayuda_manual.text")); //$NON-NLS-1$
		ayuda_acercade = new JMenuItem(rb.getString("Ventana.ayuda_acercade.text")); //$NON-NLS-1$
		ayuda_calculadora = new JMenuItem(rb.getString("Ventana.ayuda_calculadora.text")); //$NON-NLS-1$
		// FIN CREACION DE MENU

		// MONTAJE DEL MENU
		this.setJMenuBar(barra_menu);

		// OPCIONES PRINCIPALES DEL MENU
		barra_menu.add(archivo);
		barra_menu.add(clientes);
		barra_menu.add(proveedores);
		barra_menu.add(almacen);
		barra_menu.add(vencimientos);
		barra_menu.add(ayuda);

		// OPCIONES DE ARCHIVO
		archivo.add(archivo_configuracion);
		archivo.addSeparator();
		archivo.add(archivo_salir);

		// OPCIONES DE CLIENTES
		clientes.add(clientes_gestion);
		clientes.add(clientes_pedidos);
		clientes.add(clientes_historico);
		clientes.addSeparator();
		clientes.add(listado_clientes);
		listado_clientes.add(listadoclientes_activos);
		listado_clientes.add(listadoclientes_morosos);
		listado_clientes.add(listadoclientes_bajas);

		// OPCIONES DE PROVEEDORES
		proveedores.add(proveedores_gestion);
		proveedores.add(proveedores_pedidos);
		proveedores.add(proveedores_servicios);

		// OPCIONES DE ALMACEN
		almacen.add(almacen_articulos);
		almacen.add(almacen_almacen);
		almacen.add(almacen_catalogo);

		// OPCIONES DE VENCIMIENTOS
		vencimientos.add(vencimientos_cobros);
		vencimientos.add(vencimientos_pagos);
		vencimientos.add(vencimientos_morosos);
		vencimientos.addSeparator();
		vencimientos.add(listado_vencimientos);
		listado_vencimientos.add(listadovencimientos_facturacion);
		listado_vencimientos.add(listadovencimientos_pendientes);
		listado_vencimientos.add(listadovencimientos_morosidad);
		vencimientos.addSeparator();
		vencimientos.add(vencimientos_flujo);

		// OPCIONES DE AYUDA
		ayuda.add(ayuda_manual);
		ayuda.add(ayuda_calculadora);
		ayuda.addSeparator();
		ayuda.add(ayuda_acercade);
		// FIN MONTAJE

		// ASOCIAMOS EL ESCUCHADOR A LOS JMENUITEMS
		archivo_configuracion.addActionListener(this);
		archivo_salir.addActionListener(this);

		clientes_gestion.addActionListener(this);
		clientes_historico.addActionListener(this);
		clientes_pedidos.addActionListener(this);
		listadoclientes_activos.addActionListener(this);
		listadoclientes_bajas.addActionListener(this);
		listadoclientes_morosos.addActionListener(this);

		proveedores_gestion.addActionListener(this);
		proveedores_pedidos.addActionListener(this);
		proveedores_servicios.addActionListener(this);

		almacen_almacen.addActionListener(this);
		almacen_articulos.addActionListener(this);
		almacen_catalogo.addActionListener(this);

		vencimientos_cobros.addActionListener(this);
		vencimientos_morosos.addActionListener(this);
		vencimientos_pagos.addActionListener(this);
		listadovencimientos_facturacion.addActionListener(this);
		listadovencimientos_morosidad.addActionListener(this);
		listadovencimientos_pendientes.addActionListener(this);
		vencimientos_flujo.addActionListener(this);

		ayuda_acercade.addActionListener(this);
		ayuda_calculadora.addActionListener(this);
		ayuda_manual.addActionListener(this);
		// FIN ASOCIAMOS EL ESCUCHADOR A LOS JMENUITEMS

		// ESTABLECEMOS LA PROPIEDAD NAME DE LOS JMENUITEMS PARA LA
		// LOGICA DEL ACTIONPERFORMED
		archivo_configuracion.setName("archivo_configuracion");
		archivo_salir.setName("archivo_salir");

		clientes_gestion.setName("clientes_gestion");
		clientes_pedidos.setName("clientes_pedidos");
		clientes_historico.setName("clientes_historico");
		listadoclientes_activos.setName("listadoclientes_activos");
		listadoclientes_bajas.setName("listadoclientes_bajas");
		listadoclientes_morosos.setName("listadoclientes_morosos");

		proveedores_gestion.setName("proveedores_gestion");
		proveedores_pedidos.setName("proveedores_pedidos");
		proveedores_servicios.setName("proveedores_servicios");

		almacen_almacen.setName("almacen_almacen");
		almacen_articulos.setName("almacen_articulos");
		almacen_catalogo.setName("almacen_catalogo");

		vencimientos_cobros.setName("vencimientos_cobros");
		vencimientos_pagos.setName("vencimientos_pagos");
		vencimientos_morosos.setName("vencimientos_morosos");
		listadovencimientos_facturacion
				.setName("listadovencimientos_facturacion");
		listadovencimientos_morosidad.setName("listadovencimientos_morosidad");
		listadovencimientos_pendientes
				.setName("listadovencimientos_pendientes");
		vencimientos_flujo.setName("vencimientos_flujo");

		ayuda_acercade.setName("ayuda_acercade");
		ayuda_manual.setName("ayuda_manual");
		ayuda_calculadora.setName("ayuda_calculadora");
		getContentPane().setLayout(null);
		
		// FIN CARGA PROPIEDAD NAME

	}

	@Override
	public void ajustes_Reflexion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void establecer_GestionFoco() {
		// TODO Auto-generated method stub

	}

	// ******** FIN AREA DE IMPLEMENTACION DE INTERFACE PROPIA *******

	// *************** AREA DE LOGICA DE PROCESO *********************

	// ************** FIN AREA DE LOGICA DE PROCESO ******************

	// **************** AREA DE EVENTOS ******************************

	@Override
	public void actionPerformed(ActionEvent evento) {
		String opcion_elegida = ((JComponent) evento.getSource()).getName();
		System.out.println(opcion_elegida);
		if (opcion_elegida.equals("archivo_configuracion")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("archivo_salir")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("clientes_gestion")) {
			Clientes_Vista clientes=new Clientes_Vista(this);
		}
		if (opcion_elegida.equals("clientes_pedido")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("clientes_historico")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("listadoclientes_activos")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("listadoclientes_morosos")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("listadoclientes_bajas")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("proveedores_gestion")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("proveedores_pedidos")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("proveedores_servicios")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("almacen_almacen")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("almacen_articulos")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("almacen_catalogo")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("vencimientos_cobros")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("vencimientos_pagos")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("vencimientos_morosos")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("listadosvencimientos_facturacion")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("listadosvencimientos_pendientes")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("listadosvencimientos_morosidad")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("vencimientos_flujo")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("ayuda_acercade")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("ayuda_manual")) {
			// PENDIENTE DE DESARROLLO
		}
		if (opcion_elegida.equals("ayuda_calculadora")) {
			// PENDIENTE DE DESARROLLO
		}
	}
}
