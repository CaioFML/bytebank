package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.setSaldo(300);
		
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
	}
}
