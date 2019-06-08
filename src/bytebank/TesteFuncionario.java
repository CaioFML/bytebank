package bytebank;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario caio = new Gerente("Caio", "12415151", 3000.0, 123);
		
		System.out.println("Salario é:" + caio.getBonificacao());
	}
}
