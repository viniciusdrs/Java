package Util;
import javax.swing.*;
import java.sql.*;

public class TestarConexao {

	public static void testarConexao() {
		//Classe   obj  Classe      M�todo
		Connection conexao = new Conexao().getConnection();
		
		JOptionPane.showMessageDialog(null, "Conex�o OK");
	}
}
