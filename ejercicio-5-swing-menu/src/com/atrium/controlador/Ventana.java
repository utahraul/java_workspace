package com.atrium.controlador;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Ventana extends JFrame implements ActionListener {

	private JMenuBar barra_menu;

	private JMenu opcion1;
	private JMenu opcion2;
	private JMenu opcion3;

	private JMenuItem opcion11;
	private JMenuItem opcion12;
	private JMenuItem opcion13;
	private JMenuItem opcion21;
	private JMenuItem opcion22;
	private JMenuItem opcion31;
	private JMenuItem opcion32;

	public Ventana() {

		setBounds(new Rectangle(100, 100, 350, 350));
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setResizable(false);

		crear_Interface();

		setVisible(true);

	}

	public void crear_Interface() {
		// CONTENEDOR DEL MENU
		barra_menu = new JMenuBar();
		// CREAMOS LAS OPCIONES DE LA BARRA DE MENU
		opcion1 = new JMenu("Archivo");
		opcion2 = new JMenu("Clientes");
		opcion3 = new JMenu("Ayuda");
		// CREAMOS EL CONTENIDO DE LAS OPCIONES DE MENU
		opcion11 = new JMenuItem("Abrir");
		opcion12 = new JMenuItem("Cerrar");
		opcion13 = new JMenuItem("Salir");
		opcion21 = new JMenuItem("Gestion");
		opcion22 = new JMenuItem("Facturar");
		opcion31 = new JMenuItem("Ayuda");
		opcion32 = new JMenuItem("Acerca de");

		// PONEMOS EL CONTENEDOR DE MENU EN LA VENTANA
		this.setJMenuBar(barra_menu);
		// AÑADIMOS LAS OPCIONES DEL MENU CONTENEDOR
		barra_menu.add(opcion1);
		barra_menu.add(opcion2);
		barra_menu.add(opcion3);
		// PONEMOS ELCONTENIDO DE CADA OPCIÓN DE MENU
		opcion1.add(opcion11);
		opcion1.add(opcion12);
		opcion1.addSeparator();
		opcion1.add(opcion13);
		opcion2.add(opcion21);
		opcion2.add(opcion22);
		opcion3.add(opcion31);
		opcion3.add(opcion32);
		// ASOCIAMOS EL ESCUCHADOR DE EVENTOS CON EL COMPONENTE
		opcion11.addActionListener(this);
		opcion12.addActionListener(this);
		opcion13.addActionListener(this);
		opcion21.addActionListener(this);
		opcion22.addActionListener(this);
		opcion31.addActionListener(this);
		opcion32.addActionListener(this);
		// DAMOS VALOR A LA PROPIEDAD NAME PARA IDENTIFICAR LOS OBJETOS
		// EN EL EVENTO
		opcion11.setName("opcion11");
		opcion12.setName("opcion12");
		opcion13.setName("opcion13");
		opcion21.setName("opcion21");
		opcion22.setName("opcion22");
		opcion31.setName("opcion31");
		opcion32.setName("opcion32");
		
		opcion13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.ALT_MASK));

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// OBTENEMOS EL VALOR DE LA PROPIEDAD NAME PARA ESTABLECER LA LÓGICA DE
		// TRATAMIENTO
		String opcion_elegida = ((JComponent) evento.getSource()).getName();
		System.out.println(opcion_elegida);
	}

}
