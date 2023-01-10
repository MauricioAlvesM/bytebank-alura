
public class TestaReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo );
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda: " + segundaConta.saldo );
		
		if ( segundaConta == primeiraConta) {
			System.out.println("Sao as mesmas contas");
		}
		
		
		
	}
	

}