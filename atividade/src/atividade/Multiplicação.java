package atividade;

import java.util.Scanner;

public class Multiplicação {

	public static void main(String[] args) {
		/* Atividade - Multiplicação de Dois Numeros */
		
		int n1, n2;
		double multi;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o numero 1: ");
		n1 = Entrada.nextInt();
		System.out.println("Digite o numero 2: ");
		n2 = Entrada.nextInt();
		
		multi = n1 * n2;
		
		System.out.println("Resultado: " + multi);
		

	}

}
