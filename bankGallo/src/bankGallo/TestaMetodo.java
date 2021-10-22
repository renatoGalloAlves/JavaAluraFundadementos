package bankGallo;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRenato = new Conta();
		contaDoRenato.saldo = 100;
		contaDoRenato.deposita(50);
		System.out.println(contaDoRenato.saldo);
	}

}
