package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];
				
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota %d: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		double totalNotas = totalNotas(notas);		
		
		System.out.printf("A média das notas é: %.2f", totalNotas / qtdeNotas);
		
		entrada.close();
	}
	
	static double totalNotas(double[] notas) {
		
		double totalNotas = 0;
		
		for(double nota : notas) {
			totalNotas += nota;
		}	
		
		return totalNotas;
	}
}
