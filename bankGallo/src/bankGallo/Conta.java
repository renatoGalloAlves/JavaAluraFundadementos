package bankGallo;

public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;
	int cpf;

	public void deposita(double valor) {

		this.saldo = this.saldo  + valor;

	}
}
