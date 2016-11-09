package fr.demos.formation.web;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
	String ERR = "erreurs";
	String RES = "resultat";

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String resultat;
		Map<String,String> erreurs = new HashMap<String,String>();

		// TODO Auto-generated method stub
		String action = request.getParameter("valider");

		if (action != null && action.equals("Valider")) {

			String nom = request.getParameter(CHAMP_NOM);
			String prenom = request.getParameter(CHAMP_PRENOM);
			String age = request.getParameter(CHAMP_AGE);

			try {
				validationNom(nom);
			} catch (Exception e) {

				String er1 = e.getMessage();
				erreurs.put(CHAMP_NOM,er1);

			}

			try {
				validationPrenom(prenom);
			} catch (Exception e) {

				String er2 = e.getMessage();
				erreurs.put(CHAMP_PRENOM,er2);

			}

			try {
				validationAge(age);
			} catch (Exception e) {

				String er3 = e.getMessage();
				erreurs.put(CHAMP_AGE,er3);

			}

		}

		if (erreurs.isEmpty()) {

			resultat = "OK: Succes de l'inscription";
			request.setAttribute(ERR, erreurs);
			request.setAttribute(RES, resultat);

			
			RequestDispatcher rd = request.getRequestDispatcher("/OK.jsp");
			rd.forward(request, response);
			return;
			
			
		} else {

			resultat = "KO: Echec de l'inscription";
			request.setAttribute(ERR, erreurs);
			request.setAttribute(RES, resultat);

			
			RequestDispatcher rd = request.getRequestDispatcher("/SaisieInscription.jsp");
			rd.forward(request, response);
			return;
		}
		
	}

	private void validationNom(String nom) throws Exception {

		if (nom != null && nom.trim().length() < 1) {

			throw new Exception("Le champ nom d'utilisateur doit contenir au moins 1 caractère.");

		}
	}

	private void validationPrenom(String prenom) throws Exception {

		if (prenom != null && prenom.trim().length() < 1) {

			throw new Exception("Le champ prénom d'utilisateur doit contenir au moins 1 caractère.");

		}
	}

	private void validationAge(String age) throws Exception {
			
			if (age != null && age.trim().length() < 1) {

			throw new Exception("Le champ âge doit contenir au moins 1 caractère.");

		}
		
		
			int monAge=0;
			try{
				monAge=Integer.parseInt(age);
				
			}catch(NumberFormatException e){
				throw new Exception("L'âge doit être un entier");
			}
			
			
			if (age != null && monAge < 0) {

				throw new Exception("L'âge doit être positif");
	
		}
		}
		

}
