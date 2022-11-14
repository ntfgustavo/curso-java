package br.com.ntfgustavo.cm.visao;

import br.com.ntfgustavo.cm.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		
		tabuleiro.registrarObservadores(e -> {
			if(e.isGanhou()) {
				System.out.println("ganhou :)");
			} else {
				System.out.println("perdeu :(");
			}
		});
		
		
//		tabuleiro.abrir(2, 2);
		tabuleiro.alternarMarcacao(0, 0);
		tabuleiro.alternarMarcacao(0, 1);
		tabuleiro.alternarMarcacao(0, 2);
		tabuleiro.alternarMarcacao(1, 0);
		tabuleiro.alternarMarcacao(1, 1);
		tabuleiro.alternarMarcacao(1, 2);
		tabuleiro.alternarMarcacao(2, 0);
		tabuleiro.alternarMarcacao(2, 1);
		tabuleiro.abrir(2, 2);
//		tabuleiro.alternarMarcacao(2, 2);
		
	}
	
}
