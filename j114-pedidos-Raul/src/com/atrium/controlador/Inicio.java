package com.atrium.controlador;

import java.util.Date;

import com.atrium.modelo.Linea_Pedido;
import com.atrium.modelo.Linea_PedidoDAO;
import com.atrium.modelo.Pedido;
import com.atrium.modelo.Pedidos_DAO;

public class Inicio {

	public static void main(String[] args) {
		// Pedidos_DAO pedido_dao = new Pedidos_DAO();
		//
		// Pedido pedido_nuevo = new Pedido();
		// pedido_nuevo.setNumero_pedido(new Integer(999));
		// pedido_nuevo.setFecha_pedido(new Date());
		// pedido_nuevo.setTotal_factura_pedido(new Double(10151));
		// pedido_nuevo.setCodigo_cliente(new Integer(21));
		//
		// pedido_dao.alta_Pedido(pedido_nuevo);
		//
		// pedido_nuevo.setCodigo_cliente(new Integer(25));
		//
		// pedido_dao.modificar_Pedido(pedido_nuevo);
		//
		// pedido_dao.baja_Pedido(pedido_nuevo);

		Linea_PedidoDAO lineapedido_dao = new Linea_PedidoDAO();

		Linea_Pedido lineapedido_nuevo = new Linea_Pedido();
		
		lineapedido_nuevo.setCodigo_linea_pedido(new Long(5));
		lineapedido_nuevo.setCodigo_articulo(new Integer(101));
		lineapedido_nuevo.setNumero_pedido(new Integer(998));
		lineapedido_nuevo.setPrecio_unidad_articulo(new Double(10));
		lineapedido_nuevo.setNumero_unidades_articulo(new Integer(1000));
		lineapedido_nuevo.setPorcentaje_descuento(new Float(0));
		
		lineapedido_dao.alta_LineaPedido(lineapedido_nuevo);
		System.out.println("Inserción correcta");
	}

}
