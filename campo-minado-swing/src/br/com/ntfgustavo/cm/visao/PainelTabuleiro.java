package br.com.ntfgustavo.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.ntfgustavo.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		 
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
//		int total = tabuleiro.getLinhas() * tabuleiro.getColunas();
//		
//		for(int i = 0; i < total; i++) {
//			add(new BotaoCampo(null));
//		}
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservadores(e -> {
			// TODO mostrar resultado pro usuário!
		});
		
	}
	

}
