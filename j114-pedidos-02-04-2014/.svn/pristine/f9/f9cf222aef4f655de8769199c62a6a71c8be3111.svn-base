package com.atrium.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import com.atrium.conexion.Conexion;

public class Pedidos_DAO extends Abstract_DAO {

	public Pedidos_DAO() {
		super();
	}

	public Pedidos_DAO(int tipoconexion) {
		super(tipoconexion);
	}

	public void alta_Pedido(Pedido pedido_nuevo) {
		try {
			pta = conexion.prepareStatement(rb.getString("alta.pedido"));

			pta.setInt(1, pedido_nuevo.getNumero_pedido());
			if (pedido_nuevo.getFecha_pedido() != null) {
				pta.setDate(2, new Date(pedido_nuevo.getFecha_pedido()
						.getTime()));
			} else {
				pta.setDate(2, new Date(new java.util.Date().getTime()));
			}
			if (pedido_nuevo.getPorte_pedido() != null) {
				pta.setDouble(3, pedido_nuevo.getPorte_pedido());
			} else {
				pta.setDouble(3, new Double(0));
			}
			if (pedido_nuevo.getSeguro_pedido() != null) {
				pta.setDouble(4, pedido_nuevo.getSeguro_pedido());
			} else {
				pta.setDouble(4, new Double(0));
			}
			if (pedido_nuevo.getOtros_cargos_pedio() != null) {
				pta.setDouble(5, pedido_nuevo.getOtros_cargos_pedio());
			} else {
				pta.setDouble(5, new Double(0));
			}
			if (pedido_nuevo.getTotal_cargos_pedido() != null) {
				pta.setDouble(6, pedido_nuevo.getTotal_cargos_pedido());
			} else {
				pta.setDouble(6, new Double(0));
			}
			if (pedido_nuevo.getTotal_bruto_pedido() != null) {
				pta.setDouble(7, pedido_nuevo.getTotal_bruto_pedido());
			} else {
				pta.setDouble(7, new Double(0));
			}
			if (pedido_nuevo.getPorcentaje_iva_pedido() != null) {
				pta.setInt(8, pedido_nuevo.getPorcentaje_iva_pedido());
			} else {
				pta.setInt(8, new Integer(0));
			}
			if (pedido_nuevo.getIva_pedido() != null) {
				pta.setDouble(9, pedido_nuevo.getIva_pedido());
			} else {
				pta.setDouble(9, new Double(0));
			}
			if (pedido_nuevo.getTotal_factura_pedido() != null) {
				pta.setDouble(10, pedido_nuevo.getTotal_factura_pedido());
			} else {
				pta.setDouble(10, new Double(0));
			}
			pta.setInt(11, pedido_nuevo.getCodigo_cliente());

			pta.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void baja_Pedido(Pedido pedido_aeliminar) {

	}

	public void modificar_Pedido(Pedido pedido_amodificar) {

	}

	public Pedido consultar_PedidoPorNumero(Integer numero_pedido) {

		return null;
	}
}
