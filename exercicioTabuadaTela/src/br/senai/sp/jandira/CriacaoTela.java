package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CriacaoTela {
	
	CriacaoTabuada tabuada = new CriacaoTabuada ();
	
	
	public void criarTela () {
		// fonte do projeto 
		Font fonttitulo =new Font("Arial", Font.BOLD, 40);
		Font fontlabel =new Font("Arial", Font.PLAIN, 20);
		
		
		JFrame tabuada = new JFrame();

		tabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabuada.setSize(600, 800);
		tabuada.setTitle(" - Tabuada  ");
		tabuada.setLayout(null);
		
		JPanel jpPainel =  new JPanel();
		jpPainel.setBounds(0, 0, 600, 150);
		jpPainel.setBackground(Color.white);
		jpPainel.setLayout(null);
		
		//ImageIcon icone = new ImageIcon(" br.senai.sp.jandira.imagens "); 
		
		//JLabel lblicone = new JLabel ("");
		//lblicone.setIcon(icone);
		
		JLabel lblTitulo = new JLabel (" Tabuada ");
		lblTitulo.setBounds(10, 30, 300, 30);
		lblTitulo.setFont(fonttitulo);
		lblTitulo.setForeground(Color.BLUE);
		
	
		// Forma de colocar objetos dentro do painel 
		jpPainel.add(lblTitulo);
		
		
		JPanel jpPainelFormulario =  new JPanel();
		jpPainelFormulario.setLayout(null);
		jpPainelFormulario.setBounds(20, 160, 600, 400);
		
		
		
		JLabel lblMultiplicando = new JLabel (" Multiplicando : ");
		lblMultiplicando.setBounds(20, 150, 200, 30);
		lblMultiplicando.setFont(fontlabel);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		jpPainelFormulario.add(lblMultiplicando);

		
		
		JLabel lblMultiplicador = new JLabel (" Máximo  Multiplicador : ");
		lblMultiplicador.setBounds(20, 190, 200, 30);
		lblMultiplicador.setFont(fontlabel);
		lblMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		jpPainelFormulario.add(lblMultiplicador);
		
		JTextField txtMultiplicando = new JTextField ();
		txtMultiplicando.setBounds(225, 150, 250, 30);
		jpPainelFormulario.add(txtMultiplicando);
		
		JTextField txtMultiplicador = new JTextField ();
		txtMultiplicador.setBounds(225, 190, 250, 30);
		jpPainelFormulario.add(txtMultiplicador);
		
		JButton btnCalcular = new JButton(" Calcular ");
		btnCalcular.setBounds(20, 255, 450, 40);
		jpPainelFormulario.add(btnCalcular);
		
		JButton btnLimpar = new JButton(" Limpar ");
		btnLimpar.setBounds(20, 300, 450, 40);
		jpPainelFormulario.add(btnLimpar);
		
		JLabel lblResultado = new JLabel (" Resultado: ");
		lblResultado.setBounds(640, 165, 300, 20);
		lblResultado.setFont(fonttitulo);
		lblResultado.setForeground(Color.BLUE);
		
		JScrollPane scroll = new JScrollPane ();
		scroll.setBounds(640, 180, 400, 400);
		
		JList ListaTabuada = new JList ();
		scroll.getViewport().add(ListaTabuada);
		
		DefaultListModel tabuadaModel = new DefaultListModel();
		ListaTabuada.setModel(tabuadaModel);
		
		
		
		// Para tornas as coisas da tela visível
		tabuada.getContentPane().add(jpPainel);
		tabuada.getContentPane().add(jpPainelFormulario);
		tabuada.getContentPane().add(lblResultado);
		tabuada.getContentPane().add(scroll);
		//tabuada.getContentPane().add(lblicone);
		
		// Para tornar a tela visível
				tabuada.setVisible(true);
				
				btnCalcular.addActionListener(new );
	}
}
