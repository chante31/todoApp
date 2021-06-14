/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.app.modele;

import java.util.Comparator;


/**
 *
 * @author stag
 */
public class PaysComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Pays p1 = (Pays) o1;
        Pays p2 = (Pays) o2;
        return p1.getNom().compareTo(p2.getNom());
    }

}

