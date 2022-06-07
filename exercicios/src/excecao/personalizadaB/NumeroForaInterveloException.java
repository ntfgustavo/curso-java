package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaInterveloException extends Exception {

	private String nomeDoAtributo;
	
	public NumeroForaInterveloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' est� fora do intervalo.", nomeDoAtributo);
	}
	
}
