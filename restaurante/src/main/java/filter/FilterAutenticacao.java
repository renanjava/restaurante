package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import connection.SingleConnection;
import exceptions.UsuarioNaoEstaLogado;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import model.ModelLogin;

@WebFilter(urlPatterns = { "/principal/*" })
public class FilterAutenticacao extends HttpFilter {

	private static Connection conexao;

	public FilterAutenticacao() {
		super();
	}

	public void destroy() {
		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest requisicao = (HttpServletRequest) request;
		HttpSession sessao = requisicao.getSession();

		ModelLogin usuarioLogado = (ModelLogin) sessao.getAttribute("usuario");
		String urlAutenticar = requisicao.getServletPath();
		
		try {

			if ((usuarioLogado == null
					|| (usuarioLogado.getLogin().equals("null") || usuarioLogado.getSenha().equals("null")))
					&& !urlAutenticar.equals("/principal/ServletLogin")) 
				
				throw new UsuarioNaoEstaLogado();

			else 
				chain.doFilter(request, response);
			
			
			conexao.commit();
			
		} catch (UsuarioNaoEstaLogado e) {
			
			RequestDispatcher redireciona = request.getRequestDispatcher("tela_erro.jsp?=" + urlAutenticar);
			request.setAttribute("msg", e.getMessage());
			redireciona.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conexao.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		conexao = SingleConnection.getConnection();
	}

}
