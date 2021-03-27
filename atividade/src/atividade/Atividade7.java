package atividade;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		/* Atividade numero 04 - Valor com acrescimo em porcentagem - */
		
		double valor;
		double valorNovo;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		valor = Entrada.nextDouble();
		
		valorNovo = valor + (valor * (15.8/100));
		
		System.out.println("Valor novo: " + valorNovo);
		

	}

}
