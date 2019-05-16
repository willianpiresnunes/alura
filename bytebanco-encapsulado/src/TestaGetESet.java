
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1226, 1005049);
		
		
		System.out.println("O número da agencia é: " + conta.getAgencia() +'\n'+ "O numero da Conta é: " + conta.getNumero());
		
		Cliente Willian = new Cliente();
		conta.setTitular(Willian);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		
		
		
		
		/*Willian.setNome("Willian Pires Nunes");
		Willian.setCpf("387.762.218-65");
		Willian.setProfissao("Analista de Sistemas");
		
		System.out.println(Willian.getNome() +'\n'+ Willian.getCpf() +'\n'+ Willian.getProfissao());*/
		
		
	}
}
