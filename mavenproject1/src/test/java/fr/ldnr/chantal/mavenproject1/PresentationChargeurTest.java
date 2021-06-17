/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.chantal.mavenproject1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 *
 * @author stag
 */
public class PresentationChargeurTest {
    @Test
    public void testGetPresentation(){
        PresentationChargeur pg = new PresentationChargeur();
        String obtenu =pg.getPresentation();
        Assertions.assertTrue(obtenu.length()>50);
       
       
    
    }
    
}
