package xadrex;

public class XadrexException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//Personalizando a exce��o 
	public XadrexException (String msg) {
		super(msg);
	}
}
