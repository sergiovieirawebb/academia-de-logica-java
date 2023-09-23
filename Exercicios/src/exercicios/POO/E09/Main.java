package exercicios.POO.E09;

public class Main {

	public static void main(String[] args) {
		Voo voo1 = new Voo("25/09/2023", 502954, 100);
		
		System.out.println(voo1.ocuparCadeira(2));
		System.out.println(voo1.ocuparCadeira(3));
		System.out.println(voo1.ocuparCadeira(3));
		System.out.println(voo1.ocuparCadeira(4));
		System.out.println(voo1.mostrarProximaCadeiraLivre());
		System.out.println(voo1.verificarCadeiraLivre(3));
		System.out.println(voo1.calcularQuantidadeCadeirasLivres());
		System.out.println(voo1.getVoo());
		System.out.println(voo1.getData());
	}

}
