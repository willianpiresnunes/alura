
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Willian Pires Nunes");
		g1.setCpf("387.762.218-65");
		g1.setSalario(5000.00);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(654);
		boolean autenticou = g1.autentica(654);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao()	);
	}
}
