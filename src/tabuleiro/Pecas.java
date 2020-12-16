package tabuleiro;

public abstract class Pecas {
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
	
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public abstract boolean[][] possivelMovimento();
	
	//Hook methods
	public boolean possivelMovimento(Posicoes posicoes) {
		return possivelMovimento()[posicoes.getLinha()][posicoes.getColuna()];
	}
	
	//Usando a matriz para verificar os movimentos das pe�as.
	public boolean seTemPeloMenosAlgumMovimento() {
		boolean[][] mat=possivelMovimento();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++)
			{
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
