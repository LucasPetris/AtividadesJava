package atividade;

import java.util.Scanner;

public class DepartamentoComposta {

	public static void main(String[] args) {
		int digito;
		double salarioAtual, aumentoSalario;
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Bem Vindo ao Departamento Pessoal");
		System.out.println("Por favor, digite qual � o seu salario atual: ");
		salarioAtual = Entrada.nextDouble();
		System.out.println("-----------------------------------------------------");
		System.out.println(" LISTAGEM DE CARGOS - POR FAVOR SELECIONE O SEU CARGO");
		System.out.println("[1] Escritur�rio");
		System.out.println("[2] Secret�rio");
		System.out.println("[3] Caixa");
		System.out.println("[4] Gerente");
		System.out.println("[5] Diretor");
		System.out.println("Digite [6] para sair");
		System.out.println("-----------------------------------------------------");
		digito = Entrada.nextInt();
		
		if (digito ==1) {
			aumentoSalario = (salarioAtual * 50) / 100;
			aumentoSalario = aumentoSalario + salarioAtual;
			System.out.println("Para o cargo de Escritur�rio voc� ir� ganhar: " + aumentoSalario);
		} else if (digito == 2) {
			aumentoSalario = (salarioAtual * 35) / 100;
			aumentoSalario = aumentoSalario + salarioAtual;
			System.out.println("Para o cargo de Secret�rio voc� ir� ganhar: " + aumentoSalario);
		} else if (digito == 3) {
			aumentoSalario = (salarioAtual * 20) / 100;
			aumentoSalario = aumentoSalario + salarioAtual;
			System.out.println("Para o cargo de Cixa voc� ir� ganhar: " + aumentoSalario);
			
		} else if (digito == 4){
			aumentoSalario = (salarioAtual * 10) / 100;
			aumentoSalario = aumentoSalario + salarioAtual;
			System.out.println("Para o cargo de Gerente voc� ir� ganhar: " + aumentoSalario);
		} else if (digito == 5){
			System.out.println("Como diretor voc� n�o ir� ter aumento, o seu sal�rio �: " + salarioAtual);
		} else {
			System.out.println("Obrigado at� logo!!!");
		}

	}

}
