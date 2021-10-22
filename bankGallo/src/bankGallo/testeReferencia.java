package bankGallo;

public class testeReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println("A Primeira conta tem de "
				+ "saldo de R$ " + primeiraConta.saldo + ".");
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("A Segunda conta tem de "
				+ "saldo de R$ " + segundaConta.saldo + ".");

		
		segundaConta.saldo +=100;
		
		System.out.println("A Segunda conta tem de "
				+ "saldo de R$ " + segundaConta.saldo + ".");
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta.");
			} else {
				System.out.println("Conta diferente.");
			}
	}

}
