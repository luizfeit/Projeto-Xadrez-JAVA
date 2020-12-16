package xadrex;

import tabuleiro.Pecas;
import tabuleiro.Posicoes;
import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroException;
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
	
	public PecaDeXadrex perfomaceMovimentoXadrex(XadrexPosicao origemPosicao, XadrexPosicao posicaoDeDestino) {
		Posicoes origem= origemPosicao.toPosicoes(); 
		Posicoes destino= posicaoDeDestino.toPosicoes();
		validarFontePosicao(origem);
		Pecas capturarPeca=andar(origem,destino);
		return (PecaDeXadrex)capturarPeca;
	}
	
	private Pecas andar(Posicoes fonte, Posicoes destino) {
		if(tabuleiro.localDaPeca(destino)) {
			throw new TabuleiroException(" Já existe uma peça nessa posição "+destino);
		}
		Pecas p=tabuleiro.removerPecas(fonte);
		Pecas capturarPecas= tabuleiro.removerPecas(destino);
		tabuleiro.localizacaoPeca(p,destino);
		return capturarPecas;
	}
	
	private void validarFontePosicao(Posicoes posicoes) {
		if (!tabuleiro.localDaPeca(posicoes)) {
			throw new XadrexException("Não existe peça na posição escolhida");
		}
		if(!tabuleiro.pecas(posicoes).seTemPeloMenosAlgumMovimento()) {
			throw new XadrexException("Não existe movimentos específicos para a peça escolhida");
		}
	}
	
	private void novoLugarPeca(char coluna,int linha,PecaDeXadrex pecas) {
		tabuleiro.localizacaoPeca(pecas,new XadrexPosicao(coluna, linha).toPosicoes());	
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
