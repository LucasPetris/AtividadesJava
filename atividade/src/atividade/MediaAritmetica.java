package atividade;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		/* Atividade - M�dia Aritm�tica entre tr�s notas dos Alunos - */
		
		String nome;
		double n1, n2, n3;
		double divisor;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Nome do Aluno: ");
		nome = Entrada.next();
		System.out.println("Digite a sua primeira nota: ");
		n1 = Entrada.nextDouble();
		System.out.println("Digite a sua segunda nota: ");
		n2 = Entrada.nextDouble();
		System.out.println("Digite a sua terceira nota: ");
		n3 = Entrada.nextDouble();
		
		divisor = (n1 + n2 + n3) / 3;
		
		if (divisor >= 7.0) {
			System.out.println(nome + " voc� est� aprovado com a m�dia: " + divisor);
		} else {
			System.out.println(nome + " voc� foi reprovado com a m�dia: " + divisor);
		}
		

	}

}
