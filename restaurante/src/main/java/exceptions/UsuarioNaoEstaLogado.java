package exceptions;

public class UsuarioNaoEstaLogado extends Exception{
	
	public UsuarioNaoEstaLogado() {
		super("Você não está logado, realize o login");
	}
}
