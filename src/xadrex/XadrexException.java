package xadrex;

import tabuleiro.TabuleiroException;

public class XadrexException extends TabuleiroException {

	private static final long serialVersionUID = 1L;
	
	//Personalizando a exce��o 
	public XadrexException (String msg) {
		super(msg);
	}
}
