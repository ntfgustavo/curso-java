package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double media, salario1, salario2, salario3;
		
		System.out.print("Digite o primeiro sal�rio: ");		
		salario1 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		
		System.out.print("Digite o segundo sal�rio: ");
		salario2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		
		System.out.print("Digite o terceiro sal�rio: ");
		salario3 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		
		media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("\nPrimeiro sal�rio � : %.2f%n", salario1);
		System.out.printf("Segundo sal�rio � : %.2f%n", salario2);
		System.out.printf("Terceiro sal�rio � : %.2f%n", salario3);		
		System.out.printf("A m�dia salarial dos �ltimos 3 meses � : %.2f", media);
		
		entrada.close();
	}
}
