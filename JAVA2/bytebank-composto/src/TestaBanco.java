
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
	paulo.nome = "Paulo Andrade";
	paulo.cpf = "222.222.222-22";
	paulo.profissão = "programador";
	
	Conta contaDoPaulo = new Conta();
	contaDoPaulo.deposita(100);
	
	contaDoPaulo.titular = paulo;
	
	System.out.println(contaDoPaulo.titular.nome);
	System.out.println(contaDoPaulo.titular);
	}
	
}
