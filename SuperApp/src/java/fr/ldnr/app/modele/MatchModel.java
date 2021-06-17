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
public class MatchModel implements Comparable <MatchModel>{
    private LocalDateTime dateDuMatch = null;

    public LocalDateTime getDateDuMatch() {
        return dateDuMatch;
    }

    public void setDateDuMatch(LocalDateTime dateDuMatch) {
        this.dateDuMatch = dateDuMatch;
    }
   private Pays pays1;
   private Pays pays2;
    private int scorePays1;
   private int scorePays2 ;

    public Pays getPays1() {
        return pays1;
    }

    public void setPays1(Pays pays1) {
        this.pays1 = pays1;
    }

    public Pays getPays2() {
        return pays2;
    }

    public void setPays2(Pays pays2) {
        this.pays2 = pays2;
    }

    public int getScorePays1() {
        return scorePays1;
    }

    public void setScorePays1(int scorePays1) {
        this.scorePays1 = scorePays1;
    }

    public int getScorePays2() {
        return scorePays2;
    }

    public void setScorePays2(int scorePays2) {
        this.scorePays2 = scorePays2;
    }

    public MatchModel(Pays pays1, Pays pays2, int scorePays1, int scorePays2) {
       
        this.pays1 = pays1;
        this.pays2 = pays2;
        this.scorePays1 = scorePays1;
        this.scorePays2 = scorePays2;
    }
  

    public MatchModel() {
    }
 
    @Override
    public int compareTo(MatchModel m) {
        return this.getDateDuMatch().compareTo(m.getDateDuMatch());
    }
    
}
