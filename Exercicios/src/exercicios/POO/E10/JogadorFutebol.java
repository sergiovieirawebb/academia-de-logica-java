package exercicios.POO.E10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JogadorFutebol {
	/*
	 * Crie uma classe para representar um jogador de futebol, com os atributos: a.
	 * nome; b. posição; c. data de nascimento; d. nacionalidade; e. altura; f.
	 * peso; Crie os métodos públicos necessários para getters e setters e também um
	 * método para imprimir todos os dados do jogador. Crie um método para calcular
	 * a idade do jogador e outro método para mostrar quanto tempo falta para o
	 * jogador se aposentar. Para isso, considere que os jogadores da posição de
	 * defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e
	 * os atacantes aos 35.
	 */

	private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String nome;
	private String posicao;
	private LocalDate dataNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;

	public enum Posicao {
		ATACANTE("atacante"), MEIO_CAMPO("meio de campo"), DEFESA("defesa");

		private final String valor;

		private Posicao(String valor) {
			this.valor = valor;
		}

		public String getValor() {
			return valor;
		}
	}

	public JogadorFutebol(String nome, String posicao, String dataNascimento, String nacionalidade, double altura,
			double peso) {

		setNome(nome);
		setPosicao(posicao);
		setDataNascimento(dataNascimento);
		setNacionalidade(nacionalidade);
		setAltura(altura);
		setPeso(peso);
	}

	public void imprimirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Posição: " + getPosicao());
		System.out.println("Data de nascimento: " + getDataNascimento());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Altura: " + getAltura() + "cm");
		System.out.println("Peso: " + getPeso() + "Kg");
		System.out.println("Idade: " + calcularIdade() + " ano(s)");
		System.out.println("Tempo restante para a aposentadoria: " + calcularTempoRestanteAposentadoria() + " ano(s)");
	}

	public int calcularIdade() {
		LocalDate dataHoje = LocalDate.now();
		Period idade = Period.between(dataNascimento, dataHoje);
		return idade.getYears();
	}

	public int calcularTempoRestanteAposentadoria() {
		int idadeAtualJogador = calcularIdade();
		int tempoRestanteAposentadoria = 0;

		if (posicao.equals("atacante") && idadeAtualJogador < 35) {
			tempoRestanteAposentadoria = 35 - idadeAtualJogador;
		} else if (posicao.equals("meio de campo") && idadeAtualJogador < 38) {
			tempoRestanteAposentadoria = 38 - idadeAtualJogador;
		} else if (posicao.equals("defesa") && idadeAtualJogador < 40) {
			tempoRestanteAposentadoria = 40 - idadeAtualJogador;
		}
		return tempoRestanteAposentadoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao.substring(0, 1).toUpperCase() + posicao.substring(1);
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao.toLowerCase();
	}

	public String getDataNascimento() {
		return dataNascimento.format(formatoData);
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento, formatoData);
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
