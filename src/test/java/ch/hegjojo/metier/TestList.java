package ch.hegjojo.metier;

import ch.hegjojo.metier.ListePersonnes;
import ch.hegjojo.base.PersonneDao;
import ch.hegjojo.domaine.Personne;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathanraillard
 */
public class TestList {
    
    ListePersonnes lstEmp;
    Personne emp;
    
    @BeforeTest
    protected void listesTest(){
        lstEmp = new ListePersonnes(PersonneDao.getListePersonnes());
        emp = new Personne("Rai", "Jo",12);
    }
    
    @Test
    public void listesImportTest(){
        assertTrue(lstEmp!=null);
    }
    
    @Test
    public void listesGetValid(){
        Personne pers = new Personne("Coralie","Raillard",0);
        lstEmp.add(pers, lstEmp.size());
        lstEmp.setPos(lstEmp.size()-1);
        assertEquals((lstEmp.get(lstEmp.size()-1)), pers);
    }
    
    @Test
    public void listesGetInvalid(){
        Personne pers = (Personne)lstEmp.get(lstEmp.size()+1);
        assertNull(pers);
    }

    @Test
    public void listesGetInvalid2(){
        Personne pers = (Personne)lstEmp.get(-1);
        assertNull(pers);
    }
    
    @Test
    public void testPos(){
        Personne pers = new Personne("Jonathan","Raillard",0);
        lstEmp.add(pers, lstEmp.size());
        lstEmp.setPos(lstEmp.size()-1);
        assertEquals(lstEmp.getCourant(), pers);
    }
    
    @Test
    public void deleteTest(){
        Personne pers = (Personne)lstEmp.get(lstEmp.getPos());
        lstEmp.delCourant();
        assertFalse(lstEmp.contains(pers));
    }
    
    @Test
    public void containsTest(){
        lstEmp.add(emp, lstEmp.size());
        assertTrue(lstEmp.contains(emp));
    }
    
}
