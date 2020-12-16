package xadrex.pecas;

import tabuleiro.Tabuleiro;
import xadrex.Cor;
import xadrex.PecaDeXadrex;

public class Torre extends PecaDeXadrex {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		
	}
	
	@Override
	public String toString() {
		// "T" de torre.
		return "T";
	}

	@Override
	public boolean[][] possivelMovimento() {
		boolean[][] mat=new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}
}

