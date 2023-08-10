package exercicios.PE;

import java.util.Scanner;

public class E27 {

	public static void main(String[] args) {
		/*
		 * A concessionária de veículos “CARANGO” está vendendo os seus veículos
		 * com desconto. Faça um algoritmo que calcule e exiba o valor do
		 * desconto e o valor a ser pago pelo cliente. O desconto deverá ser
		 * calculado sobre o valor do veículo de acordo com o combustível
		 * (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo
		 * zero encerra entrada de dados. Informe total de desconto e total pago
		 * pelos clientes.
		 */

		Scanner scanner = new Scanner(System.in);

		float totalDescontos = 0;
		float totalPagosPelosClientes = 0;

		while (true) {
			System.out
					.print("Digite o valor do veículo (ou 0 para encerrar): ");
			float valorVeículo = scanner.nextFloat();

			if (valorVeículo == 0)
				break;

			System.out.print(
					"Digite o combustível do veículo (álcool, gasolina ou diesel): ");
			String combustivelVeiculo = scanner.next().toLowerCase()
					.replaceFirst("á", "a");

			float percetualDesconto = 0;

			if (combustivelVeiculo.equals("alcool")) {
				percetualDesconto = 0.25f;
			} else if (combustivelVeiculo.equals("gasolina")) {
				percetualDesconto = 0.21f;
			} else if (combustivelVeiculo.equals("diesel")) {
				percetualDesconto = 0.14f;
			} else {
				System.out.println(
						"Tipo de combustível inválido. Tente novamente.\n");
				continue;
			}

			float valorDesconto = valorVeículo * percetualDesconto;
			totalDescontos += valorDesconto;

			float valorPagoPeloCliente = valorVeículo - valorDesconto;
			totalPagosPelosClientes += valorPagoPeloCliente;

			System.out.println("Valor do desconto: " + valorDesconto);
			System.out.println("Valor a ser pago pelo cliente: "
					+ valorPagoPeloCliente + "\n");

		}

		System.out.println("\nTotal de descontos: " + totalDescontos);
		System.out.println(
				"Total pagos pelos cliente: " + totalPagosPelosClientes);

		scanner.close();
	}
}
