package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Pecas[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas=new Pecas[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public Pecas pecas(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Pecas pecas (Posicoes posicoes) {
		return pecas[posicoes.getLinha()][posicoes.getColuna()];
	}
	//Colocando oi local das peças no tabuleiro.
	public void localPeca (Pecas peca, Posicoes posicoes) {
		pecas[posicoes.getLinha()][posicoes.getColuna()]=peca;
		peca.posicao=posicoes;
	}
}
