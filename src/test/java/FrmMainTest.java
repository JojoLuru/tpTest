/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domaine.Personne;
import metier.ListePersonnes;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import presentation.FrmMain;

/**
 *
 * @author jonathanraillard
 */

public class FrmMainTest {
        
    FrmMain frm;
    
    @BeforeTest
    private void createFrm(){
        frm = new FrmMain();
    } 
    
    @Test
    private void instanceFrmTest(){
        assertTrue(frm != null);
    }
    
    @Test
    private void selectTest(){
        
    }

}
