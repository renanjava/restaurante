package exceptions;

public class ObjetoSemDadosException extends Exception{
	
	public ObjetoSemDadosException() {
		super("O objeto informado não tem dados");
	}
}
