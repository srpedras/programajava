package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_principal frame = new Tela_principal();
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
	public Tela_principal() {
		setResizable(false);
		setTitle("TELA PRINCIPAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1408, 794);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CADASTRAR EQUIPAMENTO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarEquipamento exibir = new CadastrarEquipamento();
				exibir.setVisible(true);
		    	setLocationRelativeTo(null);
		    	setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(607, 210, 227, 109);
		contentPane.add(btnNewButton);
		
		JButton btnValoresDeReferncia = new JButton("VALORES DE REFERÊNCIA");
		btnValoresDeReferncia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnValoresDeReferncia.setBounds(1042, 210, 227, 109);
		contentPane.add(btnValoresDeReferncia);
		
		JButton btnNewButton_1_1 = new JButton("DETALHES");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(1042, 461, 227, 109);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnHistrico = new JButton("HISTÓRICO");
		btnHistrico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHistrico.setBounds(154, 461, 227, 109);
		contentPane.add(btnHistrico);
		
		JButton btnNewButton_1_1_1 = new JButton("FORNECEDOR");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor exibir = new Fornecedor();
				exibir.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(false);

			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBounds(607, 461, 227, 109);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("USUARIOS");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBounds(154, 210, 227, 109);
		contentPane.add(btnNewButton_1_2);
	}

}
