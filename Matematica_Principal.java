import javax.swing.JOptionPane;


public class Matematica_Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nota1,nota2;
		
		 nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "entre a com 1� nota "));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "entre a com 2� nota "));
		 
		 
		 Matematica mat = new Matematica(nota1,nota2);
		
		
		
		
		
		System.out.println("A soma � " + mat.soma());
		System.out.println("A subtra��o � " + mat.subtra��o());
		System.out.println("A multiplica��o � " + mat.multiplica��o());
		System.out.println("A divis�o � " + mat.divis�o());
		
		

	}

}
