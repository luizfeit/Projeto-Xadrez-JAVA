package xadrex;

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
	
	private void novoLugarPeca(char coluna,int linha,PecaDeXadrex pecas) {
		tabuleiro.localPeca(pecas,new XadrexPosicao(coluna, linha).toPosicoes());	
	}
	
	//Colocando o local das peças no inicio da partida.
	private void inicioDaPartida() {
		novoLugarPeca('c', 1, new Torre(tabuleiro, Cor.WHITE));
		novoLugarPeca('c', 2, new Torre(tabuleiro, Cor.WHITE));
		novoLugarPeca('d', 2, new Torre(tabuleiro, Cor.WHITE));
		novoLugarPeca('e', 2, new Torre(tabuleiro, Cor.WHITE));
		novoLugarPeca('e', 1, new Torre(tabuleiro,Cor.WHITE));
		novoLugarPeca('d', 1, new Rei(tabuleiro,Cor.WHITE));
		
		novoLugarPeca('c', 7, new Torre(tabuleiro,Cor.BLACK));
		novoLugarPeca('c', 8, new Torre(tabuleiro,Cor.BLACK));
		novoLugarPeca('d', 7, new Torre(tabuleiro,Cor.BLACK));
		novoLugarPeca('e', 7, new Torre(tabuleiro,Cor.BLACK));
		novoLugarPeca('e', 8, new Torre(tabuleiro,Cor.BLACK));
		novoLugarPeca('d', 8, new Rei(tabuleiro,Cor.BLACK));


	}
}
