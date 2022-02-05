package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// System.out.println(notasAlunoA[4]); ERRO!
		
		double totalAlunoA = totalNotasAluno(notasAlunoA);
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalAlunoB = totalNotasAluno(notasAlunoB);
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
	
	static double totalNotasAluno(double[] notasAluno) {
		
		double total = 0;
		
		for(double nota : notasAluno) {
			total += nota; 
		}
		
		return total;
				
	}
}
