package bankGallo;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 250;
		
		System.out.println("A Primeira conta tem R$ " + primeiraConta.saldo + ".");
		System.out.println("A Segunda conta tem R$ " + segundaConta.saldo + ".");
		System.out.println("A Terceira conta tem R$ " + terceiraConta.saldo + ".");

	}

}
