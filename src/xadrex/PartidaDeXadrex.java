package xadrex;

import tabuleiro.Posicoes;
import tabuleiro.Tabuleiro;
import xadrex.pecas.Rei;
import xadrex.pecas.Torre;

public class PartidaDeXadrex {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrex() {
		tabuleiro=new Tabuleiro(8, 8);
		inicioDaPartida();
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
	
	//Colocando o local das peças no inicio da partida.
	private void inicioDaPartida() {
		tabuleiro. localPeca(new Torre(tabuleiro, Cor.WHITE), new Posicoes(2, 1));
		tabuleiro.localPeca(new Rei(tabuleiro, Cor.BLACK),new Posicoes(0, 4));
		tabuleiro.localPeca(new Rei(tabuleiro, Cor.WHITE),new Posicoes(7, 4));

	}
}
