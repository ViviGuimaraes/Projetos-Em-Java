package br.sp.senai.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import br.sp.senai.jandira.model.Periodo;
import javax.swing.JList;

public class CadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAlunos frame = new CadastroAlunos();
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
	public CadastroAlunos() {
		setTitle("Cadastro de alunos ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula : ");
		lblMatricula.setBounds(21, 89, 84, 21);
		lblMatricula.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		contentPane.add(lblMatricula);
		
		JLabel lblNome = new JLabel("Nome : ");
		lblNome.setBounds(21, 162, 84, 21);
		lblNome.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		contentPane.add(lblNome);
		
		JLabel lblPeriodo = new JLabel("Par\u00EDodo : ");
		lblPeriodo.setBounds(21, 243, 84, 21);
		lblPeriodo.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		contentPane.add(lblPeriodo);
		
		JLabel lblListaDeAlunos = new JLabel("Lista de Alunos : ");
		lblListaDeAlunos.setBounds(372, 46, 149, 21);
		lblListaDeAlunos.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		contentPane.add(lblListaDeAlunos);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(118, 88, 165, 27);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(118, 161, 227, 27);
		textNome.setColumns(10);
		contentPane.add(textNome);
		
		JComboBox comboPeriodo = new JComboBox();
		comboPeriodo.setBounds(118, 244, 124, 22);
		comboPeriodo.setModel(new DefaultComboBoxModel(Periodo.values()));
		contentPane.add(comboPeriodo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(355, 71, 210, 404);
		contentPane.add(scrollPane);
	}
}
