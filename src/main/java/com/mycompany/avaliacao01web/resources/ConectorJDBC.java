package com.mycompany.avaliacao01web.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorJDBC {
	
	Connection con = null;
	
	public Connection conexao() {
		
		try {
		
			final String url = "jdbc:mysql://localhost:3306/empresav01";
			final String usuario = "root";
			final String senha = "P@$$w0rd";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,usuario, senha);
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	
	

}
