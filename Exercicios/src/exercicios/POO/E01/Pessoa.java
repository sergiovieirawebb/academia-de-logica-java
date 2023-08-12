package exercicios.POO.E01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
 * Crie uma classe para representar uma Pessoa com os atributos privados de
 * nome, data de nascimento e altura. Crie os métodos públicos necessários
 * para getters e setters e também um método para imprimir todos dados de
 * uma pessoa. Crie um método para calcular a idade da pessoa.
 */

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private float altura;

	public Pessoa(String nome, String dataNascimento, float altura) {
		this.nome = nome;
		this.dataNascimento = LocalDate.parse(dataNascimento,
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.altura = altura;
	}

	public String getDataNascimento() {
		return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento,
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int calcularIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period idade = Period.between(dataNascimento, dataAtual);
		return idade.getYears();
	}

	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento
				.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Idade: " + calcularIdade() + " anos");
	}
}
