package Model;

import java.sql.*;
import javax.swing.*;
import Model.Funcionario;
import Util.Conexao;


public class FuncionarioDAO {

	private static PreparedStatement statement;
	private static ResultSet rs;
	
	static Connection conexao = new Conexao().getConnection();
	
	public static void insereFuncionarioDAO(Funcionario func){
		
		try{
			String sql = "INSERT INTO FUNCIONARIO (nome, email) VALUES (?,?)";
			
			statement = conexao.prepareStatement(sql);
			
			statement.setString(1, func.nome);
			statement.setString(2, func.email);
			
			statement.execute();
			statement.close();
			
	JOptionPane.showMessageDialog(null, "Gravado com sucesso !!!");
			
		}catch (SQLException e1){
			e1.printStackTrace();
		}
	}
}
