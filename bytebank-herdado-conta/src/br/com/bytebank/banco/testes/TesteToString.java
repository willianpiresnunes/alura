package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToString {

	public static void main(String[] args) {

		Object cc = new ContaCorrente(1, 2);
		Object cp = new ContaPoupanca(1, 3);

		
		System.out.println(cc);
		System.out.println(cp);
	}

}
