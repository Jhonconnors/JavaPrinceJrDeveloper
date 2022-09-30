package com.princejrdeveloper.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Conexion {

	private static BasicDataSource dataSource = null;
	
	private static DataSource getDataSource() {
		if (dataSource==null) {
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUsername("root");
		    dataSource.setPassword("admin");
		    dataSource.setUrl("jdbc:mysql://localhost:3306/crud_javaee?useTimezone=true&serverTimezone=UTC");
		}
		return dataSource;
	}
	
	public static Connection getConnection() throws SQLException{
		return getDataSource().getConnection();
	}
	
}
