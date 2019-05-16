
public class TestaBanco {
	public static void main(String[] args) {
		Cliente willian = new Cliente();
		willian.nome = "Willian Pires Nunes";
		willian.cpf = "387.762.218-65";
		willian.profissao = "Analista de Sistemas";
		
		Conta contaDoWillian = new Conta();
		contaDoWillian.deposita(100);
		
		contaDoWillian.titular = willian;
		
	}

}
