package br.senai.arquivo.araylist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCidade;
	
	/***** ATRIBUTOS REFERENTES A CRIAÇÃO/GRAVAÇAO DE CONTATOS *****/
	//Contato objContato = null;
	//DadosContato objDadosContato = null;
	Arquivo objArquivo = null;
	String texto = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		
		//objContato = new Contato();
//		objDadosContato = new DadosContato();
		objArquivo = new Arquivo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE CONTATOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 11, 249, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(36, 62, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-MAIL:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(36, 105, 90, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TELEFONE:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(36, 154, 90, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CIDADE:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(36, 208, 90, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNome = new JTextField();
		txtNome.setBounds(136, 61, 300, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(136, 104, 300, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(136, 153, 300, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(136, 207, 300, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Contato objContato = new Contato();
				DadosContato objDadosContato = new DadosContato();
				
				/***** AÇÃO DO BOTÃO CADASTRAR *****/
				
				/***** CAPTURA DOS DADOS PARA O OBJETO DE CONTATO *****/
				objContato.setNome(txtNome.getText());
				objContato.setEmail(txtEmail.getText());
				objContato.setTelefone(txtTelefone.getText());
				objContato.setCidade(txtCidade.getText());
				
				/***** PREPARAÇÃO DOS DADOS PARA A GRAVAÇÃO NO ARQUIVO TXT *****/
//				String texto = objContato.getNome() + ";" +
//						       objContato.getEmail() + ";" +
//						       objContato.getTelefone() + ";" +
//						       objContato.getCidade() + "\n";
				
				/***** GRAVAÇÃO DOS DADOS NO ARQUIVO TXT *****/
				String caminho = "C:\\Users\\sn1071423\\Desktop\\CONTATO\\contatos.txt";
				
				/**** TESTE DE LEITURA DE ARQUIVO TXT *****/
				objDadosContato = objArquivo.ler(caminho);
				
				/*GRAVAÇÃO*/
				objDadosContato.cadastrarContato(objContato);
				
				System.out.println(objDadosContato.listarContatos());
				
				/*LEITURA*/
				ArrayList<Contato> contatos = objDadosContato.listarContatos();
				
				
				contatos.forEach(contato->{
//					System.out.println("NOME: " + contato.getNome() + 
//				                       " E-MAIL: " + contato.getEmail() +
//							           " TELEFONE: " + contato.getTelefone() +
//				                       " CIDADE: " + contato.getCidade());
					
					texto += contato.getNome() + ";" +
					  		 contato.getEmail() + ";" +
							 contato.getTelefone() + ";" +
							 contato.getCidade() + "\n";
					
				
				});
				
				System.out.println(texto);
				objArquivo.escrever(caminho, texto);
				contatos.clear();	
				objContato = null;
				objDadosContato = null;
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(66, 255, 120, 50);
		contentPane.add(btnNewButton);
	}
}













