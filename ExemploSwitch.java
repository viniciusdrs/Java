import javax.swing.JOptionPane;


public class ExemploSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int diaDaSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia Da Semana Digite: " + "\n"+
				"1- Domingo" + "\n" +
				"2- Segunda-Feira" + "\n"+
				"3- Ter�a-Feira" + "\n"+
				"4- Quarta-Feira" + "\n"+
				"5- Quinta-Feira" + "\n"+
				"6- Sexta-Feira" + "\n"+
				"7- S�bado"));
		
		switch (diaDaSemana) {

		case 1:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
			
		case 2 :
		    JOptionPane.showMessageDialog(null, "Segunda-Feira");
		    break;
		    
		case 3 :
			JOptionPane.showMessageDialog(null, "Ter�a-Feira");
	        break;
	        
		case 4 :
			JOptionPane.showMessageDialog(null, "Quarta-Feira");
	        break;
		
		case 5 :
			JOptionPane.showMessageDialog(null, "Quinta-Feira");
	        break;
		
		case 6 :
			JOptionPane.showMessageDialog(null, "Sexta-Feira");
	        break;
		
		case 7 :
			JOptionPane.showMessageDialog(null, "S�bado");
	        break;
		}
		
		
		
		}
		
		
		
		
	}
