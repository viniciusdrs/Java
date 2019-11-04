import javax.swing.JOptionPane;
public class Celsicus {
	
	public static void main (String [] args) {

float celsius;
double fahre;
celsius  = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a temperatura em Celsius: "));



fahre = (celsius * 1.8) + 32;

JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheint é: " + fahre) ;


}}


