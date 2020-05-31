
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = false;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");

		} else {
			System.out.println("Infelizmente nao pode entrar");
		}

	}
}
