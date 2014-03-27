package com.atrium.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Articulos_DAO implements IGestion_Articulos {
	
	private Connection conexion;
	private Statement sta;
	private ResultSet rs;
	private PreparedStatement pta;
	
	public Articulos_DAO() {

		boolean valido = true;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			valido = false;
		}
		if (valido) {
			try {
				conexion = DriverManager.getConnection(
						"jdbc:oracle:thin:@a3-server:1521:XE", "master",
						"master");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	/* (non-Javadoc)
	 * @see com.atrium.modelo.IGestion_Articulos#consultar_Todos()
	 */
	@Override
	public List<Articulos_DTO> consultar_Todos(){

		List<Articulos_DTO> lista = new ArrayList<>();
		try {
			sta = conexion.createStatement();
			rs = sta.executeQuery("select * from articulos");
			Articulos_DTO articulo_nuevo;
			while (rs.next()) {
				articulo_nuevo = new Articulos_DTO();
					
				articulo_nuevo.setCodigoarticulo(rs.getInt("codigo_articulo"));
				articulo_nuevo.setDescripcionarticulo(rs.getString("descripcion_articulo"));
				articulo_nuevo.setPreciounidadarticulo(rs.getDouble("preciounidadarticulo"));
				articulo_nuevo.setCantidad(rs.getInt("cantidad_articulo"));
				lista.add(articulo_nuevo);
			}
			rs.close();
			sta.close();
			conexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	
	}

}
