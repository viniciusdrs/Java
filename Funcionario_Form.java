package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Util.TestarConexao;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario_Form extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_Form frame = new Funcionario_Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Funcionario_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(76, 116, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(117, 113, 189, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(76, 149, 46, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(117, 146, 189, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				
			}
		});
		btnCadastrar.setBounds(10, 342, 103, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnTestarConexo = new JButton("Testar Conexao");
		btnTestarConexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TestarConexao objTestarConexao = new TestarConexao();
				objTestarConexao.testarConexao();
			}
		});
		btnTestarConexo.setBounds(10, 388, 129, 23);
		contentPane.add(btnTestarConexo);
	}
}
