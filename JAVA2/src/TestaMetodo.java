
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Faltou Dinheiro!");
		}

		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
		
		contaDoPaulo.titular = "paulo andrade";
		System.out.println(contaDoPaulo.titular);

	}

}
