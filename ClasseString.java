import javax.swing.JOptionPane;
public class ClasseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nome = "JOpitionPane";
JOptionPane.showMessageDialog(null,
		"Nome: " + nome +"\n"+
        "Quantidade" + nome.length()+"\n"+
		"Mai�sculo"	+ nome.toUpperCase()+"\n"+
        "Min�sculo" + nome.toLowerCase()+"\n"+
		"Segundo Caractere" + nome.charAt(1)+"\n"+
        "Substitui Caractere" + nome.replace("o", "b")+"\n"+
		"Retorna um Trecho do Texto" + nome.substring(1, 3));
	}

}
