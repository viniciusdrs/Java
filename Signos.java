import javax.swing.*;
public class Signos {

	
	public static void main(String[] args) { try{
		
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo: ");
		int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � seu Signo: " + "\n"+
		"1- �ries" + "\n"+
		"2- Touro" + "\n" +
		"3- Gemeos" + "\n" +
		"4- Canc�r" + "\n" +
		"5- Le�o" + "\n" +
		"6- Virgem" + "\n" +
		"7- Libra" + "\n" +
		"8- Escorpi�o" + "\n" +
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
		JOptionPane.showMessageDialog(null, "�ries");
		switch (saber)
		{
			case 1:
				JOptionPane.showMessageDialog(null, nome + "\n" + sexo + "\n" + "�ries" + "\n" + " Trabalho" + "\n" + " Vai ficar pobre");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, nome + "\n" + sexo + "\n" + "�ries" + "\n" + " Amor" + "\n" + " Vai casar");
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
		JOptionPane.showMessageDialog(null, "Canc�r");
		break;
	case 5:
		JOptionPane.showMessageDialog(null, "Le�o");
		break;
	case 6:
		JOptionPane.showMessageDialog(null, "Virgem");
		break;
	case 7:
		JOptionPane.showMessageDialog(null, "Libra");
		break;
	case 8:
		JOptionPane.showMessageDialog(null, "Escorpi�o");
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


