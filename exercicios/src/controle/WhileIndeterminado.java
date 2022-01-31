package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.err.print("Você diz: ");
			valor = entrada.nextLine();
		}
		
		System.out.println("Fim!");
		
		entrada.close();
	}
}
