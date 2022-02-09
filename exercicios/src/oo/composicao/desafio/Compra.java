package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	void adicionarItens(List<Item> itens) {
		this.itens.addAll(itens);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : this.itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
}
