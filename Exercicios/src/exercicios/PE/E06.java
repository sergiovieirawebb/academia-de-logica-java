package exercicios.PE;

public class E06 {
	
	public static void main(String[] args) {
		/*
		 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos
		 * valores de forma que a variável A passe a possuir o valor da variável
		 * B e a variável B passe a possuir o valor da variável A. Apresentar os
		 * valores trocados;
		 */

		int a = 10;
		int b = 20;
		int aux = 0;

		aux = a;
		a = b;
		b = aux;

		System.out.println(a);
		System.out.println(b);
	
	}

}
