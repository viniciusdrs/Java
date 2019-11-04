package Util;
import javax.swing.*;
import java.sql.*;

public class TestarConexao {

	public static void testarConexao() {
		//Classe   obj  Classe      Método
		Connection conexao = new Conexao().getConnection();
		
		JOptionPane.showMessageDialog(null, "Conexão OK");
	}
}
