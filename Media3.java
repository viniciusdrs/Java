
import javax.swing.JOptionPane;

public class Media3 {
	
	static float n1,n2,n3;
	static float media;

	public static void main(String[] args) {
		
		n1 = Float.valueOf(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
		n2 = Float.valueOf(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
		n3 = Float.valueOf(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
		
		
		Media_Obj obj = new Media_Obj();
		
		obj.calculo(n1, n2, n3);
		
		
		
		JOptionPane.showMessageDialog(null, "A média foi: " + obj.media);
		
	}
	
	
}

