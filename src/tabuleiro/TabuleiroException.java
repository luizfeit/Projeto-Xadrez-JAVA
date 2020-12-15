package tabuleiro;

public class TabuleiroException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	//Personalzando a exceção.
	public TabuleiroException(String msg) {
		super(msg);
	}
}
