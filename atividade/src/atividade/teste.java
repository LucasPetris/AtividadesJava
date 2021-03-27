package atividade;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		
	int S1, S2, valor;
	
	Scanner Entrada = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	valor = Entrada.nextInt();
	
	S1 = 0;
	S2 = 0;
	for (int x = 0; x < valor; x++) {
		if (x % 2 == 0) {
			System.out.println(x + " é par");
			S1 = S1 + 1;
		}
	else {
			System.out.println(x + " é impar");
			S2 = S2 + 1;
	}
	
	System.out.println("Total de numeros pares: " + S1);
	System.out.println("Total de numeros impares: " + S2);
	
	
		
	  	}

	}

}
