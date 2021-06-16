/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app.modele;

/**
 *
 * @author stag
 */
public class Pays implements Comparable<Pays>{
    private String nomPays;
    private String urlDrapeau;

    public Pays(String nomPays, String urlDrapeau) {
        this.nomPays = nomPays;
        this.urlDrapeau = urlDrapeau;
    }

    public Pays() {
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public String getUrlDrapeau() {
        return urlDrapeau;
    }

    public void setUrlDrapeau(String urlDrapeau) {
        this.urlDrapeau = urlDrapeau;
    }

    @Override
    public String toString() {
        return "Pays{" + nomPays + '}';
    }

    @Override
    public int compareTo(Pays p) {
        return (this.getNomPays().compareTo(p.getNomPays()));
    }
    
    
}
