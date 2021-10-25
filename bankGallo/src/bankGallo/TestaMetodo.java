package bankGallo;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRenato = new Conta();
			contaDoRenato.saldo = 100;
			contaDoRenato.deposita(50);
		System.out.println(contaDoRenato.saldo);
		
		contaDoRenato.saca(30);
		System.out.println(contaDoRenato.saldo);
		
		Conta contaDaMarcela =new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoRenato)) {
			System.out.println("Transferencia com sucesso!");
		}else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoRenato.saldo);
		
	}
	
	
}
