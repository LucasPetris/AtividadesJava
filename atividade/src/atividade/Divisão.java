package atividade;

import java.util.Scanner;

public class Divis�o {

	public static void main(String[] args) {
		/* Atividade - Divis�o entre dois Numeros - */
		
		double n1, n2, n3;
		double divisor;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o valor 1: ");
		n1 = Entrada.nextDouble();
		System.out.println("Digite o valor 2: ");
		n2 = Entrada.nextDouble();
		
		if (n2 == 0) {
			System.out.println("Digite outro valor que n�o seja 0: " );
			n3 = Entrada.nextDouble();
			divisor = n1 / n3;
			System.out.println("Resultado: " + divisor);
		} else {
		divisor = n1 / n2;
		System.out.println("Resultado: " + divisor);

		}
	}
}
