
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condionais");
		int idade = 12;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você pode entrar, está acompanhado");
			} else {
				System.out.println("Infelizmente nao pode entrar");
			}
		}
	}

}
