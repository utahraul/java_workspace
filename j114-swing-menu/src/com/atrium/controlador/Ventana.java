package com.atrium.controlador;

import javax.swing.JFrame;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Ventana extends JFrame implements ActionListener,MouseListener {
	// PROPIEDADES PARA EL MENU
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

	private JMenu submenu;
	private JMenuItem submenu1;
	private JMenuItem submenu2;
	
	//********** MENU CONTEXTUAL
	private JPopupMenu menu_contextual;
	
	private JMenuItem mc_opcion11;
	private JMenuItem mc_opcion13;
	private JMenuItem mc_submenu11;

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
		// CREAMOS EL CONTENIDO DE LAS OPCIONES DEL MENU
		opcion11 = new JMenuItem("Abrir");
		opcion12 = new JMenuItem("Cerrar");
		opcion13 = new JMenuItem("Salir");
		opcion21 = new JMenuItem("Gestion");
		opcion22 = new JMenuItem("Facturar");
		opcion31 = new JMenuItem("Ayuda");
		opcion32 = new JMenuItem("Acerca de...");
		// CREAMOS EL SUBMENU
		submenu = new JMenu("submenu");
		submenu1 = new JMenuItem("opcion 1 submenu");
		submenu2 = new JMenuItem("opcion 2 submenu");

		// PONEMOS EL CONTENEDOR DEL MENU EN LA VENTANA
		this.setJMenuBar(barra_menu);
		// AÑADIMOS LAS OPCIONES DEL MENU AL CONTENEDOR
		barra_menu.add(opcion1);
		barra_menu.add(opcion2);
		barra_menu.add(opcion3);
		// PONEMOS EL CONTENIDO DE CADA OPCION DE MENU
		opcion1.add(opcion11);
		opcion1.add(opcion12);
		// COLOCACION DE BARRA DE SEPACION ENTRE OPCIONES DE MENU
		opcion1.addSeparator();
		opcion1.add(opcion13);
		opcion2.add(opcion21);
		opcion2.add(opcion22);
		opcion3.add(opcion31);
		opcion3.add(opcion32);
		// MONTAMOS EL SUBMENU DENTRO DEL MENU DE AYUDA
		opcion3.add(submenu);
		submenu.add(submenu1);
		submenu.add(submenu2);
		// ASOCIAMOS EL ESCUCHADOR DE EVENTOS CON EL COMPONENTE
		opcion11.addActionListener(this);
		opcion12.addActionListener(this);
		opcion13.addActionListener(this);
		opcion21.addActionListener(this);
		opcion22.addActionListener(this);
		opcion31.addActionListener(this);
		opcion32.addActionListener(this);
		// ASOCIAMOS TAMBIEN EL SUBMENU AL MISMO RECEPTOR
		submenu1.addActionListener(this);
		 submenu2.addActionListener(this);
		// DAMOS VALOR A LA PROPIEDAD NAME PARA IDENTIFICAR LOS OBJETOS EN EL
		// EVENTO
		opcion11.setName("opcion11");
		opcion12.setName("opcion12");
		opcion13.setName("opcion13");
		opcion21.setName("opcion21");
		opcion22.setName("opcion22");
		opcion31.setName("opcion31");
		opcion32.setName("opcion32");
		// TRATAMIENTO DEL SUBMENU
		submenu1.setName("submenu1");
		submenu2.setName("submenu2");

		// AÑADIMOS A LA OPCION SALIR UN ACELERADOR DE TECLADO
		opcion13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
	
		//************** MENU CONTEXTUAL ****************
		//CREAMOS EL CONTENEDOR DEL MENU CONTEXTAUL
		menu_contextual=new JPopupMenu();
		
		mc_opcion11 = new JMenuItem("Abrir");
		mc_opcion13 = new JMenuItem("Salir");
		mc_submenu11 = new JMenuItem("Submenu 11");
		
		mc_opcion11.addActionListener(this);
		mc_opcion13.addActionListener(this);
		mc_submenu11.addActionListener(this);
		
		mc_opcion11.setName("opcion11");
		mc_opcion13.setName("opcion13");
		mc_submenu11.setName("submenu11");
				
		//LE DAMOS CONTENIDO A PARTIR DE LOS JMENUITEM YA CREADOS
		menu_contextual.add(mc_opcion11);
		menu_contextual.add(mc_opcion13);
		menu_contextual.addSeparator();
		menu_contextual.add(mc_submenu11);
		
		this.getContentPane().addMouseListener(this);
		
		
	}
	//********** EVENTO DE ACCION ***********
	@Override
	public void actionPerformed(ActionEvent evento) {
		// OBTENEMOS EL VALOR DE LA PROPIEDAD NAME PARA ESTABLECER LA LOGICA DE
		// TRATAMIENTO
		String opcion_elegida = ((JComponent) evento.getSource()).getName();
		System.out.println(opcion_elegida);

	}

	@Override
	public void mouseClicked(MouseEvent evento) {
		//PREGUNTAMOS POR EL BOTON PULSADO, 3 BOTON DERECHO
		if (evento.getButton()==3) {
			//MOSTRAMOS EL MENU CONTEXTUAL
			menu_contextual.show(this, evento.getX(), evento.getY());
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// VACIO POR FALTA DE USO
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// VACIO POR FALTA DE USO
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// VACIO POR FALTA DE USO
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// VACIO POR FALTA DE USO
		
	}
}
