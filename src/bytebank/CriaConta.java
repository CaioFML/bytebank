package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.deposita(500);
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(200);
		segundaConta.saca(10);
		
		primeiraConta.transfere(200, segundaConta);
		System.out.println(segundaConta.saldo);
	}

}
