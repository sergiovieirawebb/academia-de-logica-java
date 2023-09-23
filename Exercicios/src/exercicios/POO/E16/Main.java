package exercicios.POO.E16;

public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		System.out.println("CARRO 1:");
		carro1.abastecer(20);
		carro1.mover(200);
		carro1.mover(10);
		carro1.imprimirDados();

		System.out.println("\nCARRO 2:");
		carro2.abastecer(30);
		carro2.mover(400);
		carro2.imprimirDados();
	}

}
