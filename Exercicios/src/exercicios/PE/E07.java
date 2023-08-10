package exercicios.PE;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		/*
		 * Leia uma temperatura em graus Celsius e apresentá-la convertida em
		 * graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a
		 * temperatura em Fahrenheit e C a temperatura emCelsius;
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a temperatura em graus Celsius: ");
		float temperaturaCelsius = scanner.nextFloat();

		float temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

		System.out.println("A temperatura em graus Fahrenheit é: "
				+ temperaturaFahrenheit + " ºF");

		scanner.close();

	}

}
