package com.atrium.controlador;

import java.util.Date;

import com.atrium.modelo.Pedido;
import com.atrium.modelo.Pedidos_DAO;

public class Inicio {

	public static void main(String[] args) {
		Pedidos_DAO pedido_dao = new Pedidos_DAO();

		Pedido pedido_nuevo = new Pedido();
		pedido_nuevo.setNumero_pedido(new Integer(998));
		pedido_nuevo.setFecha_pedido(new Date());
		pedido_nuevo.setTotal_factura_pedido(new Double(10151));
		pedido_nuevo.setCodigo_cliente(new Integer(21));

		pedido_dao.alta_Pedido(pedido_nuevo);

	}

}
