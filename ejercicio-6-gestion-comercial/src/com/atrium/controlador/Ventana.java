package com.atrium.controlador;

import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.JFrame;

import com.atrium.vista.ICrear_Interface;

public class Ventana extends JFrame implements ICrear_Interface {
	public Ventana() {
		setBounds(new Rectangle(0, 0, 1024, 768));
	}
	
	

}
