package atividade;

import java.util.Scanner;
public class Atividade {

	public static void main(String[] args) {
	
	int soma, multi, n1, n2, digito, subtracao;
	double divisao;
	int resp;
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.println("----------------------------------------");
	System.out.println("     CALCULADORA NO JAVINHA BASICO      ");
	System.out.println("----------------------------------------");
	System.out.println("Digite [1] para SOMA");
	System.out.println("Digite [2] para MULTIPLICAR");
	System.out.println("Digite [3] para DIVIDIR");
	System.out.println("Digite [4] para SUBTRAIR");
	digito = Entrada.nextInt();
	
	switch (digito) {
	case 1: 
			System.out.println("DIGITE O PRIMEIRO NUMERO: ");
			n1 = Entrada.nextInt();
			System.out.println("DIGITE O SEGUNDO NUMERO: ");
			n2 = Entrada.nextInt();
			soma = (n1 + n2);
			System.out.println("O resultado da soma é: " + soma);
			break;
	case 2:
		   System.out.println("DIGITE O PRIMEIRO NUMERO: ");
		   n1 = Entrada.nextInt();
		   System.out.println("DIGITE O SEGUNDO NUMERO: ");
		   n2 = Entrada.nextInt();
		   multi = (n1 * n2);
		   System.out.println("O resultado da soma é: " + multi);
		   break;
	case 3:
		   System.out.println("DIGITE O PRIMEIRO NUMERO: ");
		   n1 = Entrada.nextInt();
		   System.out.println("DIGITE O SEGUNDO NUMERO: ");
		   n2 = Entrada.nextInt();
		   
    if (n2 < 1) {
    	   System.out.println("Não é possível dividir esse numero digite outro");
    	   n2 = Entrada.nextInt();
    	   divisao = (n2 + n1) / 2;
		   System.out.println("O resultado da soma é: " + divisao);	   
    }
    
    else {
		   divisao = (n1 + n2) / 2;
		   System.out.println("O resultado da soma é: " + divisao);
    }
		   break;
	case 4:
		   System.out.println("DIGITE O PRIMEIRO NUMERO: ");
		   n1 = Entrada.nextInt();
		   System.out.println("DIGITE O SEGUNDO NUMERO: ");
		   n2 = Entrada.nextInt();
		   subtracao = (n1 - n2);
		   System.out.println("O resultado da soma é: " + subtracao);
		   break;
	}
	
	}

}

