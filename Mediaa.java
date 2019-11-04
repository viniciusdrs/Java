import javax.swing.JOptionPane;
public class Mediaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String nome = JOptionPane.showInputDialog(null, "Entre com o nome do Aluno ");
		

		float nota1,nota2,media;
		nota1= Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a Primeira nota")); 
		nota2= Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a Segunda nota "));
		
		media= (nota1+nota2)/2;
		
		if (media > 6){
			JOptionPane.showMessageDialog(null, nome+ " Aprovado Media: "+media);
			
		}else if(media >= 4 && media < 6){
			JOptionPane.showMessageDialog(null, nome + " Recuperaçao  "+media);
			
		
		}else{	
			JOptionPane.showMessageDialog(null, nome + " Reprovado "+media);
	


		}
		
	}

}
