package model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	// Atributos da classe Conta.Java
	private String agencia;
	private double saldo;
	private TipoConta tipoConta;
	private String numero;
	public cliente titular;

	// construtores da classe conta
	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	// método set + ENUM
	public void setTipo(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public TipoConta getTipo() {
		return tipoConta;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getagencia() {
		return agencia;
	}

	// Métodos da classe Conta.Java
	public void depositar(double valorDeposito) {
		if (valorDeposito < 0) {
			System.out.println(" Não foi possivel efetuar o depósito, tente outro valor. ");
		} else {
			saldo = saldo + valorDeposito;
		}
	}

	// método boolean para ober um retorno da classe Banco.java
	public boolean sacar(double valorSaque) {
		if (valorSaque < 0 || valorSaque > saldo) {
			System.out.println(" Não foi possível sacar ! ");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}
	}

	public void tranferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);

		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println(" Não foi possível realizar a transferência. ");
		}
	}

	public void exibirDetalhes() {
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.printf(" Titular : %s\n", titular);
		System.out.printf(" Número  : %s\n", numero);
		System.out.printf(" Agência  : %s\n", agencia);
		System.out.printf(" Tipo de Conta : %s\n", tipoConta);
		System.out.printf(" Saldo  : %s\n", saldo);
	}
}
