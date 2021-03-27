package atividade;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		/* Atividade numero 06 - SalarioBruto, INSS, IR, SalarioLiquido*/
		
		String nome;
		int numeroHoras, numeroDepen;
		int Horas, Dependentes, salarioBruto;
		double descontoInss, descontoIR, salarioLiquido;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		nome = Entrada.next();
		System.out.println("Quantas horas trabalhadas?: ");
		numeroHoras = Entrada.nextInt();
		System.out.println("Quantos dependentes?: ");
		numeroDepen = Entrada.nextInt();

		Horas = 32;
		Dependentes = 40;
		
		salarioBruto = numeroHoras * Horas + numeroDepen * Dependentes;
		descontoInss = salarioBruto * 8.5 / 100;
		descontoIR = salarioBruto * 5 / 100;
		salarioLiquido = salarioBruto - descontoInss - descontoIR;
		
		System.out.println("Nome: " + nome);
		System.out.println("Seu salário bruto é: R$ " + salarioBruto);
		System.out.println("Inss: " + descontoInss);
		System.out.println("IR: " + descontoIR);
		System.out.println("Salário liquido: " + salarioLiquido);
			
		
	}

}
