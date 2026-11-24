package it.exolab.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.exolab.dao.UtenteDao;
import it.exolab.model.Utente;
import it.exolab.service.UtenteService;

/**
 * Servlet implementation class RegistrazioneServlet
 */
@WebServlet("/registrazione")
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private UtenteService service = new UtenteService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrazioneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		request.setAttribute("nomeDoGet", nome);
		request.setAttribute("emailDoGet", email);
		request.getRequestDispatcher("/riepilogo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setAttribute("nomeDoPost", request.getParameter("nome"));
//		request.setAttribute("emailDoPost", request.getParameter("email"));
//		request.getRequestDispatcher("/riepilogo.jsp").forward(request, response);
//	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUtente = request.getParameter("nome");
		String emailUtente = request.getParameter("email");
		request.setAttribute("nomePost", nomeUtente);
		request.setAttribute("emailPost", emailUtente);
		
		Utente utente = new Utente();
		utente.setNome(nomeUtente);
		utente.setEmail(emailUtente);
		
		if(service.emailEsiste(emailUtente)) {
			request.setAttribute("errore", "email già esistente !");
			request.getRequestDispatcher("registrazione.jsp").forward(request, response);
		}
		else {
			UtenteDao dao = new UtenteDao();
			dao.insert(utente);
		
			request.setAttribute("user", utente);
			request.getRequestDispatcher("conferma-registrazione.jsp").forward(request, response);
		}

	}
	

}
