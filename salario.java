import javax.swing.*;
public class salario {

	public static void main(String[] args) {
	
	
		float salarioFuncionario;
		float salarioAumentado, imposto, horas_Extras, salarioReal, inss;
		double aH = 2.72;
				

		salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o salario: " ));
		
		
		horas_Extras = Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de horas Extras Mensais: "));
		
		salarioAumentado = (float) (salarioFuncionario + aH * horas_Extras * );

		JOptionPane.showMessageDialog(null, "o Salario Aumentado fica: " + salarioAumentado);

		
		inss = (float) ((float) (salarioFuncionario + horas_Extras)  * 0.08);
		JOptionPane.showMessageDialog(null, "o Salario com Desconto fica: " + inss);

		//imposto = (salarioAumentado * 8)/100;
		//JOptionPane.showMessageDialog(null, "O imposto tira: " + imposto);

		//salarioReal = salarioAumentado - imposto;
		//JOptionPane.showMessageDialog(null, "o Salario Real fica: " + salarioReal);
	}

}
