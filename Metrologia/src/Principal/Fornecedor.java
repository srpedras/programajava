package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Window.Type;

public class Fornecedor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor frame = new Fornecedor();
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

	public Fornecedor() {
		setResizable(false);
		setTitle("FORNECEDOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1402, 808);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(1211, 90, 126, 46);
		contentPane.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.setBounds(1211, 226, 126, 46);
		contentPane.add(btnAtualizar);
		
		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(1211, 362, 126, 46);
		contentPane.add(btnPesquisar);
		
		JButton btnAtualizar_1_1 = new JButton("LIMPAR");
		btnAtualizar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizar_1_1.setBounds(1211, 498, 126, 46);
		contentPane.add(btnAtualizar_1_1);
		
		JButton btnAtualizar_1_1_1 = new JButton("VOLTAR");
		btnAtualizar_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela_principal exibir = new Tela_principal();
				exibir.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(false);

			}
		});
		btnAtualizar_1_1_1.setBounds(1211, 634, 126, 46);
		contentPane.add(btnAtualizar_1_1_1);
		
		JLabel lblNewLabel = new JLabel("RAZÃO SOCIAL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(69, 31, 101, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(205, 26, 475, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFantasia = new JLabel("FANTASIA");
		lblFantasia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFantasia.setBounds(69, 94, 101, 21);
		contentPane.add(lblFantasia);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 89, 475, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 152, 475, 26);
		contentPane.add(textField_2);
		
		JLabel lblEndereo = new JLabel("ENDEREÇO");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereo.setBounds(69, 157, 101, 21);
		contentPane.add(lblEndereo);
		
		JLabel lblComplemento = new JLabel("COMPLEMENTO");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblComplemento.setBounds(69, 220, 101, 21);
		contentPane.add(lblComplemento);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(205, 215, 475, 26);
		contentPane.add(textField_3);
		
		JLabel lblBairro = new JLabel("BAIRRO");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(69, 283, 101, 21);
		contentPane.add(lblBairro);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(205, 278, 475, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(205, 341, 475, 26);
		contentPane.add(textField_5);
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(69, 346, 101, 21);
		contentPane.add(lblCidade);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(69, 409, 101, 21);
		contentPane.add(lblTelefone);
		
		JLabel lblFax = new JLabel("FAX");
		lblFax.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFax.setBounds(69, 472, 101, 21);
		contentPane.add(lblFax);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(205, 467, 194, 26);
		contentPane.add(textField_7);
		
		JLabel lblCelular = new JLabel("CELULAR");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCelular.setBounds(69, 535, 101, 21);
		contentPane.add(lblCelular);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(205, 530, 194, 26);
		contentPane.add(textField_8);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(69, 598, 101, 21);
		contentPane.add(lblEmail);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(205, 593, 475, 26);
		contentPane.add(textField_9);
		
		JLabel lblQualificao = new JLabel("QUALIFICAÇÃO");
		lblQualificao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQualificao.setBounds(69, 661, 101, 21);
		contentPane.add(lblQualificao);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(205, 656, 475, 26);
		contentPane.add(textField_10);
		
		JLabel lblObsesrvao = new JLabel("OBSESRVAÇÃO");
		lblObsesrvao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObsesrvao.setBounds(69, 724, 101, 21);
		contentPane.add(lblObsesrvao);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setColumns(10);
		textField_11.setBounds(205, 705, 646, 56);
		contentPane.add(textField_11);
		
		JLabel lblCdigo = new JLabel("CÓDIGO");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCdigo.setBounds(813, 90, 101, 21);
		contentPane.add(lblCdigo);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCnpj.setBounds(813, 157, 34, 21);
		contentPane.add(lblCnpj);
		
		JLabel lblIe = new JLabel("IE");
		lblIe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIe.setBounds(813, 220, 28, 21);
		contentPane.add(lblIe);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUf.setBounds(813, 283, 28, 21);
		contentPane.add(lblUf);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCep.setBounds(941, 283, 28, 21);
		contentPane.add(lblCep);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(851, 282, 46, 26);
		contentPane.add(textField_12);
	
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(205, 398, 194, 26);
		contentPane.add(formattedTextField);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(851, 218, 194, 26);
		contentPane.add(textField_6);
	}
}
