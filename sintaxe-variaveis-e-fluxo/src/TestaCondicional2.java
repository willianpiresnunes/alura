
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 19;
		int quantidadedePessoas = 3;
		boolean acompanhado = quantidadedePessoas >= 2;
		
		System.out.println("O valor de Acompanhado � " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");

		}

	}

}