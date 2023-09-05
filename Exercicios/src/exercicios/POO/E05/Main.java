package exercicios.POO.E05;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("1", "Sérgio", 3.0, 6.0, 7.0);
		
		System.out.println("Matrícula: " + aluno.getMatricula());
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Nota prova 1: " + aluno.getNotaProva1());
		System.out.println("Nota prova 2: " + aluno.getNotaProva2());
		System.out.println("Nota Trabalho: " + aluno.getNotaTrabalho());
		System.out.println("Média final: " + String.format("%.1f", aluno.calcularMedia()));
		System.out.println("Prova final: " + aluno.calcularProvaFinal());
	}

}
