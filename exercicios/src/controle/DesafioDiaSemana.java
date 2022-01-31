package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1 
		// Segunda -> 2
		// Ter�a -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// S�bado -> 7
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String diaSemana = entrada.nextLine();
		
		if (diaSemana.equals("Domingo")) {
			System.out.println(1);
		} else if (diaSemana.equals("Segunda")) {
			System.out.println(2);
		} else if (diaSemana.equals("Ter�a")) {
			System.out.println(3);
		} else if (diaSemana.equals("Quarta")) {
			System.out.println(4);
		} else if (diaSemana.equals("Quinta")) {
			System.out.println(5);
		} else if (diaSemana.equals("Sexta")) {
			System.out.println(6);
		} else if (diaSemana.equals("S�bado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia da semana inv�lido!");
		}
		
		entrada.close();
		
	}
}
