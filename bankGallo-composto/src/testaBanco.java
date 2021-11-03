
public class testaBanco {
	
	public static void main(String[] args) {
		Cliente renato= new Cliente();
		renato.nome= " Renato Alves";
		renato.cpf = "111.222.333.66";
		renato.profissao = "cozinheiro";
		
		Conta contaDoRenato= new Conta();
		contaDoRenato.deposita(100);
		
		contaDoRenato.titular = renato;
		System.out.println(contaDoRenato.titular.nome);
		
		
	}

}
