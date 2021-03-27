package atividade;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		/* Atividade Contagem Crescente - Descrente - Maior entre dois numeros */
		
		int I;
		double A, B, C;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o numero I -> 1, 2 ou 3: ");
		I = Entrada.nextInt();
		System.out.println("Digite o valor de A: ");
		A = Entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		B = Entrada.nextInt();
		System.out.println("Digite o valor de C: ");
		C = Entrada.nextInt();
		
		switch (I) {
		case 1:
			if (A<B && A<C)
     		  {
     		  	if (B<C)
	  			 System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
     			else
	  			 System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
	  		  }	 
  		if (B<A && B<C)
			  {
			  	if (A<C)
	  			 System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
     			else
	  			 System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
	  		  }	 
  		if (C<A && C<B)
  		  {
  		    if (A<B)
	  			 System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
     			else
	  			 System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
			  }
  		break;
  		
		case 2:
			if (A>B && A>C)
     		  {
     		  	if (B>C)
	  			 System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
     			else
	  			 System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
	  		  }	 
  		if (B>A && B>C)
			  {
			  	if (A>C)
	  			 System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
     			else
	  			 System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
	  		  }	 
  		if (C>A && C>B)
  		  {
  		    if (A>B)
	  			 System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
     			else
	  			 System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
			  }
  		break;
  		
		case 3: 
				{
	    	if (A>B && A>C)
	          	 System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
	       	if (B>A && B>C)
	          	 System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
	       	if (C>A && C>B)
	          	 System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
	     		}
		break;
		
		
		}
		
	 }	  

}


