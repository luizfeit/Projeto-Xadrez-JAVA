package xadrex;

import tabuleiro.Pecas;
import tabuleiro.Tabuleiro;

public class PecaDeXadrex extends Pecas {
	private Cor cor;

	public PecaDeXadrex(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
