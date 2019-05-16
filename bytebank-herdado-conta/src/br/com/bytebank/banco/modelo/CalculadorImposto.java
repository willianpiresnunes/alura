package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	
	private double totalDeImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalDeImposto += valor;
	}
	public double getTotalDeImposto() {
		return totalDeImposto;
	}
}
