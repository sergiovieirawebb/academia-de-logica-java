package exercicios.POO.E12;

import java.util.ArrayList;
import exercicios.POO.E01.Pessoa;

public class Agenda {
	/*
	 * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de
	 * realizar as seguintes operações:
	 * 
	 * - a. void armazenarPessoa(String nome, int idade, float altura); armazena a pessoa
	 * em um array
	 * 
	 * - b. void removerPessoa(String nome); remove a pessoa do array
	 * 
	 * - c. int buscarPessoa(String nome); informa em que posição da agenda está a pessoa
	 * 
	 * - d. void imprimirAgenda(); imprime os dados de todas as pessoas da agenda
	 * 
	 * - e. void imprimirPessoa(int index); imprime os dados da pessoa que está na
	 * posição “index” da agenda.
	 */

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void adicionarPessoa(String nome, String dataNascimento, float altura) {
		Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);
		pessoas.add(pessoa);
	}

	public void removerPessoa(String nome) {
		for (int index = 0; index < pessoas.size(); index += 1) {
			Pessoa pessoa = pessoas.get(index);

			if (pessoa.getNome().equals(nome)) {
				pessoas.remove(index);
				System.out.println(pessoa.getNome() + " removido(a) da agenda\n");
				return;
			}
		}
		System.out.println(nome + " não encontrado(a) na agenda\n");
	}

	public void buscarPessoa(String nome) {
		for (int index = 0; index < pessoas.size(); index += 1) {
			Pessoa pessoa = pessoas.get(index);

			if (pessoa.getNome().equals(nome)) {
				System.out.println(pessoa.getNome() + " está na " + (index + 1) + "ª posicão\n");
				return;
			}
		}
		System.out.println(nome + " não encontrado(a) na agenda\n");
	}

	public void imprimirAgenda() {
		if (pessoas.isEmpty()) {
			System.out.println("A agenda está vazia\n");
		} else {
			pessoas.forEach(pessoa -> pessoa.imprimirDados());
		}
	}

	public void imprimirPessoa(int posicao) {
		if (posicao > 0 && posicao <= pessoas.size()) {
			int posicaoPessoa = posicao - 1;
			Pessoa pessoa = pessoas.get(posicaoPessoa);
			pessoa.imprimirDados();
		} else {
			System.out.println("Posição inválida na agenda\n");
		}
	}
}
