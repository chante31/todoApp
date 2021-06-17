/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.chantal;

import fr.ldnr.chantal.mavenproject1.PresentationChargeur;

/**
 *
 * @author stag
 */
public class AccueilMain {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans notre package ");
        PresentationChargeur pg =new PresentationChargeur();
        System.out.println(pg.getPresentation());
       
    }
    
}
