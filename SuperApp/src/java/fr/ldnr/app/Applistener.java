/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app;
import fr.ldnr.app.modele.Competiteurs;
import fr.ldnr.app.modele.MatchModel;
import fr.ldnr.app.modele.Pays;
import fr.ldnr.app.modele.Rencontre;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * Web application lifecycle listener.
 *
 * @author stag
 */
public class Applistener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent evenement) {
    ServletContext ctx=evenement.getServletContext();
    
    
        Competiteurs competiteurs = new Competiteurs();
        competiteurs.add(new Pays("Suisse", "/images/drapeau/suisse.png"));
        competiteurs.add(new Pays("Pays de Galles", "/images/drapeau/pays-de-galles.png"));
        competiteurs.add(new Pays("Turquie", "/images/drapeau/turquie.png"));
        competiteurs.add(new Pays("Italie", "/images/drapeau/italie.png"));
        competiteurs.add(new Pays("Belgique", "/images/drapeau/belgique.png"));
        competiteurs.add(new Pays("Russie", "/images/drapeau/russie.png"));
        competiteurs.add(new Pays("Danemark", "/images/drapeau/danemark.png"));
        competiteurs.add(new Pays("Finlande", "/images/drapeau/finlande.png"));
        competiteurs.add(new Pays("Ukraine", "/images/drapeau/ukraine.png"));
        competiteurs.add(new Pays("Autriche", "/images/drapeau/autriche.png"));
        competiteurs.add(new Pays("Macédoine du Nord", "/images/drapeau/macedoine-du-nord.png"));
        competiteurs.add(new Pays("Pays-Bas", "/images/drapeau/pays-bas.png"));
        competiteurs.add(new Pays("Croatie", "/images/drapeau/croatie.png"));
        competiteurs.add(new Pays("Angleterre", "/images/drapeau/angleterre.png"));
        competiteurs.add(new Pays("République Tchèque", "/images/drapeau/republique-tcheque.png"));
        competiteurs.add(new Pays("Ecosse", "/images/drapeau/ecosse.png"));
        competiteurs.add(new Pays("Suède", "/images/drapeau/suede.png"));
        competiteurs.add(new Pays("Espagne", "/images/drapeau/espagne.png"));
        competiteurs.add(new Pays("Pologne", "/images/drapeau/pologne.png"));
        competiteurs.add(new Pays("Slovaquie", "/images/drapeau/slovaquie.png"));
        competiteurs.add(new Pays("France", "/images/drapeau/france.png"));
        competiteurs.add(new Pays("Allemagne", "/images/drapeau/allemagne.png"));
        competiteurs.add(new Pays("Hongrie", "/images/drapeau/hongrie.png"));
        competiteurs.add(new Pays("Portugal", "/images/drapeau/portugal.png"));
        
       
        MatchModel match= new MatchModel(new Pays("Italie", "/images/drapeau/italie.png"),new Pays("Suisse", "/images/drapeau/suisse.png"),1,3);
        MatchModel match1= new MatchModel(new Pays("Turquie", "/images/drapeau/turquie.png"),new Pays("Italie", "/images/drapeau/italie.png"),0,0);
         MatchModel match2= new MatchModel(new Pays("Danemark", "/images/drapeau/danemark.png"),new Pays("Finlande", "/images/drapeau/finlande.png"),0,0);
        
        
        Rencontre rencontre = new Rencontre();
        rencontre.addMatch(match);
        rencontre.addMatch(match1);
        rencontre.addMatch(match2);
        
        ctx.setAttribute("competiteurs", competiteurs);
        ctx.setAttribute("rencontre", rencontre);
        
  
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent evenement) {
        
 }
}
