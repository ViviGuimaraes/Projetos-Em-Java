package br.sp.senai.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FrameCadastroContato extends JFrame {

	private JPanel contentPane;
	private JTextField textnome;
	private JTextField textteefone;
	private JTextField textemail;
	private JTextField textdata;
	private final ButtonGroup buttonGroupsOpicoes = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroContato frame = new FrameCadastroContato();
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
	public FrameCadastroContato() {
		setTitle("   Meus Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 585);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalver = new JButton("Salvar Contato");
		btnSalver.setBackground(new Color(216, 191, 216));
		btnSalver.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		btnSalver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(" cliquei no botão !! ");
			}
		});
		btnSalver.setBounds(106, 475, 176, 46);
		contentPane.add(btnSalver);
		
		JLabel lblNome = new JLabel("Nome :  ");
		lblNome.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		lblNome.setBounds(20, 88, 66, 14);
		contentPane.add(lblNome);
		
		textnome = new JTextField();
		textnome.setBounds(20, 113, 371, 20);
		contentPane.add(textnome);
		textnome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail : ");
		lblEmail.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		lblEmail.setBounds(20, 158, 75, 14);
		contentPane.add(lblEmail);
		
		textemail = new JTextField();
		textemail.setColumns(10);
		textemail.setBounds(20, 183, 371, 20);
		contentPane.add(textemail);
		
		JLabel lblTelefone = new JLabel("Telefone :  ");
		lblTelefone.setBackground(new Color(0, 0, 128));
		lblTelefone.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		lblTelefone.setBounds(20, 240, 103, 14);
		contentPane.add(lblTelefone);
		
		textteefone = new JTextField();
		textteefone.setColumns(10);
		textteefone.setBounds(20, 265, 185, 20);
		contentPane.add(textteefone);
		
		
		JLabel lblCidade = new JLabel("Cidade : ");
		lblCidade.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		lblCidade.setBounds(256, 240, 103, 14);
		contentPane.add(lblCidade);
		
		JComboBox combocidades = new JComboBox();
		combocidades.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		combocidades.setModel(new DefaultComboBoxModel(new String[] {"Barueri", "Carapicu\u00EDba", "Itapevi ", "Osasco "}));
		combocidades.setToolTipText("");
		combocidades.setBounds(256, 263, 135, 22);
		contentPane.add(combocidades);
		
		JLabel lblSexo = new JLabel("Sexo : ");
		lblSexo.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		lblSexo.setBounds(20, 315, 88, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtSexoMasc = new JRadioButton("Mas");
		buttonGroupsOpicoes.add(rdbtSexoMasc);
		rdbtSexoMasc.setFont(new Font("Proxy 8", Font.BOLD | Font.ITALIC, 14));
		rdbtSexoMasc.setBounds(20, 333, 66, 23);
		contentPane.add(rdbtSexoMasc);
		
		JRadioButton rdbtSexoFem = new JRadioButton("Fem");
		buttonGroupsOpicoes.add(rdbtSexoFem);
		rdbtSexoFem.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		rdbtSexoFem.setBounds(103, 333, 75, 23);
		contentPane.add(rdbtSexoFem);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento : ");
		lblDataNascimento.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 14));
		lblDataNascimento.setBounds(20, 386, 201, 14);
		contentPane.add(lblDataNascimento);
		
		textdata = new JTextField();
		textdata.setColumns(10);
		textdata.setBounds(20, 411, 135, 20);
		contentPane.add(textdata);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 418, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblimagem = new JLabel("");
		lblimagem.setBounds(352, 11, 39, 55);
		panel.add(lblimagem);
		lblimagem.setIcon(new ImageIcon(FrameCadastroContato.class.getResource("/imagens/livros-de-contato.png")));
		
		JLabel lblNewLabel = new JLabel("Contatos  !");
		lblNewLabel.setBackground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Proxy 9", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(23, 11, 237, 55);
		panel.add(lblNewLabel);
		
	}
}
