package atividade;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		/* Atividade numero 03 - Ler ano nascimento e mostrar idade com ano atual - */
		
		int anoNascimento;
		int anoAtual;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Ano nascimento: ");
		anoNascimento = Entrada.nextInt();
		
		LocalDateTime data1 = LocalDateTime.now();
		anoAtual = data1.getYear();
		
		System.out.println("Idade Aproximada: " + (anoAtual - anoNascimento));
		
		

	}

}
