/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app.modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Représente un pays particpant à la compétition.
 * @author vincent
 */
public class Competiteurs {
    
    private final int NB_COMPETITEURS_MAX = 32;
    private int nbCompetiteurs = 0;
    
    private Map<String, Pays> paysM = new TreeMap<>();
    private List<Pays> paysL  = new ArrayList<>();
    private Set<Pays> paysS  = new HashSet<>();
    private Pays[] paysT  = new Pays[NB_COMPETITEURS_MAX];

    public Competiteurs() {
    }
    
    
    public void add(Pays pays) {
        paysM.put(pays.getNom(), pays);
        paysL.add(pays);
        paysS.add(pays);
        paysT[nbCompetiteurs++] = pays;
       
    }

    

    public Map<String, Pays> getPaysM() {
        return paysM;
    }

    public List<Pays> getPaysL() {
        return paysL;
    }

    public Set<Pays> getPaysS() {
        return paysS;
    }

    public Pays[] getPaysT() {
        return paysT;
    }

    public void setPaysM(Map<String, Pays> aPaysM) {
        paysM = aPaysM;
    }

    public void setPaysL(List<Pays> aPaysL) {
        paysL = aPaysL;
    }

    public void setPaysS(Set<Pays> aPaysS) {
        paysS = aPaysS;
    }

    public void setPaysT(Pays[] aPaysT) {
        paysT = aPaysT;
    }

    public int getNbCompetiteurs() {
        return nbCompetiteurs;
    }

    public int getNB_COMPETITEURS_MAX() {
        return NB_COMPETITEURS_MAX;
    }
    
    
    
}
