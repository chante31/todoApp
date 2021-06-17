package fr.ldnr.app.modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un pays qui peut participer.
 * @author vincent
 */
public class Pays implements Comparable {
    
    private String nom;
    private String drapeauUrl;
    

    public Pays(String nom, String drapeauUrl) {
        this.nom = nom;
        this.drapeauUrl = drapeauUrl;
    }

    public Pays() {
    }
    
    public String getNom() {
        return nom;
    }

    public String getDrapeauUrl() {
        return drapeauUrl;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDrapeauUrl(String drapeauUrl) {
        this.drapeauUrl = drapeauUrl;
    }

    @Override
    public int compareTo(Object pays) {
        return nom.compareTo(((Pays) pays).getNom());
    }
    
    
}
