package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int qtdeNotas = 0;
		double nota = 0;
		double total = 0;
		double media = 0;
		boolean condicao = true;

		
		while (condicao) {
			
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			
			condicao = nota != -1;
			
			if (condicao) {
				if (nota >= 0.0 || nota <= 10.0) {
					total += nota;
					qtdeNotas++;
				} else {
					System.out.println("Nota inválida!");
				}
			}
			
		}		

		media = total / qtdeNotas;
		
		if (media >= 0) {System.out.printf("A média do aluno é %.2f", media);}
		
		entrada.close();		

	}
}
