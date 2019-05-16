package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {

		br.com.bytebank.banco.modelo.ContaCorrente cc = new br.com.bytebank.banco.modelo.ContaCorrente(222, 333);
		cc.deposita(100);

		SeguroDeVida sd = new SeguroDeVida();

		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(sd);

		System.out.println(calc.getTotalDeImposto());

	}

}
