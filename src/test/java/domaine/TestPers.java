package domaine;

import base.ConnexionBase;
import com.mysql.jdbc.Connection;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPers{  
    
    Personne emp;
    Personne emp2;
    Personne emp3;
    Connection con;
    
    @BeforeTest
    protected void createEmploye(){
        emp2 = new Personne(1, "Raillard", "Jonathan", 0);
        emp = new Personne("Raillard","Jonathan", 0);
        emp3 = new Personne("Dupond","Mathieu", 1);
    }
    
    @Test
    public void testIncrement(){
        int nbCafInit = emp.getNbCafes();
        emp.incCafes(5);
        assertTrue(emp.getNbCafes() == nbCafInit+5);
    }
    
    @Test
    public void updateEmpoye(){
        emp.setId(9);
        assertTrue(emp.getId()==9);
    }
    
    @Test
    public void equalsEmploye(){
        assertEquals(emp2 , emp);
    }
    
    @Test
    public void notEqualsEmploye(){
        assertNotEquals(emp3, emp);
    }
    
    @Test
    public void compareEmployeEqual(){
        assertTrue(emp2.compareTo(emp) == 0);  
    }
    
    @Test
    public void compareEmployeMinor(){
        assertTrue(emp3.compareTo(emp) != 0);
    }
        
    @Test
    private void connectionTest(){
        con = (Connection)ConnexionBase.get();
        assertNotNull(con);
    }
    
    /*@Test
    private void connectionCloseTest(){
        con = (Connection)ConnexionBase.get();
        con.close();
        assertTrue(con.equals(null));
    }*/
}