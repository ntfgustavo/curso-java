package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b =  (int) Math.pow(a, 3);
		double c =  Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		/*
		double exp1;
		double exp2;
		double exp3;		
		double elevadoAoQuadrado1;
		double elevadoAoQuadrado2;
		double dividendo;
		double resultado;		
		
		exp1 = 6 * (3 + 2);		
		elevadoAoQuadrado1 = Math.pow(exp1, 2);
		exp2 = 3 * 2;
		
		exp3 = ((1 - 5) * (2 - 7)) / 2;		
		elevadoAoQuadrado2 = Math.pow(exp3, 2);
		
		dividendo = (elevadoAoQuadrado1 / exp2) - elevadoAoQuadrado2;
		
		resultado = Math.pow(dividendo / 10, 3);
		
		
		System.out.println("O resultado do desafio �: " + resultado);
		*/
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superioA = numA / denA;
		double superioB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superioA - superioB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado � " + resultado);
	}
}
