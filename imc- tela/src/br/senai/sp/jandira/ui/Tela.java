  package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		

		JFrame telaIMC = new JFrame();
		telaIMC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		// Criar um label
		JLabel lblidade = new JLabel();
		lblidade.setText(" Qual  a sua idade ? ");
		lblidade.setBounds(20, 10, 150, 30);
		
		//Criar um JTextField
		JTextField txtIdade = new JTextField();
		
		txtIdade.setBounds(20, 50, 110, 30);
		


		// criar u botão
		JButton btnVerificar = new JButton();
		btnVerificar.setText(" Verficar idade ");
		
		btnVerificar.setBounds(140, 50, 150, 30);
		
		JLabel lblResultado = new JLabel (" Rsultado da idade ");
		lblResultado.setBounds(20, 80, 245, 30);
		

		// Colocar as coisas visíveis na tela
		telaIMC.getContentPane().add(lblidade);
		telaIMC.getContentPane().add(btnVerificar);
		telaIMC.getContentPane().add(txtIdade);
		telaIMC.getContentPane().add(lblResultado
				);


		telaIMC.setVisible(true);
		
		// Definir ouvinte (listener) de clique 
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" Soltou .. ");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" Apertou  .. ");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" saiu .. ");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" entrou .. ");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		txtIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" Tecla digitou ");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" Tecla liberou ");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(" Tecla apertada ");
				
			}
		});
	}

}
