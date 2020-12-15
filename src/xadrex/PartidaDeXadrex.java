package xadrex;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrex {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrex() {
		tabuleiro=new Tabuleiro(8, 8);
	}
	
	public PecaDeXadrex[][] getPecas(){
		PecaDeXadrex[][] mat=new PecaDeXadrex[tabuleiro.getLinhas()] [tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0;j<tabuleiro.getColunas();j++) {
				mat[i][j]=(PecaDeXadrex) tabuleiro.pecas(i,j);
			}
		}
		return mat;
	}
}
