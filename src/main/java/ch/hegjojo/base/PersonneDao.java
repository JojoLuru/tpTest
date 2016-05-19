package base;

import domaine.Personne;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Module 634.1-Programmation / Gestion des contacts
 * 
 * Gestion des accès à la base de données pour l'entité Personne.
 *
 * @author Raillard Jonathan
 * @version 2.0
 */
public class PersonneDao {
  
    /** Retourne la liste des employés, dans l'ordre des nom et prénom. */
  public static ArrayList getListePersonnes () {
    ArrayList<Personne> lstPers = new ArrayList<Personne>();
    Connection con = ConnexionBase.get();
      try {
          Statement stmtPers = con.createStatement();
          ResultSet st = stmtPers.executeQuery("SELECT Employe.IdEmpl, Nom, Prenom, COUNT(NbCafes) FROM Employe JOIN Consommation on Consommation.IdEmpl = Employe.IdEmpl GROUP BY Employe.Nom ORDER BY Nom, Prenom");
          while(st.next()){
              Personne pers = new Personne(st.getInt("IdEmpl"), st.getString("Nom"), st.getString("Prenom"),st.getInt("COUNT(NbCafes)"));
              lstPers.add(pers);
          }
          stmtPers.close();
          
      } catch (SQLException e) {System.out.println(e.getMessage()); System.out.println(e.getStackTrace());}  
      System.out.println(lstPers.size());
      return lstPers;
  } // getListeEmployes
 
  
} // PersonneDao
