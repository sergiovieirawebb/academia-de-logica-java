package exercicios.POO.E05;

public class Aluno {
	/*
	 * Escreva uma classe cujos objetos representam alunos matriculados em uma
	 * disciplina. Cada objeto dessa classe deve guardar os seguintes dados do
	 * aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
	 * seguintes métodos para esta classe:
	 * 
	 * - a. media: calcula a média final do aluno (cada prova tem peso 2,5 e
	 * o trabalho tem peso 2)
	 * 
	 * - b. final: calcula quanto o aluno precisa para a prova final (retorna
	 * zero se ele não for para a final e -1 se for reprovado)
	 */

	private String matricula;
	private String nome;
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho;

	public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getNotaProva1() {
		return notaProva1;
	}

	public double getNotaProva2() {
		return notaProva2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public double calcularMedia() {
		return (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2.0) / 7.0;
	}

	public String calcularProvaFinal() {
		double notaAprovacao = 7.0;
		double notaProvaFinal = (notaAprovacao * 9.5 - notaProva1 * 2.5 - notaProva2 * 2.5 - notaTrabalho * 2.0) / 2.5;

		if (notaProvaFinal <= notaAprovacao) {
			return "0.0";
		} else {
			if (notaProvaFinal > 10) {
				return "-1.0";
			} else {
				return Double.toString(notaProvaFinal);
			}
		}
	}

}
