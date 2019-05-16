
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 18;
		int quantidadedePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja Bem Vindo!");
		} 
		else {
			if (quantidadedePessoas >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar, pois está acompanhado.");
			}
			else
			System.out.println("Infelizmente voce nao pode entrar");
			
		}
		
	}
}
