
public class TesteIR {

	public static void main(String[] args) {

		double salario = 500.0;
		String texto1 = "O IR � de 7,5% e epode deduzir na declara��o o valor de R$ 142";
		String texto2 = "O IR � de 15% e pode deduzir R$ 350";
		String texto3 = "O IR � de 22.5% e pode deduzir R$ 636";

		System.out.println("Teste IR");

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Seu sal�rio esta entre R$1900,00 e R$ 2800,00." + '\n' + "Logo " + texto1);
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println(texto2);
			} else {
				if (salario < 1899.0) {
					System.out.println("Seu sal�rio esta abaixo de 1900.0, voc� n�o paga IR");
				} else
					System.out.println(texto3);
			}

		}
	}

}
