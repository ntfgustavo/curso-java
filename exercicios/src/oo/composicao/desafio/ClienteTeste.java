package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
	
	public static void main(String[] args) {
	
		Produto produto1 =  new Produto("Caneta", 1.2);
		Produto produto2 =  new Produto("Borracha", 0.8);
		Produto produto3 =  new Produto("Caderno", 25.1);
		Produto produto4 =  new Produto("Régua", 3.55);
	
		List<Item> itens = new ArrayList<Item>();
		
		itens.add(new Item(produto1, 2));
		itens.add(new Item(produto3, 3));
		Compra compra1 = new Compra();		
		compra1.adicionarItens(itens);
		
		Compra compra2 = new Compra();		
		compra2.adicionarItem(new Item(produto2, 4));
		compra2.adicionarItem(new Item(produto4, 5));
		
		itens.clear();
		itens.add(new Item(produto1, 1));
		itens.add(new Item(produto2, 6));
		Compra compra3 = new Compra();		
		compra3.adicionarItens(itens);
		
		itens.clear();
		itens.add(new Item(produto3, 7));
		itens.add(new Item(produto4, 8));	
		Compra compra4 = new Compra();		
		compra4.adicionarItens(itens);
		 
		Cliente cliente1 = new Cliente("Gustavo Neres");
		cliente1.adicionarCompra(compra2);
		cliente1.adicionarCompra(compra3);
		
		Cliente cliente2 = new Cliente("Fernanda Pereira");
		cliente2.adicionarCompra(compra1);
		cliente2.adicionarCompra(compra4);
		
		System.out.println("Cliente: " + cliente1.nome);		
		for (int i = 0; i < cliente1.compras.size(); i++) {
			System.out.println();
			System.out.println("Compra " + (i + 1));			
			for(Item item : cliente1.compras.get(i).itens) {
				System.out.println(item.produto.toString());	
			}
			System.out.printf("Valor total compra %d: %.2f", (i + 1), cliente1.compras.get(i).obterValorTotal());			
			System.out.println();
		}
		System.out.println();
		System.out.printf("Valor total cliente %s: %.2f", cliente1.nome, cliente2.obterValorToral());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Cliente: " + cliente2.nome);		
		for (int i = 0; i < cliente2.compras.size(); i++) {
			System.out.println();
			System.out.println("Compra " + (i + 1));			
			for(Item item : cliente2.compras.get(i).itens) {
				System.out.println(item.produto.toString());	
			}
			System.out.printf("Valor total compra %d: %.2f", (i + 1), cliente2.compras.get(i).obterValorTotal());			
			System.out.println();
		}
		System.out.println();
		System.out.printf("Valor total cliente %s: %.2f", cliente2.nome, cliente2.obterValorToral());

		
		
		
	}
	
}
