
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int qtdPessoas = 1;
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else if(qtdPessoas >=2) { 
			System.out.println("Você é menor de idade, mas está acompanhado!");
		} else { 
			System.out.println("Você é menor de idade!");
		}
	}
}
