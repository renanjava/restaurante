package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

@WebServlet(urlPatterns = {"/principal/ServletCadastro","/ServletCadastro"})
public class ServletCadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCadastroController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		ModelLogin modelLogin = new ModelLogin();
		modelLogin.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null);
		modelLogin.setNome(request.getParameter("nome"));
		modelLogin.setEmail(request.getParameter("email"));
		modelLogin.setLogin(request.getParameter("login"));
		modelLogin.setSenha(request.getParameter("senha"));
		
		RequestDispatcher redireciona = request.getRequestDispatcher("principal/cadastro-usuario.jsp");
		redireciona.forward(request,response);
	}
}
