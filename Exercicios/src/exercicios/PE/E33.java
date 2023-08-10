package exercicios.PE;

import java.util.Scanner;

public class E33 {

	public static void main(String[] args) {
		/*
		 * A escola “APRENDER” faz o pagamento de seus professores por
		 * hora/aula. Faça um algoritmo que calcule e exiba o salário de um
		 * professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
		 * 
		 * - a. Professor Nível 1 R$12,00 por hora/aula;
		 * - b. Professor Nível 2 R$17,00 por hora/aula;
		 * - c. Professor Nível 3 R$25,00 por hora/aula.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de horas/aula ministradas: ");
		float horasAula = scanner.nextFloat();
		
		System.out.print("Digite o nível do professor (1, 2 ou 3): ");
		char nivel = scanner.next().charAt(0);
		
		float valorHoraAula = 0.0f;
		switch (nivel) {
			case '1' :
				valorHoraAula = 12.0f;
				break;
				
			case '2' :
				valorHoraAula = 17.0f;
				break;
				
			case '3' :
				valorHoraAula = 25.0f;
				break;

			default :
				System.out.println("Nível de professor inválido.");
				System.exit(1);
		}
		
		float salario = valorHoraAula * horasAula; 
		System.out.println("O salário do professor é R$ " + salario);
		
		scanner.close();
	}
}
