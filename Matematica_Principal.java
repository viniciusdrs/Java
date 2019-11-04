import javax.swing.JOptionPane;


public class Matematica_Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nota1,nota2;
		
		 nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "entre a com 1° nota "));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "entre a com 2° nota "));
		 
		 
		 Matematica mat = new Matematica(nota1,nota2);
		
		
		
		
		
		System.out.println("A soma é " + mat.soma());
		System.out.println("A subtração é " + mat.subtração());
		System.out.println("A multiplicação é " + mat.multiplicação());
		System.out.println("A divisão é " + mat.divisão());
		
		

	}

}
