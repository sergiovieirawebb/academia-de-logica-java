package exercicios.PE;

import java.util.Scanner;

public class E35 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
		 * Sabe-se que o cálculo da conta de luz segue a tabela abaixo.
		 * 
		 * Tipo de Cliente Valor do KW/h:
		 * - 1. (Residência) 0,60;
		 * - 2. (Comércio) 0,48;
		 * - 3. (Indústria) 1,29
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Residência");
		System.out.println("2. Comércio");
		System.out.println("3. Indústria");
		System.out.print("Informe o tipo de cliente (1, 2 ou 3): ");
		String cliente = scanner.next().toLowerCase();
		
		System.out.print("Informe a quantidade de KW consumidade: ");
		float kiloWattHora = scanner.nextFloat();
		
		float valorConta = calcularValorConta(cliente, kiloWattHora);
		
		if (valorConta != -1.0) {
			System.out.println("O valor da conta de luz é: R$ " + String.format("%.2f", valorConta));
		} else {
			System.out.println("Tipo de cliente não encontrado.");
		}

		scanner.close();
	}
	
	private static float calcularValorConta(String cliente, float kiloWattsHora) {
		float valorConta = 0.0f;
		
		switch (cliente) {
			case "1" :
				valorConta = kiloWattsHora * 0.60f;
				break;
				
			case "2" :
				valorConta = kiloWattsHora * 0.48f;
				break;
				
			case "3" :
				valorConta = kiloWattsHora * 1.29f;
				break;

			default :
				valorConta = -1.0f;
				break;
		}
		
		return valorConta;
	}

}
