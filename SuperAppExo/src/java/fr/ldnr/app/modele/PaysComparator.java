package fr.ldnr.app.modele;

import java.util.Comparator;

/**
 * Autre facon de trier les Pays
 * @author vincent
 */
public class PaysComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Pays p1 = (Pays) o1;
        Pays p2 = (Pays) o2;
        return p1.getNomPays().compareTo(p2.getNomPays());
    }

}
