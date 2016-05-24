/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegjojo.base;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author jonathanraillard
 */
public class TestCon {
    
    Connection con;
    
    @BeforeTest
    public void conCreate(){
        con = (Connection)ConnexionBase.get();
    }
    
    @Test
    public void connectionTest(){
        assertNotNull(con);
    }
    
    /*@Test
    public void connectionCloseTest(){
        try {con.close();}
        catch (SQLException e) {System.out.println("ConnexionBase: " + e.getMessage());}
        assertNull(con);
    }*/
}
