package atividade;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		/** Atividade Salario com bonifica��o e auxilio escola */
		
	double Salario, Boni = 0, Acresc, Aux, NovoSalario, AuxilioTotal;
	
	Scanner Entrada = new Scanner(System.in);
	System.out.println("Digite seu Salario: ");
	Salario = Entrada.nextDouble();
	
	Aux = 0;
	AuxilioTotal = 0;
	
	if (Salario <= 800) {
		Acresc = (Salario * 5) / 100;
	    Boni = Salario + Acresc;
	    System.out.println("Seu Novo Salario �: R$" + Boni);
		
	} else if (Salario == 800 || Salario <= 1300) {
		Acresc = (Salario * 12) / 100;
	    Boni = Salario + Acresc;
	    System.out.println("Seu novo sal�rio �: R$ " + Boni);
	} else {
		NovoSalario = Salario;
		System.out.println("Sem bonifica��o voc� continua com o Salario: " + NovoSalario);
	}
	
	
	if (Salario <= 900) {
		Aux = 150;
		AuxilioTotal = Boni + Aux;
	} else {
		Aux = 100;
		AuxilioTotal = Salario + Aux + Boni;
	}
	
	System.out.println("Seu Auxilio Escola � de R$: " + Aux + " TOTAL: " + AuxilioTotal);
		
		

		}

	}


