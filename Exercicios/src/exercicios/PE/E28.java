package exercicios.PE;

import java.util.Scanner;

public class E28 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para uma empresa que decide dar um reajuste a
		 * seus 5 funcionários de acordo com os seguintes critérios:
		 * 
		 * - a. 50% para aqueles que ganham menos do que três salários mínimos;
		 * - b. 20% para aqueles que ganham entre três até dez salários mínimos;
		 * - c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
		 * - d. 10% para os demais funcionários.
		 * 
		 * Leia o nome do funcionário, seu salário e o valor do salário mínimo.
		 * Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o
		 * reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua
		 * folha de pagamento.
		 */

		Scanner scanner = new Scanner(System.in);

		int quantidadeFuncionarios = 5;

		System.out.print("Digite o valor do sálario minímo: ");
		float salarioMinimo = scanner.nextFloat();
		float aumentoFolhaPagamento = 0;

		for (int i = 0; i < quantidadeFuncionarios; i += 1) {
			System.out.println("\nDados do funcionário " + (i + 1) + ":");

			System.out.print("Nome: ");
			String nome = scanner.next();

			System.out.print("Salário: ");
			float salario = scanner.nextFloat();

			float reajuste;

			if (salario < 3 * salarioMinimo) {
				reajuste = salario * 0.5f;
			} else if (salario <= 10 * salarioMinimo) {
				reajuste = salario * 0.2f;
			} else if (salario <= 20 * salarioMinimo) {
				reajuste = salario * 0.15f;
			} else {
				reajuste = salario * 0.1f;
			}

			float novoSalario = salario + reajuste;
			aumentoFolhaPagamento += reajuste;

			System.out.println("\nNome: " + nome);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo Salário: " + novoSalario);
		}

		System.out.println(
				"\nA empresa aumentará a folha em R$ " + aumentoFolhaPagamento);

		scanner.close();
	}
}
