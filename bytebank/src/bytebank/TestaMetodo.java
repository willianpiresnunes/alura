package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		contaDoPedro.saldo = 100;
		
		Conta contaDaKarina = new Conta();
		contaDaKarina.saldo = 200;
		boolean transferenciaComSucesso = contaDaKarina.transfere(10000, contaDoPedro);
		if(transferenciaComSucesso) {
			System.out.println("Transferiu com sucesso para o PP");
		}else {
			System.out.println("Seu saldo não é duficiente.");
		}
		
		
		System.out.println(contaDaKarina.saldo);
		System.out.println(contaDoPedro.saldo);
		
		contaDaKarina.titular = "Karina";
		
		
	}
}
