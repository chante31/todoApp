/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app.modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author stag
 */
public class Tournoi {
    private List<Match> list = new ArrayList<>();
    private int nbMatch = 0;

    public Tournoi() {
    }

    public void add(Match m){
        nbMatch++;
        list.add(m);
        Collections.sort(list);
    }
    
    public List<Match> getList() {
        return list;
    }

    public void setList(List<Match> list) {
        this.list = list;
    }

    public int getNbMatch() {
        return nbMatch;
    }
    
}
