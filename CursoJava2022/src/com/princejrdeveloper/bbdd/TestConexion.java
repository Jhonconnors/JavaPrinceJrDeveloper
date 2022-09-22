package com.princejrdeveloper.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) {


		Conexion c = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;

		try {
			cn = c.conectar();
			stm = cn.createStatement();
			
			stm.executeUpdate("INSERT INTO datos(nombre, apellido, categoria) VALUES ('Robert','Smith','Silver')"); 
			
			rs = stm.executeQuery("SELECT * FROM datos");
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				String categoria = rs.getString(4);
				
				System.out.println(id+" "+nombre+" "+apellido+" "+categoria);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
