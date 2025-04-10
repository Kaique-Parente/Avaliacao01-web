package com.mycompany.avaliacao01web.resources;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CRUD {
	private Connection conexao;
	private PreparedStatement ps;
	
	public void InserirFuncionario(Funcionario funcionario) {
		
		String sql = "INSERT INTO funcionarios (nome, funcao, idade, salario) VALUES (?,?,?,?)";
		conexao = new ConectorJDBC().conexao();
		
		try {
			
			ps = conexao.prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			ps.setString(2, funcionario.getFunção());
			ps.setInt(3, funcionario.getIdade());
			ps.setDouble(4, funcionario.getSalario());
			
			ps.execute();
			ps.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
