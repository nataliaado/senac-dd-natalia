package exercicio4.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JInternalFrame {
	
	private JTextField txtNome;
	private JTextField txtCep;
	private JTextField txtDataNascimento;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setBounds(100, 100, 350, 376);
		getContentPane().setLayout(null);
		
		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCadastroDeCliente.setBounds(12, 13, 214, 29);
		getContentPane().add(lblCadastroDeCliente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(22, 67, 56, 16);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(32, 88, 278, 22);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCep.setBounds(22, 134, 56, 16);
		getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(32, 163, 278, 22);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento:");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataNascimento.setBounds(12, 212, 135, 16);
		getContentPane().add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(32, 241, 278, 22);
		getContentPane().add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalvar.setBounds(32, 295, 278, 25);
		getContentPane().add(btnSalvar);

	}
}
