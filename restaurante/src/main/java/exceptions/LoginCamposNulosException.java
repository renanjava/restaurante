package exceptions;

public class LoginCamposNulosException extends Exception{
	
	public LoginCamposNulosException() {
		super("Login ou Senha em branco");
	}
}
