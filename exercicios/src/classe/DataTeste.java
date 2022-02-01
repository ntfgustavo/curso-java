package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = "06";
		data1.mes = "09";
		data1.ano = "1986";
		
		Data data2 = new Data();		
		data2.dia = "07";
		data2.mes = "01";
		data2.ano = "1984";
		
		System.err.println("Data1 = " + data1.dia + "/" + data1.mes + "/" + data1.ano);
		System.err.println("Data1 = " + data2.dia + "/" + data2.mes + "/" + data2.ano);
		
	}
}
