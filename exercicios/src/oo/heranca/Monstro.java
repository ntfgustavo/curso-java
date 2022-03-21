package oo.heranca;

public class Monstro extends Jogador {

	public Monstro() {
		this(0, 0);
	}
	
	public Monstro(int x, int y) {
		super(x, y);
	}
	
	public void setX(int x) {
		super.x = x;
	}
	
	public void setY(int y) {
		super.y = y;
	}
	
	public int getVida() {
		return super.vida;
	}
	
	public boolean atacar (Jogador oponente) {
		boolean ataque = super.atacar(oponente);
		return ataque;		
	}
	
	public boolean andar (Direcao direcao) {
		return super.andar(direcao);
	}
	
}
