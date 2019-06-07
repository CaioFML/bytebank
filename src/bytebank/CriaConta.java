package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(100.0, 111, 1, "Caio");
		System.out.println(primeiraConta.getSaldo());
		conta1.deposita(500);
		System.out.println(primeiraConta.getSaldo());
		
		Conta conta2 = new Conta(100, 110, 2, "Rebeca");
		conta2.deposita(200);
		conta2.saca(10);
		
		conta1.transfere(200, conta2);
		System.out.println(conta2.getSaldo());
	}

}
