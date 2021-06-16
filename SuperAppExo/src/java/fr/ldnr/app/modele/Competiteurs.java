/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app.modele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author stag
 */
public class Competiteurs {
    private final int NB_MAX_COMPETITEURS = 32;
    private int nbCompetiteurs = 0;
    
    private Map<String,Pays> map = new TreeMap<>();
    private List<Pays> list = new ArrayList<>();
    private Set<Pays> set = new HashSet<>();
    private Pays[] tableau = new Pays[NB_MAX_COMPETITEURS];

    public Competiteurs() {
    }
    public void add(Pays p){
        map.put(p.getNomPays(), p);
        list.add(p);
        set.add(p);
        tableau[nbCompetiteurs++]= p;
    }

    public Map<String, Pays> getMap() {
        return map;
    }

    public void setMap(Map<String, Pays> map) {
        this.map = map;
    }

    public List<Pays> getList() {
        return list;
    }

    public void setList(List<Pays> list) {
        this.list = list;
    }

    public Set<Pays> getSet() {
        return set;
    }

    public void setSet(Set<Pays> set) {
        this.set = set;
    }

    public Pays[] getTableau() {
        return tableau;
    }

    public void setTableau(Pays[] tableau) {
        this.tableau = tableau;
    }

    public int getNB_MAX_COMPETITEURS() {
        return NB_MAX_COMPETITEURS;
    }

    public int getNbCompetiteurs() {
        return nbCompetiteurs;
    }
    
}
    
