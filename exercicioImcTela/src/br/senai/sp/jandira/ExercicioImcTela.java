package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExercicioImcTela {

	private double peso;
	private double altura;

	public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setAltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}

	public double getAltura() {
		return altura;
	}

	public double calcularImc() {
		// comamdo Math.pow é para calcular altura vezes altura do IMC
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public String mostrarImcString() {
		return String.valueOf(calcularImc());
	}
	
	public String mostrarStatusImac () {
		if (calcularImc() < 18.5) {
			return " Abaixo do Peso ! ";
		} else if (calcularImc() >= 18.5 && calcularImc() < 25) {
			return " Peso ideal - Parabéns ! ";
			
		} else if (calcularImc() >= 25 && calcularImc() <30) {
			return " Levemente acima do peso ! ";
			
		} else if (calcularImc() >= 30 && calcularImc() < 35) {
			return " Obesidade grau 1 ! ";
			
		} else if (calcularImc() >= 35 && calcularImc() < 40) {
			return " Obesidade grau 2 ! ";
		
		}else {
				return " Obesidade grau 3 ! ";
			}
		}
		
	// ------------------- criação da tela  -----------------------------------------------------------------------------------		

	public void criarTela() {
		
		// Criação de fontes das minhas letras na tela 
		Font fontTitulo = new Font ("Book Antiqua", Font.BOLD, 22);
		Font fontTexto = new Font ("Book Antiqua", Font.PLAIN, 15);
		Font fontResultado = new Font ("Book Antiqua", Font.BOLD, 15);
		
		// Criação da cores das fontes 
		Color azul = new Color(53, 75, 143);
		Color verde = new Color(55, 145, 84);
		
		
		JFrame imc = new JFrame();

		imc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imc.setSize(500, 800);
		imc.setTitle(" Calcule o IMC  ");
		imc.setLayout(null);

		JLabel lblTitulo = new JLabel();
		lblTitulo.setText(" Cáculo de IMC  ");
		lblTitulo.setBounds(50, 5, 200, 50);
		lblTitulo.setFont(fontTitulo);
		lblTitulo.setForeground(azul);

		// Parte programada para o Peso
		JLabel lblPeso = new JLabel();
		lblPeso.setText(" Seu peso : ");
		lblPeso.setBounds(50, 70, 100, 30);
		lblPeso.setFont(fontTexto);

		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(140, 70, 100, 30);

		// Parte programada para a altura

		JLabel lblAltura = new JLabel();
		lblAltura.setText(" Sua altura : ");
		lblAltura.setBounds(50, 120, 100, 30);
		lblAltura.setFont(fontTexto);

		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(140, 120, 100, 30);

		// para criar o Botão calcular
		JButton btnCalcular = new JButton();
		btnCalcular.setText(" Calcular ");
		btnCalcular.setBounds(70, 180, 220, 40);
		btnCalcular.setFont(fontTexto);
		btnCalcular.setForeground(azul);

		

		JLabel lblResultado = new JLabel();
		lblResultado.setText(" Resultado : ");
		lblResultado.setBounds(50, 280, 250, 30);
		lblResultado.setFont(fontResultado);

		
		JLabel lblvalorImc = new JLabel();
		lblvalorImc.setText(" Valor do IMC : ");
		lblvalorImc.setBounds(50, 320, 250, 30);
		lblvalorImc.setFont(fontTexto);
		
		JLabel lblMostrarValor = new JLabel();
		lblMostrarValor.setBounds(200, 320, 250, 30);
		lblMostrarValor.setFont(fontResultado);
		lblMostrarValor.setForeground(verde);
		
		JLabel lblstatus = new JLabel();
		lblstatus.setText(" Status do IMC : ");
		lblstatus.setBounds(50, 360, 250, 30);
		lblstatus.setFont(fontTexto);
		
		JLabel lblMostrarStatus = new JLabel();
		lblMostrarStatus.setBounds(200, 360, 250, 30);
		lblMostrarStatus.setFont(fontResultado);
		lblMostrarStatus.setForeground(verde);
		
		

		// Para tornar as coisas visíveis na tela
		imc.getContentPane().add(lblTitulo);
		imc.getContentPane().add(lblPeso);
		imc.getContentPane().add(txtPeso);
		imc.getContentPane().add(lblAltura);
		imc.getContentPane().add(txtAltura);
		imc.getContentPane().add(btnCalcular);
		imc.getContentPane().add(lblResultado);
		imc.getContentPane().add(lblvalorImc);
		imc.getContentPane().add(lblstatus);
		imc.getContentPane().add(lblMostrarValor);
		imc.getContentPane().add(lblMostrarStatus);


		// Para tornar a tela visível
		imc.setVisible(true);
		
		//calculo que vai estar no botão 
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 
				ExercicioImcTela imc = new ExercicioImcTela();
				
				imc.setPeso(txtPeso.getText());
				imc.setAltura(txtAltura.getText());
				
				lblMostrarValor.setText(imc.mostrarStatusImac());
				lblMostrarStatus.setText(imc.mostrarImcString());
				
				
			}
		} ) ;
			
	
		
	}

}
