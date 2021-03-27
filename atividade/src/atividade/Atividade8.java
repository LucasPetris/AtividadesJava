package atividade;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		/* Atividade numero 05 - Calculo area do Triangulo - */
		
		int base, altura;
		double area;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite a Base do Triangulo: ");
		base = Entrada.nextInt();
		System.out.println("Digite a Altura do Triangulo: ");
		altura = Entrada.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.println("A area do Triangulo é: " + area);
	}

}
