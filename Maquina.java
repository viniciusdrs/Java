package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Maquina extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreo;
	private JTextField txtDinheiro;
	private JTextField txtTroco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquina frame = new Maquina();
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
	public Maquina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCocacola = new JButton("Coca-Cola");
		btnCocacola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPreo.setText(String.valueOf("8"));
			}
		});
		btnCocacola.setBounds(10, 228, 114, 23);
		contentPane.add(btnCocacola);
		

		
		JButton btnFanta = new JButton("Fanta");
		btnFanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtPreo.setText(String.valueOf("7"));
			}
		});
		btnFanta.setBounds(10, 274, 89, 23);
		contentPane.add(btnFanta);
		
		JButton btnSprite = new JButton("Sprite");
		btnSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			try{
				
			txtPreo.setText(String.valueOf("5"));
			
			} catch (Exception e) {
			
			}
			}
		} );
		btnSprite.setBounds(10, 320, 89, 23);
		contentPane.add(btnSprite);
		
		JButton btnPepsi = new JButton("Pepsi");
		btnPepsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtPreo.setText(String.valueOf("7"));
			}
		});
		btnPepsi.setBounds(10, 366, 89, 23);
		contentPane.add(btnPepsi);
		
		JLabel lblMaquinaDeRefigerante = new JLabel("Maquina de Refigerante");
		lblMaquinaDeRefigerante.setBounds(53, 60, 168, 23);
		contentPane.add(lblMaquinaDeRefigerante);
		
		JList list = new JList();
		list.setBounds(230, 336, -38, -58);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(278, 355, -77, -108);
		contentPane.add(list_1);
		
		txtDinheiro = new JTextField();
		txtDinheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				}
		});
		
		txtPreo = new JTextField();
		txtPreo.setBounds(319, 229, 86, 20);
		contentPane.add(txtPreo);
		txtPreo.setColumns(10);
		txtDinheiro.setBounds(319, 275, 86, 20);
		contentPane.add(txtDinheiro);
		txtDinheiro.setColumns(10);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(319, 334, 86, 20);
		contentPane.add(txtTroco);
		txtTroco.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(230, 232, 46, 14);
		contentPane.add(lblPreo);
		
		JLabel lblDinheiro = new JLabel("Dinheiro");
		lblDinheiro.setBounds(230, 278, 62, 14);
		contentPane.add(lblDinheiro);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setBounds(230, 337, 46, 14);
		contentPane.add(lblTroco);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
try{
					
					int preco = Integer.parseInt(txtPreo.getText());
					
					
					int dinhe = Integer.parseInt(txtDinheiro.getText());
					
					int troco = dinhe - preco;
					
					
					
					txtTroco.setText(String.valueOf(troco));
					
					
					
					}catch (Exception e){
					
				}
				
			}
		});
		btnNewButton.setBounds(257, 411, 89, 23);
		contentPane.add(btnNewButton);
	}
}
