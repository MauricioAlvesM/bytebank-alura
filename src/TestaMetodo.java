
public class TestaMetodo {

	public static void main(String[] args) {
		 Conta contaPaulo = new Conta();
		 contaPaulo.saldo = 100;
		 
		 contaPaulo.deposita(600);
		 System.out.println(contaPaulo.saldo);
		 
		 contaPaulo.saca(150);
		 System.out.println(contaPaulo.saldo);
		 
		 Conta contaMarcela = new Conta();
		 contaMarcela.deposita(1000);
		 System.out.println("Conta "
		 		+ "da Marcela: " + contaMarcela.saldo);
		 
		 contaMarcela.transfere(500, contaPaulo);
		 System.out.println(contaMarcela.saldo);
		 System.out.println(contaPaulo.saldo);
		 
		 contaPaulo.titular = "Paulo Silveira";
		 System.out.println("Nome do titular: " + contaPaulo.titular);
		 
	}
}