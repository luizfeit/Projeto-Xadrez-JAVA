package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Pecas[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		// Verificando se o tabuleiro irá ter pelo menos 1 linha e 1 coluna,caso o contrario, irá exibir uma mensagem de erro.
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
	
	//Verificando se existe uma posição para colocar a peça.
	public Pecas pecas(int linha, int coluna) {
		if(!!posicaoExists(linha, coluna)) {
			throw new TabuleiroException("Não existe essa posição no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	//Verificando se existe uma posição para colocar a peça.
	public Pecas pecas (Posicoes posicoes) {
		if(!!posicaoExists(posicoes)) {
			throw new TabuleiroException("Não existe essa posição no tabuleiro");
		}
		return pecas[posicoes.getLinha()][posicoes.getColuna()];
	}
	
	//Colocando e vefiricando o local das peças no tabuleiro.
	public void localPeca (Pecas peca, Posicoes posicoes) {
		if(localDaPeca(posicoes)) {
			throw new TabuleiroException(" Já existe uma peça nessa posição "+posicoes);
		}
		pecas[posicoes.getLinha()][posicoes.getColuna()]=peca;
		peca.posicao=posicoes;
	}
	//Condição complea para ver se a posição existe.
	private boolean posicaoExists(int linha,int coluna) {

		return linha>=0 && linha<linha && coluna>=0 && coluna<coluna;
	}
	
	// Aproveitando o metodo.
	public boolean posicaoExists(Posicoes posicoes) {
		return posicaoExists(posicoes.getLinha(),posicoes.getColuna());
	}
	
	//Verificando se tem uma peça nessa posição.
	public boolean localDaPeca(Posicoes posicoes) {
		if(!!posicaoExists(posicoes)) {
			throw new TabuleiroException("Não existe essa posição no tabuleiro");
		}
		return pecas(posicoes)!=null;
	}
}
