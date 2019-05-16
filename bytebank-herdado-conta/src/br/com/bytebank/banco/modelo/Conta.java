package br.com.bytebank.banco.modelo;

public abstract class Conta {
	private static int total;
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

//iniciando um construtor:
	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia Invalida");
		}
		if (numero < 1) {
			throw new IllegalArgumentException("Conta Invalida");
		}
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;

		// System.out.println("Estou criando uma conta : "+ this.numero);
	}

	public void saca(double valor) throws SaldoInsulficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsulficienteException("Saldo " + this.saldo + ", Valor" + valor);

		}

		this.saldo -= valor;

	}

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsulficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia;
				
	}
}