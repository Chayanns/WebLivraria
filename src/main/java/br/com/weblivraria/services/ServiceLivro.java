package br.com.weblivraria.services;

import java.io.IOException;

import br.com.weblivraria.dao.DAOLivro;
import br.com.weblivraria.dominio.Livro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServiceLivro
 */
public class ServiceLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceLivro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("txtTitulo");
		String genero = request.getParameter("cboGenero");
		String sinopse = request.getParameter("txtSinopse");
		String autor = request.getParameter("txtAutor");
		String preco = request.getParameter("txtPreco");
		String capa = request.getParameter("txtCapa");
		
		response.getWriter().append(titulo+" - "+genero);
		//instância da classe livro
		Livro lv = new Livro();
		//passando os dados para o objeto
		lv.setTitulo(titulo);
		lv.setGenero(genero);
		lv.setSinopse(sinopse);
		lv.setAutor(autor);
		lv.setPreco(Double.parseDouble(preco));
		lv.setCapa(capa);
		//instância da camada dao para efetuar o cadastro do livro
		DAOLivro dv = new DAOLivro();
		
		String msg=dv.Cadastrar(lv);
		if(msg.equals("Cadastro realizado")){
			response.sendRedirect("confirmacao.html");
		}
		else {
			response.getWriter().append(msg);
		}
	}

}
