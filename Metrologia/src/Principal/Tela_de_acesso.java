package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Tela_de_acesso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_de_acesso frame = new Tela_de_acesso();
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
	public Tela_de_acesso() {
		setTitle("TELA DE LOGIN");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(78, 73, 86, 41);
		contentPane.add(lblUsuario);
		
		JLabel lblSENHA = new JLabel("SENHA");
		lblSENHA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSENHA.setBounds(78, 162, 86, 41);
		contentPane.add(lblSENHA);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfUsuario.setBounds(223, 83, 205, 19);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(223, 175, 205, 19);
		contentPane.add(password);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//botão fazendoa conexão com o banco
				
				try {
					Connection con = Conaxao.fa_conexao();
					
					
					// buscanod no banco de  dados
					String sql = "select * from usuarios where SIGLA= ? and SENHA=?";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1,tfUsuario.getText());
					stmt.setString(2,new String( password.getPassword()));
					
				    ResultSet rs = stmt.executeQuery();
if(rs.next()) {
				    	
				    	// mostrando tela princiapl se não tiver erro
				    	Tela_principal  exibir =  new Tela_principal();
				    	exibir.setVisible(true);
				    	setLocationRelativeTo(null);
				    	setVisible(false);
				    
				    }else {
				    	JOptionPane.showMessageDialog(null, "Confirme o login & senha e tente novamnete");
				    }
				    stmt.close();
				    con.close();		


					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}
		});
		btnEntrar.setBounds(223, 249, 111, 41);
		contentPane.add(btnEntrar);
	}
}
