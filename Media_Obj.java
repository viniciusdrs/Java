


import javax.swing.JOptionPane;
public class Media_Obj {

	static float n1,n2,n3;
	static float media;

	
	public static float calculo(float nota1, float nota2,float nota3) {
		n1 = nota1;
		n2 = nota2;
		n3 = nota3;
		
		if (n1 > n2 && n2 > n3) {
			media = (n1 + n2)/2;
			JOptionPane.showMessageDialog(null, "Nota 1 e Nota 2 foram as maiores");
		}else if(n2 > n1 && n3 > n1) {
			media = (n2 + n3)/2;
			JOptionPane.showMessageDialog(null, "Nota 2 e Nota 3 foram as maiores");
		}else if (n3 > n2 && n1 > n2) {
			media = (n3 + n1)/2;
			JOptionPane.showMessageDialog(null, "Nota 3 e nota 1 foram as maiores");
		}
		
		return media;
	}
	
	
	
}

	
		

	

