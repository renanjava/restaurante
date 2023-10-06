package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

import java.io.IOException;

import exceptions.LoginCamposNulosException;
import exceptions.ObjetoNaoEncontradoException;

@WebServlet(urlPatterns = { "/principal/ServletLogin", "/ServletLogin" })
public class ServletLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("campoUsuario");
		String senha = request.getParameter("campoSenha");
		String url = request.getParameter("url");

		try {

			if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {
				ModelLogin usuario = new ModelLogin();
				usuario.setLogin(login);
				usuario.setSenha(senha);

				if (usuario.getLogin().equals("admin") && usuario.getSenha().equals("admin")) {

					request.getSession().setAttribute("usuario", usuario);

					if (url == null || url.equals("null")) {
						url = "/principal/principal.jsp";
					}

					RequestDispatcher redireciona = request.getRequestDispatcher(url);
					redireciona.forward(request, response);

				} else 
					throw new ObjetoNaoEncontradoException();
				
			} else 
				throw new LoginCamposNulosException();
		
		} catch (LoginCamposNulosException | ObjetoNaoEncontradoException e1) {
			
			RequestDispatcher redireciona = request.getRequestDispatcher("principal/tela_erro.jsp");
			request.setAttribute("msg", "Erro: "+e1.getMessage());
			redireciona.forward(request, response);
			
		}
	}

}
