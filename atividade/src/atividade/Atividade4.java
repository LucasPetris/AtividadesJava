package atividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		/* Atividade numero 01 - Mostrar todas opera��es aritm�ticas - */
		
		int n1, n2;
		int soma, subtracao, multi;
		double divisao;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o numero 1: ");
		n1 = Entrada.nextInt();
		System.out.println("Digite o numero 2: ");
		n2 = Entrada.nextInt();
		
		soma = n1 + n2;
		subtracao = n1 - n2;
		divisao = (double) n1 / n2;
		multi = n1 * n2;
		
		System.out.println("A soma dos dois numeros �: " + soma);
		System.out.println("A subtrac�o dos dois numeros �: " + subtracao);
		System.out.println("A divis�o dos dois numeros �: " + divisao);
		System.out.println("A multiplica��o dos dois numeros �: " + multi);
		
		

	}

}
