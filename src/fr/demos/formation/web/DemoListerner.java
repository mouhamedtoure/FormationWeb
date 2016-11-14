package fr.demos.formation.web;

import java.time.LocalTime;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class DemoListerner
 *
 */
@WebListener
public class DemoListerner implements ServletContextListener, HttpSessionListener {

	
	private Compteur compteur= new Compteur();
    /**
     * Default constructor. 
     */
    public DemoListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    // Création de session (request.getSession() la première fois)
    
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	LocalTime heureConnexion = LocalTime.now();
    	arg0.getSession().setAttribute("heure", heureConnexion);
    	
    	// Compteur +1
    	compteur.incremente();
  
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    // timeout de session ou session.invalidate()
    
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	//compteur -1
    	compteur.decremente();

    
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    
    // Arrêt de l'appli (arrêt de Tomcat)
    
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    
    // Démarrage de l'appli
    
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	// Compteur à 0
    	
    	arg0.getServletContext().setAttribute("compteur",compteur);
    }
	
}
