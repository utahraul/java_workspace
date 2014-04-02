package com.atrium.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.atrium.conexion.Conexion;

public class Linea_PedidoDAO extends Abstract_DAO {

	public Linea_PedidoDAO() {
		super();
	}

	public Linea_PedidoDAO(int tipoconexion) {
		super(tipoconexion);
	}

	public void alta_LineaPedido(Linea_Pedido linea_nueva) {

		try {
			pta = conexion.prepareStatement(rb.getString("alta.lineapedido"));
			if (linea_nueva.getCodigo_linea_pedido() != null) {
				pta.setLong(1, linea_nueva.getCodigo_linea_pedido());
			} else {
				pta.setLong(1, new Long(0));

			}
			if (linea_nueva.getCodigo_articulo() != null) {
				pta.setInt(2, linea_nueva.getCodigo_articulo());
			} else {
				pta.setInt(2, new Integer(0));

			}
			if (linea_nueva.getNumero_pedido() != null) {
				pta.setInt(3, linea_nueva.getNumero_pedido());
			} else {
				pta.setInt(3, new Integer(0));

			}

			if (linea_nueva.getPrecio_unidad_articulo() != null) {
				pta.setDouble(4, linea_nueva.getPrecio_unidad_articulo());
			} else {
				pta.setDouble(4, new Double(0));

			}
			if (linea_nueva.getNumero_unidades_articulo() != null) {
				pta.setInt(5, linea_nueva.getNumero_unidades_articulo());
			} else {
				pta.setInt(5, new Integer(0));

			}
			if (linea_nueva.getPorcentaje_descuento() != null) {
				pta.setFloat(6, linea_nueva.getPorcentaje_descuento());
			} else {
				pta.setFloat(6, new Float(0));

			}
			pta.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void baja_Pedido(Linea_Pedido linea_aborrar) {

	}

	public void modificacion_LineaPedido(Linea_Pedido linea_amodificar) {

	}

	public List<Linea_Pedido> consultar_LineasPedido(Pedido numero_pedido) {

		return null;
	}

}
