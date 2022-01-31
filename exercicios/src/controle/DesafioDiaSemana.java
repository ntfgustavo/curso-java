package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1 
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sábado -> 7
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaSemana = entrada.next();
		
		if (diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if (diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if (diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Terca")) {
			System.out.println(3);
		} else if (diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if (diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if (diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if (diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("Sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia da semana inválido!");
		}
		
		entrada.close();
		
	}
}
