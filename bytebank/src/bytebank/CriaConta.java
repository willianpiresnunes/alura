package bytebank;

public class CriaConta {
	public static void main(String[] args) {

		Conta contaDoWilian = new Conta();
		contaDoWilian.saldo = 200.0;
		
		System.out.println("O saldo da conta do Willian é: R$" + contaDoWilian.saldo);
		
		Conta contaDaSabrina = new Conta ();
		contaDaSabrina.saldo = 300.0;
		
		System.out.println("O saldo da conta da Sabrina é: R$" + contaDaSabrina.saldo);
		
		if(contaDaSabrina.saca(100));
		System.out.println("saque realizado com sucesso");
		
		System.out.println("O saldo da conta da Sabrina é: R$" + contaDaSabrina.saldo);

		contaDoWilian.deposita(1000);
		
		System.out.println("O saldo da conta do Willian é: R$" + contaDoWilian.saldo);
		
		contaDaSabrina.deposita(3000);
		
		System.out.println("O saldo da conta da Sabrina é: R$" + contaDaSabrina.saldo);

		
	}
}
