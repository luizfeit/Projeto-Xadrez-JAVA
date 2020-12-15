package tabuleiro;

public class Pecas {
	protected Posicoes posicao;
	private Tabuleiro tabuleiro;
	
	// A posição é null porque as peças do xadrex não foram colocadas no tabuleiro ainda.
	public Pecas(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao=null;
	}
    // Está protegio pois não permitira que mudem a borda do tabuleiro.
	protected Tabuleiro getBorda() {
		return tabuleiro;
	}
	
	
	
}
