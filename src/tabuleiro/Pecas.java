package tabuleiro;

public class Pecas {
	protected Posicoes posicao;
	private Tabuleiro tabuleiro;
	
	// A posi��o � null porque as pe�as do xadrex n�o foram colocadas no tabuleiro ainda.
	public Pecas(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao=null;
	}
    // Est� protegio pois n�o permitira que mudem a borda do tabuleiro.
	protected Tabuleiro getBorda() {
		return tabuleiro;
	}
	
	
	
}
