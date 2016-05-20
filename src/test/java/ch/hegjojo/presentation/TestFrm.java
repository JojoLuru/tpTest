package ch.hegjojo.presentation;

import ch.hegjojo.presentation.FrmMain;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNotNull;

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

        
    @BeforeTest
    protected void createFrm(){
        frm = new FrmMain();
    }
    
    @Test
    public void instanceFrmTest(){
        assertNotNull(frm);
    }
    
}
