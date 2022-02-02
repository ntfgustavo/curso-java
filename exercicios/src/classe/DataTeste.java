package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.ano = 2021;
//		data1.dia = 6;
//		data1.mes = 9;
//		data1.ano = 1986;
		
		
		Data data2 = new Data(7, 1, 1984);		
//		data2.dia = 7;
//		data2.mes = 1;
//		data2.ano = 1984;
		
		String dataFormatada1 = data1.obterDataFormatada(); 
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());
		
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
		
	}
}
