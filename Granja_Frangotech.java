import javax.swing.JOptionPane;


public class Granja_Frangotech {


	public static void main(String[] args) {
		
		float frangoChip;
		Double frangoAnel, anelEchip;
		
		int frangoTotal = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a quantidade de Frangos: "));
		
		frangoChip = frangoTotal * 4;
		frangoAnel = frangoTotal * 3.50;
		
		anelEchip = frangoChip + frangoAnel;
		
		JOptionPane.showMessageDialog(null, "O Total de gasto com o Chip no p� direito �: "+ frangoChip);
		JOptionPane.showMessageDialog(null, "O Total de gasto com o Anel no p� esquerdo �: "+ frangoAnel);
		JOptionPane.showMessageDialog(null, "O Total de gasto com os 2 Aneis s�o: : "+ anelEchip);


		
	}

}
