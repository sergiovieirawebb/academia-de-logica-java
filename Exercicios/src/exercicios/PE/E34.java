package exercicios.PE;

import java.util.Scanner;

public class E34 {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que, dada a idade de um nadador. Classifique-o
		 * em uma das seguintes categorias:
		 * 
		 * - a. Infantil A = 5 - 7 anos;
		 * - b. Infantil B = 8 - 10 anos;
		 * - c. Juvenil A = 11- 13 anos;
		 * - d. Juvenil B = 14 - 17 anos;
		 * - e. Sênior = 18 - 25 anos.
		 * 
		 * Apresentar mensagem “idade fora da faixa etária” quando for outro ano
		 * não contemplado;
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		int idade = scanner.nextInt();

		String categoria = classificarNadador(idade);
		System.out.println("O nadador pertence à categoria: " + categoria);
		
		scanner.close();
	}

	private static String classificarNadador(int idade) {
		if (idade >= 5 && idade <= 7) {
			return "Infantil A";
		} else if (idade >= 8 && idade <= 10) {
			return "Infantil B";
		} else if (idade >= 11 && idade <= 13) {
			return "Juvenil A";
		} else if (idade >= 14 && idade <= 17) {
			return "Juvenil B";
		} else if (idade >= 18 && idade <= 25) {
			return "Sênior";
		} else {
			return "idade fora da faixa etária.";
		}
	}
}
