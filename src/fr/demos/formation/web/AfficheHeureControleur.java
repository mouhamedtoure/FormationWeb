package fr.demos.formation.web;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AfficheHeureControleur
 */
@WebServlet("/AfficheHeure")
public class AfficheHeureControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheHeureControleur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// code simpliste: le contrôleur n'appelle pas vraiment de code métier
		LocalTime time= LocalTime.now();
		// passage de données entre contrôleur et vue 
		// definition du modèle
		request.setAttribute("heureActuelle", time);
		// appel de la jsp
		RequestDispatcher rd=request.getRequestDispatcher("/heureVue.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
