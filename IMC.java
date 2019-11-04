package vinicius.java;

import javax.swing.JOptionPane;
public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nome = JOptionPane.showInputDialog(null, "Entre com seu Nome");

float altura,peso,imc;
altura= Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a sua Altura ")); 
peso= Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o seu Peso "));

imc = peso/ (altura*altura);

if (imc <= 18.5){
JOptionPane.showMessageDialog(null, nome+" Magreza "+imc );


}else if(imc <= 30){
JOptionPane.showInputDialog(null, nome+" Saudável "+imc);

	}else{
		JOptionPane.showInputDialog(null, nome+" Obeso "+imc);
	}
	

	}

}
