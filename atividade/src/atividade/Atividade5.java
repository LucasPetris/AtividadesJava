package atividade;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		/* Atividade numero 02 - Valores e mostrar opera��es dos valores - */
		
		int V1, V2, V3;
		
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o Valor de V1: ");
		V1 = Entrada.nextInt();
		System.out.println("Digite o Valor de V2: ");
		V2 = Entrada.nextInt();
		System.out.println("Digite o Valor de V3: ");
		V3 = Entrada.nextInt();
		
		
		
		System.out.println("Opera��o 1 = " + (V1 + V2));
		System.out.println("Opera��o 2 = " + (V2 - V1));
		System.out.println("Opera��o 3 = " + (V3 * V1));
		System.out.println("Opera��o 4 = " + (V3 + V2));
		System.out.println("Opera��o 5 = " + (V3 - V2));
		System.out.println("Opera��o 6 = " + (V1 + V2 + V3));
		

	}

}
