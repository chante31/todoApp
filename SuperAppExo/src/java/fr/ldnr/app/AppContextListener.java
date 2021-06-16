/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app;

import fr.ldnr.app.modele.Competiteurs;
import fr.ldnr.app.modele.Match;
import fr.ldnr.app.modele.Pays;
import fr.ldnr.app.modele.Tournoi;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author vincent
 */
@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        
    	ServletContext ctx = servletContextEvent.getServletContext();
    	// String url = ctx.getInitParameter("nomDuInitParam");

        Competiteurs competiteurs = new Competiteurs();
        competiteurs.add(new Pays("Suisse", "/img/flags/suisse.png"));
        competiteurs.add(new Pays("Pays de Galles", "/img/flags/pays-de-galles.png"));
        competiteurs.add(new Pays("Turquie", "/img/flags/turquie.png"));
        competiteurs.add(new Pays("Italie", "/img/flags/italie.png"));
        competiteurs.add(new Pays("Belgique", "/img/flags/belgique.png"));
        competiteurs.add(new Pays("Russie", "/img/flags/russie.png"));
        competiteurs.add(new Pays("Danemark", "/img/flags/danemark.png"));
        competiteurs.add(new Pays("Finlande", "/img/flags/finlande.png"));
        competiteurs.add(new Pays("Ukraine", "/img/flags/ukraine.png"));
        competiteurs.add(new Pays("Autriche", "/img/flags/autriche.png"));
        competiteurs.add(new Pays("Macédoine du Nord", "/img/flags/macedoine-du-nord.png"));
        competiteurs.add(new Pays("Pays-Bas", "/img/flags/pays-bas.png"));
        competiteurs.add(new Pays("Croatie", "/img/flags/croatie.png"));
        competiteurs.add(new Pays("Angleterre", "/img/flags/angleterre.png"));
        competiteurs.add(new Pays("République Tchèque", "/img/flags/republique-tcheque.png"));
        competiteurs.add(new Pays("Ecosse", "/img/flags/ecosse.png"));
        competiteurs.add(new Pays("Suède", "/img/flags/suede.png"));
        competiteurs.add(new Pays("Espagne", "/img/flags/espagne.png"));
        competiteurs.add(new Pays("Pologne", "/img/flags/pologne.png"));
        competiteurs.add(new Pays("Slovaquie", "/img/flags/slovaquie.png"));
        competiteurs.add(new Pays("France", "/img/flags/france.png"));
        competiteurs.add(new Pays("Allemagne", "/img/flags/allemagne.png"));
        competiteurs.add(new Pays("Hongrie", "/img/flags/hongrie.png"));
        competiteurs.add(new Pays("Portugal", "/img/flags/portugal.png"));

        Match matchTest = new Match(new Pays("Allemagne", "/img/flags/allemagne.png"),1,new Pays("France", "/img/flags/france.png"),3);
        Tournoi tournoi = new Tournoi();
        tournoi.add(matchTest);
        
        ctx.setAttribute("competiteurs", competiteurs);
        ctx.setAttribute("matchTest", matchTest);
        ctx.setAttribute("tournoi", tournoi);
    	
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    	
    }
	
 
}
