package exercicios.POO.E09;

import exercicios.POO.E08.Data;

public class Voo {
	/*
	 * Escreva uma classe em que cada objeto representa um Voo que acontece em
	 * determinada data e em determinado horário. Cada vôo possui no máximo 100
	 * passageiros, e a classe permite controlar a ocupação das vagas. A classe deve
	 * ter os seguintes métodos:
	 * 
	 * - a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo,
	 * data (para armazenar a data utilize um objeto da classe Data, criada na questão anterior);
	 * 
	 * - b. ProximoLivre: retorna o número da próxima cadeira livre
	 * 
	 * - c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
	 * 
	 * - d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e
	 * retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida)
	 * e falso caso contrário
	 * 
	 * - e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
	 * 
	 * - f. GetVoo: retorna o número do vôo
	 */

	private Data dataVoo;
	private int numeroVoo;
	private int[] cadeiras;

	public Voo(String data, int numeroVoo, int numeroMaximoPassageiros) {
		this.dataVoo = new Data(data);
		this.numeroVoo = numeroVoo;
		this.cadeiras = new int[numeroMaximoPassageiros];
	}

	public int mostrarProximaCadeiraLivre() {
		for (int i = 0; i < cadeiras.length; i += 1) {
			if (cadeiras[i] == 0) {
				int numeroCadeira = i + 1;
				return numeroCadeira;
			}
		}
		return 0;
	}

	public boolean verificarCadeiraLivre(int numeroCadeira) {
		int cadeiraDesocupada = 0;
		return cadeiras[numeroCadeira - 1] == cadeiraDesocupada ? true : false;
	}

	public boolean ocuparCadeira(int numeroCadeira) {
		if (numeroCadeira > 0 && numeroCadeira <= cadeiras.length) {
			int cadeiraDesocupada = 0;

			if (cadeiras[numeroCadeira - 1] == cadeiraDesocupada) {
				int cadeiraOcupada = 1;

				cadeiras[numeroCadeira - 1] = cadeiraOcupada;
				return true;
			}
		}
		return false;
	}

	public int calcularQuantidadeCadeirasLivres() {
		int quantidadeCadeirasLivres = 0;

		for (int i = 0; i < cadeiras.length; i += 1) {
			int cadeiraDesocupada = 0;

			if (cadeiras[i] == cadeiraDesocupada) {
				quantidadeCadeirasLivres += 1;
			}
		}
		return quantidadeCadeirasLivres;
	}

	public int getVoo() {
		return numeroVoo;
	}

	public String getData() {
		return dataVoo.getData();
	}
}
