import javax.swing.*;
public class Signos {

	
	public static void main(String[] args) { try{
		
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo: ");
		int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é seu Signo: " + "\n"+
		"1- Áries" + "\n"+
		"2- Touro" + "\n" +
		"3- Gemeos" + "\n" +
		"4- Cancêr" + "\n" +
		"5- Leão" + "\n" +
		"6- Virgem" + "\n" +
		"7- Libra" + "\n" +
		"8- Escorpião" + "\n" +
		"9- Sagitario" + "\n" +
		"10- Capricornio" + "\n" +
		"11- Aquario" + "\n" +
		"12- Peixes" ));
		
		int saber = Integer.parseInt(JOptionPane.showInputDialog(null, "O que voce quer saber: " + "\n" +
		"1- Trabalho" + "\n" +
		"2- Amor"));
		
		// System.out.println(nome +"\n" + "\n" + sexo + "\n" + data + "\n" + saber);
		
		
		
	switch  (data)
	{
	case 1:
		JOptionPane.showMessageDialog(null, "Áries");
		switch (saber)
		{
			case 1:
				JOptionPane.showMessageDialog(null, nome + "\n" + sexo + "\n" + "Áries" + "\n" + " Trabalho" + "\n" + " Vai ficar pobre");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, nome + "\n" + sexo + "\n" + "Áries" + "\n" + " Amor" + "\n" + " Vai casar");
		}
				break;
				
		
	case 2:
		JOptionPane.showMessageDialog(null, "Touro");
		switch (saber)
		{
		case 1:
			JOptionPane.showMessageDialog(null, nome + "\n" + sexo + "\n" + "Touro" + "\n" + " Trabalho" + "\n" + " Vai ficar rico");
		    break;
	   case 2:
		JOptionPane.showMessageDialog(null, nome + "\n" + sexo + "\n" + "Touro" + "\n" + " Amor" + "\n" + " Vai ficar solteiro");
		}
		break;
		
	case 3:
		JOptionPane.showMessageDialog(null, "Gemeos");
		break;
	case 4:
		JOptionPane.showMessageDialog(null, "Cancêr");
		break;
	case 5:
		JOptionPane.showMessageDialog(null, "Leão");
		break;
	case 6:
		JOptionPane.showMessageDialog(null, "Virgem");
		break;
	case 7:
		JOptionPane.showMessageDialog(null, "Libra");
		break;
	case 8:
		JOptionPane.showMessageDialog(null, "Escorpião");
		break;
	case 9:
		JOptionPane.showMessageDialog(null, "Sagitario");
	    break;
	case 10:
		JOptionPane.showMessageDialog(null, "Capricornio");
		break;
	case 11:
		JOptionPane.showMessageDialog(null, "Aquario");
		break;
	case 12:
		JOptionPane.showMessageDialog(null, "Peixes");
		break;
		
	}
	

	}catch(Exception ex) {
	
	
	}
	}
	}


