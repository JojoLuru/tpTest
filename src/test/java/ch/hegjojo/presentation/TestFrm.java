package ch.hegjojo.presentation;

import ch.hegjojo.domaine.Personne;
import ch.hegjojo.metier.ListePersonnes;
import ch.hegjojo.presentation.FrmMain;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.testng.annotations.*;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.BeforeMethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathanraillard
 */
public class TestFrm {
    
    FrmMain frm;
    
    /*@BeforeMethod
    public void listerEmploye(){
        ListePersonnes mockedListe = mock(ch.hegjojo.metier.ListePersonnes.class);
        Personne mockedPersonne = mock(ch.hegjojo.domaine.Personne.class);
        when(mockedPersonne.toString()).thenReturn("PersonneTest");
        when(mockedListe.getCourant()).thenReturn(mockedPersonne);
        when(mockedListe.size()).thenReturn(1);
        frm = new FrmMain();
      }*/
      
    
    @BeforeTest
    public void getFrm(){
        frm = new FrmMain();
    }
    
    
    @Test
    public void instanceFrmTest(){
        assertNotNull(frm);
    }
    
}
