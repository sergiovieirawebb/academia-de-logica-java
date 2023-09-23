package exercicios.POO.E12;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.adicionarPessoa("Sérgio", "27/08/1982", 1.80f);
		agenda.adicionarPessoa("Roberta", "27/09/1980", 1.56f);

		agenda.imprimirAgenda();
		
		agenda.removerPessoa("Roberta");
		
		agenda.buscarPessoa("Sérgio");
		agenda.buscarPessoa("Roberta");
		
		agenda.imprimirPessoa(1);
	}
}
