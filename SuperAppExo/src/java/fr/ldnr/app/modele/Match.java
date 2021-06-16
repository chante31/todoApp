/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app.modele;

import java.time.LocalDateTime;

/**
 *
 * @author stag
 */
public class Match implements Comparable<Match>{
    private Pays pays1;
    private int scorePays1;
    private Pays pays2;
    private int scorePays2;
    private LocalDateTime dateMatch = null;

    public Match() {
    }

    public Match(Pays pays1, int scorePays1, Pays pays2, int scorePays2) {
        this.pays1 = pays1;
        this.scorePays1 = scorePays1;
        this.pays2 = pays2;
        this.scorePays2 = scorePays2;
    }
    

    public Pays getPays1() {
        return pays1;
    }

    public void setPays1(Pays pays1) {
        this.pays1 = pays1;
    }

    public int getScorePays1() {
        return scorePays1;
    }

    public void setScorePays1(int scorePays1) {
        this.scorePays1 = scorePays1;
    }

    public Pays getPays2() {
        return pays2;
    }

    public void setPays2(Pays pays2) {
        this.pays2 = pays2;
    }

    public int getScorePays2() {
        return scorePays2;
    }

    public void setScorePays2(int scorePays2) {
        this.scorePays2 = scorePays2;
    }

    public LocalDateTime getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(LocalDateTime dateMatch) {
        this.dateMatch = dateMatch;
    }

    @Override
    public String toString() {
        return "Match{" + "pays1=" + pays1 + ", scorePays1=" + scorePays1 + ", pays2=" + pays2 + ", scorePays2=" + scorePays2 + ", dateMatch=" + dateMatch + '}';
    }

    @Override
    public int compareTo(Match m) {
        return this.getDateMatch().compareTo(m.getDateMatch());
    }
    
    
}
