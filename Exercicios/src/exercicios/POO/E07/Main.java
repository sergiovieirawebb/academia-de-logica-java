package exercicios.POO.E07;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Sérgio", "Vieira", 1320.56);
		Funcionario funcionario2 = new Funcionario("Ronaldo", "Santos", -100.0);
		
		funcionario1.imprimirDados();
		funcionario2.imprimirDados();
		
		funcionario1.aplicarAumento();
		funcionario1.imprimirDados();
		
		funcionario2.aplicarAumento();
		funcionario2.imprimirDados();
		
		Funcionario.getQuantidadeFuncionarios();
	}
}
