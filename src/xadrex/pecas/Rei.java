package xadrex.pecas;

import tabuleiro.Tabuleiro;
import xadrex.Cor;
import xadrex.PecaDeXadrex;

public class Rei extends PecaDeXadrex{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override	
	public String toString() {
		//"R" de rei.
		return "R";
	}

	@Override
	public boolean[][] possivelMovimento() {
		boolean[][] mat=new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}
}

