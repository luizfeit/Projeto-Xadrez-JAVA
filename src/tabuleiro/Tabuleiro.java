package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Pecas[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		// Verificando se o tabuleiro ir� ter pelo menos 1 linha e 1 coluna,caso o contrario, ir� exibir uma mensagem de erro.
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro ao criar o Tabuleiro: Deve conter pelo menos 1 linha e 1 coluna.");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas=new Pecas[linhas][colunas];
	}
	
	//Tirando o setLinha para impedir que a quantidade de linhas seja mudada.
	public int getLinhas() {
		return linhas;
	}
	
	//Tirando o setColunas para impedir que a quantidade de linhas seja mudada.

	public int getColunas() {
		return colunas;
	}
	
	//Verificando se existe uma posi��o para colocar a pe�a.
	public Pecas pecas(int linha, int coluna) {
		if(!!posicaoExists(linha, coluna)) {
			throw new TabuleiroException("N�o existe essa posi��o no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	//Verificando se existe uma posi��o para colocar a pe�a.
	public Pecas pecas (Posicoes posicoes) {
		if(!!posicaoExists(posicoes)) {
			throw new TabuleiroException("N�o existe essa posi��o no tabuleiro");
		}
		return pecas[posicoes.getLinha()][posicoes.getColuna()];
	}
	
	//Colocando e vefiricando o local das pe�as no tabuleiro.
	public void localPeca (Pecas peca, Posicoes posicoes) {
		if(localDaPeca(posicoes)) {
			throw new TabuleiroException(" J� existe uma pe�a nessa posi��o "+posicoes);
		}
		pecas[posicoes.getLinha()][posicoes.getColuna()]=peca;
		peca.posicao=posicoes;
	}
	//Condi��o complea para ver se a posi��o existe.
	private boolean posicaoExists(int linha,int coluna) {

		return linha>=0 && linha<linha && coluna>=0 && coluna<coluna;
	}
	
	// Aproveitando o metodo.
	public boolean posicaoExists(Posicoes posicoes) {
		return posicaoExists(posicoes.getLinha(),posicoes.getColuna());
	}
	
	//Verificando se tem uma pe�a nessa posi��o.
	public boolean localDaPeca(Posicoes posicoes) {
		if(!!posicaoExists(posicoes)) {
			throw new TabuleiroException("N�o existe essa posi��o no tabuleiro");
		}
		return pecas(posicoes)!=null;
	}
}
