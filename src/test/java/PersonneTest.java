
import domaine.Personne;
import metier.ListePersonnes;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import presentation.FrmMain;

public class PersonneTest{  
    
    Personne emp;
    Personne emp2;
    ListePersonnes lstEmp = new ListePersonnes();
    FrmMain frm;
    
    @BeforeTest
    public void createEmploye(){
        emp2 = new Personne(1, "Raillard", "Jonathan", 0);
        emp = new Personne("Raillard","Jonathan", 0);
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
    public void compareEmploye(){
        assertTrue(emp2.compareTo(emp) == 0);
    }
    

    @Test
    private void listesImportTest(){
        assertTrue(lstEmp.size()>0);
    }
    
    @BeforeTest
    private void createFrm(){
        frm = new FrmMain();
    } 
    
    @Test
    private void instanceFrmTest(){
        assertTrue(frm != null);
    }
    
    /*@Test
    private void testPos(){
        Personne pers = new Personne("Jonathan","Raillard",0);
        lstEmp.add(pers, lstEmp.size());
        lstEmp.setPos(lstEmp.size());
        assertTrue((lstEmp.getCourant()).equals(pers));
        
    }*/
}