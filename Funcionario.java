import javax.swing.JOptionPane;
public class Funcionario {

	
	public static void main(String[] args) {
	
float salarioFuncionario;
float salarioAumentado, imposto, salarioReal;

		

salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o salario: " ));

salarioAumentado = (float) (salarioFuncionario * 1.15);
JOptionPane.showMessageDialog(null, "o Salario Aumentado fica: " + salarioAumentado);

imposto = (salarioAumentado * 8)/100;
JOptionPane.showMessageDialog(null, "com o imposto fica: " + imposto);

salarioReal = salarioAumentado - imposto;
JOptionPane.showMessageDialog(null, "o Salario Real fica: " + salarioReal);




	}

}
