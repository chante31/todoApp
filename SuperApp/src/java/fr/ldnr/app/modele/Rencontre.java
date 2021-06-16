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
public class Rencontre {
    private List<MatchModel>list = new ArrayList<>();

  
    

    public Rencontre() {
    }
    
    public void addMatch(MatchModel m){
        list.add(m);
        Collections.sort(list);
    
    } 
      public List<MatchModel> getList() {
        return list;
    }

    public void setList(List<MatchModel> list) {
        this.list = list;
    }
}
