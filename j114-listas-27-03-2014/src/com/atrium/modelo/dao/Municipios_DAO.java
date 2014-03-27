package com.atrium.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atrium.modelo.Municipios;

public class Municipios_DAO {

	private Connection conexion;
	private Statement sta;
	private ResultSet rs;
	private PreparedStatement pta;

	public Municipios_DAO() {

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

	public List<Municipios> consultar_PorProvincia(Integer codigo_provincia) {
		List<Municipios> lista = new ArrayList<>();
		try {
			pta = conexion
					.prepareStatement("select * from municipios where provincia = ?");
			// SUSTITUÍMOS LA VARIABLE POR SU VALOR. EL 1 ES PORQUE ES UNA
			// CONSULTA CON 1 SOLA VARIABLE
			pta.setInt(1, codigo_provincia);
			rs = pta.executeQuery();
			Municipios municipio_nuevo;
			while (rs.next()) {
				municipio_nuevo = new Municipios();
				municipio_nuevo.setCodigomunicipio(rs.getInt(1));
				municipio_nuevo.setMunicipio(rs.getString(3));
				lista.add(municipio_nuevo);
			}
			rs.close();
			pta.close();
			conexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}
}
