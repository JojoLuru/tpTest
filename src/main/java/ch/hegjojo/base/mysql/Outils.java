/************************************************/
/**** CETTE CLASSE NE DOIT PAS ÊTRE MODIFIÉE ****/
/************************************************/
package ch.hegjojo.base.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.h2.jdbcx.JdbcDataSource;

/**
 * Connexion à la base MySQL.
 *
 * @author Jonathan Raillard
 * @version Version 2.0
*/
public class Outils {

  /** Retourne une connexion avec une base de données MySQL. */
  public static Connection connect (String nomBase) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Properties props = new Properties();
    props.put("user", "root"); props.put("password", "root"); props.put("charSet", "UTF-8");
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nomBase, props);
  } // connect

  /*public static Connection connectH2(String nomBase) throws ClassNotFoundException, SQLException{
      JdbcDataSource ds = new JdbcDataSource();
      ds.setURL("jdbc:h2:~/test");
      ds.setUser("sa");
      ds.setPassword("sa");
      Connection con = ds.getConnection();
      return con;
  }*/
} // Outils
