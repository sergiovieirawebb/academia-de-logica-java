package exercicios.POO.E08;

public class Main {

	public static void main(String[] args) {
		Data data1 = new Data("31/09/2023");
		Data data2 = new Data("25/09/2023");
		
		System.out.println(data1.getData());
		
		System.out.println(data1.comparar(data2.getData()));
		System.out.println(data1.getDia());
		System.out.println(data1.getMes());
		System.out.println(data1.getMesExtenso());
		System.out.println(data1.getAno());
		System.out.println(data1.isBissexto());		
		System.out.println(data1.clonar());
	}
}
