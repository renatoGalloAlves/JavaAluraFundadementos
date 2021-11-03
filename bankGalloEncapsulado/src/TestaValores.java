
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1111, 2653562-3);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta (1111, 5655565-6);
		Conta conta3 = new Conta (1111, 7878787-6);
		
		System.out.println(Conta.getTotal( ));
		
	}
}
