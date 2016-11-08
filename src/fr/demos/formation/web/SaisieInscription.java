package fr.demos.formation.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaisieInscription
 */
@WebServlet("/SaisieInscription")
public class SaisieInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String CHAMP_NOM = "nom";
	String CHAMP_PRENOM = "prenom";
	String CHAMP_AGE = "age";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaisieInscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/SaisieInscription.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String action = request.getParameter("valider");
		if (action != null && action.equals("Valider"))
		{
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String stringAge = request.getParameter("age");
			int reference = 0;
		try {
			
			reference = Integer.parseInt(stringAge);
		} catch (NumberFormatException ex){
		// gestion erreur conversion
		}
		if (nom == null || nom.equals("")) {
		
			
			
			
		}
		}
	// si erreurs
	// en ajoutant transfert des messages d'erreur

	RequestDispatcher rd = request.getRequestDispatcher("/SaisieInscription.jsp");
	rd.forward(request,response);
	return;
	// sinon appel de la vue suivante
}

}
