import java.util.Scanner;
import javax.swing.JOptionPane;
public class Array {


	public static void main(String[] args) {
		
		int soma[] = new int [10];
			int resul = 0;
		JOptionPane.showMessageDialog(null, "Entre com o vlaor da soma");
		
		for(int i = 0; i < soma.length; i++ ){
		
			soma[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor na Posição" + i));
			
			resul += soma[i];
			
			System.out.println("A soma é = " + soma[i]);
			
			
			
			
		}
		}
	}
