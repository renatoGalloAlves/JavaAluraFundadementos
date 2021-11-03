
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1111, 2653562-3);
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		
		paulo.setNome("Paulo Silveira"); 
		System.out.println("Nome do titular: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Progamador");
		System.out.println("Profisão do titular: " + conta.getTitular().getProfissao());		
		
	}

}
