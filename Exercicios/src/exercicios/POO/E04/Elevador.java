package exercicios.POO.E04;

public class Elevador {
	/*
	 * Crie uma classe denominada Elevador para armazenar as informações de um
	 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
	 * total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas
	 * pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
	 * 
	 * - a. Inicializa: que deve receber como parâmetros a capacidade do elevador e
	 * o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
	 * 
	 * - b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se
	 * ainda houverespaço);
	 * 
	 * - c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém
	 * dentro dele);
	 * 
	 * - d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
	 * 
	 * - e. Desce: para descer um andar (não deve descer se já estiver no térreo);
	 */
	
	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int qtdPessoasElevador;

	public void inicializar(int capacidadeElevador, int totalAndares) {
		this.capacidadeElevador = capacidadeElevador;
		System.out.println("O elevador tem capacidade para " + this.capacidadeElevador + " pessoa(s).");

		this.totalAndares = totalAndares;
		System.out.println("O prédio tem " + totalAndares + " andar(es).");
	}

	public void entrar() {
		if (qtdPessoasElevador < capacidadeElevador) {
			qtdPessoasElevador += 1;
			System.out.println("Entrou 1 pessoa no elevador e agora há " + qtdPessoasElevador + " pessoa(s).");
		} else {
			System.out.println(
					"A quantidade de pessoas no elevador não pode exceder " + capacidadeElevador + " pessoa(s).");
		}
	}

	public void sair() {
		if (qtdPessoasElevador > 0) {
			qtdPessoasElevador -= 1;
			System.out.println("Saiu 1 pessoa do elevador.");
		} else {
			System.out.println("O elevador está vazio.");
		}
	}

	public void subir() {
		if (andarAtual < totalAndares) {
			andarAtual += 1;
			System.out.println("O elevador subiu 1 andar e agora está no " + andarAtual + "º andar.");
		} else {
			System.out.println("O elevador não pode subir mais andares, pois está no último andar.");
		}

	}

	public void descer() {
		if (andarAtual > 0) {
			andarAtual -= 1;
			if (andarAtual == 0) {
				System.out.println("O elevador desceu 1 andar e agora está no térreo.");
			} else {
				System.out.println("O elevador desceu 1 andar e agora está no " + andarAtual + "º andar.");
			}
		} else {
			System.out.println("O elevador não pode descer mais andares, pois está no térreo.");
		}
	}
}
