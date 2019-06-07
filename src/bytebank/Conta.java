package bytebank;

public class Conta extends Cliente {
	private double saldo;
	private int agencia, numero;
	private Cliente titular;
	private static int total;
	
	public Conta(double saldo, int agencia, int numero, String string) {
		total++;
		System.out.println("O total de contas é:" + total);
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = string;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			return true;
		}else{
			System.out.println("Você não tem saldo suficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("Não há dinheiro suficiente para transferir");
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode ser um número menor do que 0!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode ser um número menor do que 0!");
			return;
		}
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
}
