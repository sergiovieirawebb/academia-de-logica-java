package exercicios.POO.E01;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Sérgio", "10/08/1982", 1.85f);

		pessoa.imprimirDados();
		
		System.out.println(pessoa.getDataNascimento());
	}
}
