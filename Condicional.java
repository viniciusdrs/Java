import javax.swing.JOptionPane;
public class Condicional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nome = "";	
		
	nome = JOptionPane.showInputDialog(null, "Entre com seu nome ", nome, 3);
	
int x = 10;
int y = 5;

 System.out.print("Seu nome � "+ nome);

if(x > y){
	JOptionPane.showMessageDialog(null, x + " � maior que " + y);
} else if (x < y){
	JOptionPane.showMessageDialog(null, x + " � menor que " + y);
}else {
	JOptionPane.showMessageDialog(null, x + " � igual a " + y);
}
	}

}
