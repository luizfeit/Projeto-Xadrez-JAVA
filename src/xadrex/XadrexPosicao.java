package xadrex;

import tabuleiro.Posicoes;

public class XadrexPosicao {
	
	private char coluna;
	private int linha;
	//
	public XadrexPosicao(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new XadrexException("Erro em instanciar a XadrexPosicao. Validar valores que vem do a1 e h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	//Colunas e linhas
	protected Posicoes toPosicoes() {
		return new Posicoes(8 - linha, coluna  - 'a');
	}
	
	protected static XadrexPosicao fromPosicao(Posicoes posicoes) {
		return new XadrexPosicao((char)('a'-posicoes.getColuna()), 8-posicoes.getLinha());
	}
	
	@Override
	//Imprimindo as posição das peças.
	public String toString() {
		return ""+ coluna+ linha;
	}
	
}
