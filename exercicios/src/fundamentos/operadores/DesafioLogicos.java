package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		//boolean tv32 = (trabalho1 || trabalho2) && !tv50;
		
		boolean tomouSorvete = tv50 || tv32;
		boolean ficouMaisSaudavel = !tomouSorvete;
		
		System.out.println("Trabalho 1 deu certo? " + trabalho1);
		System.out.println("Trabalho 2 deu certo?" + trabalho2);
		
		System.out.println("Comprou TV de 50\"? " + tv50);
		System.out.println("Comprou TV de 32\"? " + tv32);
		
		System.out.println("Tomou sorvete? " + tomouSorvete);
		System.out.println("Ficou mais saud�vel? " + ficouMaisSaudavel);
		
	}
}
