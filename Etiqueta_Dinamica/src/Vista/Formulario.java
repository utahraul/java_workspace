package Vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JPanel implements ActionListener {

	private JLabel nombre;
	private JLabel apellido;
	private JLabel direccion;
	private JLabel pais;
	private JButton cargar;
	private JButton guardar;
	private JButton salir;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public Formulario() {
		setLayout(null);
		setBounds(0, 0, 494, 272);

		crear_Interface();
	}

	public void crear_Interface() {

		nombre = new JLabel("Nombre");
		nombre.setToolTipText("Nombre");
		nombre.setBounds(50, 32, 60, 15);
		add(nombre);

		apellido = new JLabel("Apellido");
		apellido.setToolTipText("Apellido");
		apellido.setBounds(50, 78, 60, 15);
		add(apellido);

		direccion = new JLabel("Direcci\u00F3n");
		direccion.setToolTipText("Direcci\u00F3n");
		direccion.setBounds(50, 124, 60, 15);
		add(direccion);

		pais = new JLabel("Pa\u00EDs");
		pais.setToolTipText("Pa\u00EDs");
		pais.setBounds(50, 170, 60, 15);
		add(pais);

		textField_4 = new JTextField();
		textField_4.setBounds(150, 29, 300, 25);
		add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(150, 75, 300, 25);
		add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(150, 121, 300, 25);
		add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(150, 170, 300, 25);
		add(textField_7);
		textField_7.setColumns(10);

		cargar = new JButton("Cargar datos");
		cargar.setToolTipText("Cargar datos");
		cargar.setBounds(50, 215, 120, 25);
		add(cargar);

		guardar = new JButton("Guardar datos");
		guardar.setToolTipText("Guardar datos");
		guardar.setBounds(186, 217, 120, 23);
		add(guardar);

		salir = new JButton("Salir");
		salir.setToolTipText("Salir");
		salir.setBounds(321, 217, 120, 23);
		add(salir);

		cargar.addActionListener(this);
		guardar.addActionListener(this);
		salir.addActionListener(this);

		cargar.setName("cargar");
		guardar.setName("guardar");
		salir.setName("salir");

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String boton_seleccionado = ((JButton) evento.getSource()).getName();
		if (boton_seleccionado.equals("cargar")) {
			System.out.print("Cargar");
		}
		if (boton_seleccionado.equals("guardar")) {
			System.out.print("Guardar");
		}
		if (boton_seleccionado.equals("salir")) {
			System.exit(0);
		}

	}

}
