
import base.ConnexionBase;
import com.mysql.jdbc.Connection;
import domaine.Personne;
import java.sql.SQLException;
import metier.ListePersonnes;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import presentation.FrmMain;

public class TestApp{  
    
    Personne emp;
    Personne emp2;
    Personne emp3;
    ListePersonnes lstEmp;
    FrmMain frm;
    Connection con;
    
    @BeforeTest
    public void createEmploye(){
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
    }
    
    @Test
    public void equalsEmploye(){
        assertTrue(emp2.equals(emp));
    }
    
    @Test
    public void notEqualsEmploye(){
        assertFalse(emp3.equals(emp));
    }
    
    @Test
    public void compareEmployeEqual(){
        assertTrue(emp2.compareTo(emp) == 0);  
    }
    
    @Test
    public void compareEmployeMinor(){
        assertTrue(emp3.compareTo(emp) != 0);
    }
        
    @BeforeTest
    private void createFrm(){
        frm = new FrmMain();
    } 
    
    @Test
    private void instanceFrmTest(){
        assertTrue(frm != null);
    }
    
    @BeforeTest
    private void listesTest(){
        lstEmp = new ListePersonnes();
    }
    
    @Test
    private void listesImportTest(){
        assertTrue(lstEmp!=null);
    }
    
    @Test
    private void testPos(){
        Personne pers = new Personne("Jonathan","Raillard",0);
        lstEmp.add(pers, lstEmp.size());
        lstEmp.setPos(lstEmp.size()-1);
        assertTrue((lstEmp.getCourant()).equals(pers));
    }
    
    @Test
    private void containsTest(){
        lstEmp.add(emp, lstEmp.size());
        assertTrue(lstEmp.contains(emp));
    }
    
    @Test
    private void connectionTest(){
        con = (Connection)ConnexionBase.get();
        assertTrue(con !=null);
    }
    
    /*@Test
    private void connectionCloseTest() throws SQLException{
        con = (Connection)ConnexionBase.get();
        con.close();
        assertTrue(con==null);
    }*/
    
}