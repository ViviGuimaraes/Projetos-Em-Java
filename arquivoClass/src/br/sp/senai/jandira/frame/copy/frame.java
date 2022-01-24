package br.sp.senai.jandira.frame.copy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.sp.senai.jandira.Arquivo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class frame extends JFrame {

	private JPanel contentPane;
	private Arquivo arquivo = null;
	private String caminho = "C:\\Users\\21276441\\Desktop\\teste\\aula.txt";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frame() {
		//
		this.arquivo = new Arquivo();

		setBackground(new Color(0, 0, 0));
		setTitle("Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 813);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setForeground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblArquivo = new JLabel("Arquivo ");
		lblArquivo.setForeground(new Color(255, 255, 255));
		lblArquivo.setFont(new Font("Bodoni MT", Font.PLAIN, 40));
		lblArquivo.setBounds(24, 21, 184, 34);
		contentPane.add(lblArquivo);

		JLabel lblTexto = new JLabel("Texto : ");
		lblTexto.setForeground(new Color(255, 255, 255));
		lblTexto.setFont(new Font("Bodoni MT", Font.PLAIN, 40));
		lblTexto.setBounds(73, 116, 176, 34);
		contentPane.add(lblTexto);

		JTextPane textTexto = new JTextPane();
		textTexto.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textTexto.setBounds(83, 161, 391, 503);
		contentPane.add(textTexto);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(86, 165, 378, 499);
		contentPane.add(scrollBar);

		// botão + um método com a ação de gravar o conteúdo após ser apertado o botão.
		JButton btnGravar = new JButton("Gravar ");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String textoArquivo = arquivo.ler(caminho);
				String texto = textoArquivo + textTexto.getText();

				if (arquivo.escrever(caminho, texto)) {
					// mensagem de sucesso
					JOptionPane.showMessageDialog(null, "Dados gravado com sucesso", "GRAVAÇÃO",
							JOptionPane.INFORMATION_MESSAGE);
					textTexto.setText("");
				} else {
					// mensagem de erro
					JOptionPane.showMessageDialog(null, "Erro ao gravar dados", "GRAVAÇÃO",
							JOptionPane.INFORMATION_MESSAGE);
					textTexto.setText("");
				}
			}
		});
		btnGravar.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		btnGravar.setBounds(56, 689, 138, 45);
		contentPane.add(btnGravar);

		// botão + um método com a ação de limpar o conteúdo após ser apertado o botão.
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//comando para limpar  a tela 
				textTexto.setText("");
			}
		});
		btnLimpar.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		btnLimpar.setBounds(204, 689, 138, 45);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair ");
		btnSair.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		btnSair.setBounds(352, 689, 138, 45);
		contentPane.add(btnSair);
		//comando para promover ação do botão
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//comando  para sair 
				System.exit(0);
			}
		});
		

	}
}
