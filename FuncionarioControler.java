package Control;

import Model.Funcionario;
import Model.FuncionarioDAO;

public class FuncionarioControler {
	
	public static void insereFuncionarioControl(String nome, String email){
		
		Funcionario objFunc = new Funcionario();
		objFunc.setNome(nome);
		objFunc.setEmail(email);
		
		FuncionarioDAO FuncDAO = new FuncionarioDAO();
		
		FuncionarioDAO.insereFuncionarioDAO(objFunc);
	}

}
