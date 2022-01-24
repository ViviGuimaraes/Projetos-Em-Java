package App;

import br.senai.sp.jandira.lista.TipoConta;
import model.Conta;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta contaDaMaria = new Conta("7845-5");

		contaDaMaria.titular = " Maria Antonieta ";
		contaDaMaria.setAgencia("5521-7");
		contaDaMaria.setTipo(TipoConta.CORRENTE);
		contaDaMaria.depositar(2000);

		Conta contaDoPedro = new Conta("8945-5");

		contaDoPedro.titular = " Pedro Vaz ";
		contaDoPedro.setAgencia("5521-7");
		contaDoPedro.setTipo(TipoConta.POUPANCA);
		contaDoPedro.depositar(2000);

		Conta contaDaJulia = new Conta("6290-9");

		contaDaJulia.titular = " Júlia Menezes ";
		contaDaJulia.setAgencia("5521-7");
		contaDaJulia.setTipo(TipoConta.SALARIO);
		contaDaJulia.depositar(2000);

		// ver a conta da Maria, Pedro e Julia

		contaDaMaria.exibirDetalhes();
		contaDoPedro.exibirDetalhes();
		contaDaJulia.exibirDetalhes();

		System.out.println("");

		// depositar 100 reais na conta da Maria
		System.out.println("  _____________ Depósitos: _____________");
		System.out.println("");

		contaDaMaria.depositar(-100);
		contaDaMaria.exibirDetalhes();

		contaDoPedro.depositar(500);
		contaDoPedro.exibirDetalhes();

		contaDaJulia.depositar(1000);
		contaDaJulia.exibirDetalhes();

		System.out.println("");
		System.out.println("  _____________  Saques :  _____________ ");
		System.out.println("");

		contaDaMaria.sacar(12000);
		contaDaMaria.exibirDetalhes();

		System.out.println("");
		System.out.println("  _____________  Tranferência :  _____________");
		System.out.println("");
		// Tranferência de 100 reais da conta do Pedro para a conta da Maria

		contaDoPedro.tranferir(contaDaMaria, 400);
		contaDoPedro.exibirDetalhes();
		contaDaMaria.exibirDetalhes();
	}

}
