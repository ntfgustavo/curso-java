package br.com.ntfgustavo.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoRealDistanciaEsquerda() {
		Campo vizinho = new Campo(3, 2);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	@Test
	void testeVizinhoDistanciaDireita() {
		Campo vizinho = new Campo(3, 4);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	@Test
	void testeVizinhoDistanciaEmCima() {
		Campo vizinho = new Campo(2, 3);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	
	@Test
	void testeVizinhoDistanciaEmBaixo() {
		Campo vizinho = new Campo(4, 3);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	@Test
	void testeVizinhoDistanciaDiagonal() {
		Campo vizinho = new Campo(2, 2);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	@Test
	void testeNaoVizinhoDiagonal() {
		Campo vizinho = new Campo(1, 1);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertFalse(resultado);		
	}
	
}
