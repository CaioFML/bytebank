package bytebank;

public class Conta {
	double saldo;
	int agencia, numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			return true;
		}else{
			System.out.println("Voc� n�o tem saldo suficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("N�o h� dinheiro suficiente para transferir");
			return false;
		}
	}
}
