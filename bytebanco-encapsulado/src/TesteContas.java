
public class TesteContas {
	public static void main(String[] args) {
		Conta conta = new Conta(1226, 1005019);
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(55);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é: " + Conta.getTotal());
		
		Conta conta2 = new Conta(123, 65456546);
		
		System.out.println("O total de contas é: " + Conta.getTotal());

		
	}

}
