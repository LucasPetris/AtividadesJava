package atividade;

import java.util.Scanner;

public class exercicio {

	public static void main(String args[]) throws Exception {
		/* Atividade Média aritmetica de 4 notas e diferenciar sexo do Aluno */
		
		char sexo;
		double n1, n2, n3, n4;
		double media;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("SEXO M OU F:");
		sexo = (char)System.in.read();
		System.out.println("Digite a nota 1");
		n1 = Entrada.nextDouble();
		System.out.println("Digite a nota 2");
		n2 = Entrada.nextDouble();
		System.out.println("Digite a nota 3");
		n3 = Entrada.nextDouble();
		System.out.println("Digite a nota 4");
		n4 = Entrada.nextDouble();

		
		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 70) { 
		if (sexo =='M') {
			System.out.println("Caro Aluno você foi Aprovado com a média: " + media);
		}else if (sexo =='F') {
			System.out.println("Cara Aluna você foi Aprovada com a média: " + media);
		 	}
		
		}
			
		if (media < 70) {
		if (sexo =='M') {
			System.out.println("Você está reprovado");
		}else if (sexo =='F' ) {
			System.out.println("Você está reprovada");
		}
		
			}
		}	
	}


