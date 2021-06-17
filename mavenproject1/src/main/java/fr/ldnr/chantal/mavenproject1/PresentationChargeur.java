/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.chantal.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author stag
 */
public class PresentationChargeur {

    public String getPresentation() {
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("presentation.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String ligne, resultat = "";
            while ((ligne = br.readLine()) != null) {
                resultat += ligne + "\n";

            }
            is.close();
            return resultat;

        } catch (IOException ex) {
            System.err.println("Erreur :" + ex);
             return null;
        }
       

    }

}
