package exercicios.POO.E07;

public class Funcionario {
	/*
	 * A fim de representar funcionários em uma empresa, crie uma classe chamada
	 * Funcionario que inclui as três informações a seguir como atributos:
	 * 
	 * - a. um primeiro nome
	 * - b. um sobrenome
	 * - c. um salário mensal
	 * 
	 * Sua classe deve ter um construtor que inicializa os três atributos. Forneça
	 * os métodos getters e setters para cada atributo. Se o salário mensal não for
	 * positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra
	 * as capacidades da classe. Crie duas instâncias da classe e exiba o salário
	 * anual de cada instância. Então dê a cada empregado um aumento de 10% e exiba
	 * novamente o salário anual de cada empregado. Introduza na classe Funcionario
	 * uma variável de classe capaz de contabilizar o numero de funcionarios que
	 * passaram pela empresa até a data.
	 */

	private String nome;
	private String sobrenome;
	private double salarioMensal;
	private static int quantidadeFuncionarios = 0;

	public Funcionario(String nome, String sobrenome, double salarioMensal) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setSalarioMensal(salarioMensal);
		Funcionario.quantidadeFuncionarios += 1;
	}

	public void aplicarAumento() {
		double aumentoDezPorCento = 1.10;
		this.salarioMensal *= aumentoDezPorCento;
	}

	public double calcularSalarioAnual() {
		int dozeMeses = 12;
		return salarioMensal * dozeMeses;
	}

	public void imprimirDados() {
		System.out.println("Funcionário: " + getNome() + " " + getSobrenome());
		System.out.println("Salário mensal: R$ " + String.format("%.2f", getSalarioMensal()));
		System.out.println("Salário anual: R$ " + String.format("%.2f", calcularSalarioAnual()));
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal < 0 ? 0.0 : salarioMensal;
	}

	public static void getQuantidadeFuncionarios() {
		System.out.println("Quantidade de funcionários na empresa: " + quantidadeFuncionarios);
	}
}
