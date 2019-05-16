package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsulficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(500);
		try {
			conta.saca(500.80);
		} catch (SaldoInsulficienteException ex) {

			System.out.println("Ex: " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}
}