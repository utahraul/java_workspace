package com.atrium.controlador;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import com.atrium.modelo.Gestion_Pais;
import com.atrium.modelo.IGestion_Pais;
import com.atrium.modelo.Pais;

public class Ventana extends JFrame {
	private JLabel eti_paises;
	private JComboBox combo_paises;

	public Ventana() {
		setBounds(100, 100, 500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		crear_Interface();

		setVisible(true);
	}

	public void crear_Interface() {
		eti_paises = new JLabel("Paises");
		eti_paises.setBounds(10, 65, 58, 14);
		getContentPane().add(eti_paises);

		// ACCESO A LA CAPA MODELO
		IGestion_Pais gestion_pais = new Gestion_Pais();
		List<Pais> lista = gestion_pais.consultar_Todos();
		// TRATAMIENTO DE LA INFORMACION RECIBIDA
		String tabla_paises[] = new String[lista.size()+1];
		tabla_paises[0]="Seleccione un pais";
		int posicion = 1;
		for (Pais pais : lista) {
			// CARGAMOS LA INFORMACION EN LA TABLA
			tabla_paises[posicion] = pais.getPaisnombre() + " - "
					+ String.valueOf(pais.getCodigopais());
			posicion++;
		}

		combo_paises = new JComboBox(tabla_paises);
		combo_paises.setBounds(78, 56, 150, 26);
		//combo_paises.setSelectedIndex(-1);
		getContentPane().add(combo_paises);

	}
}
