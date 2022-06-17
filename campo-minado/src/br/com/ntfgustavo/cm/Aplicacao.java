package br.com.ntfgustavo.cm;

import br.com.ntfgustavo.cm.modelo.Tabuleiro;
import br.com.ntfgustavo.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
				
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);		
		new TabuleiroConsole(tabuleiro);
	}
	
}
