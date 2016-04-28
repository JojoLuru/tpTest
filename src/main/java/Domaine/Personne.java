package domaine;

/**
 * Module 634.1-Programmation / Gestion des contacts
 * 
 * Modélisation d'une personne
 *
 * @author Raillard JOnathan
 * @version 2.0
 */
public class Personne implements Comparable {

  private int id;          /* Numéro de la personne: identifiant */
  private String nom;      /* Nom */
  private String prenom;   /* Prénom */
  private int nbCafes; /* Conso Cafe */

  /** Constructeurs */
  public Personne (int id, String nom, String prenom, int nbCafes) {
    this(nom, prenom, nbCafes);
    this.id = id;
  } // Constructeur

  public Personne (String nom, String prenom, int nbCafes) {
    this.nom = nom; this.prenom = prenom; 
    this.nbCafes = nbCafes;
  } // Constructeur

  /** Accesseurs */
  public int getId () {return id;}
  public void setId (int id) {this.id = id;}

  public String getNom () {return nom;}
  public void setNom (String nom) {this.nom = nom;}

  public String getPrenom () {return prenom;}
  public void setPrenom (String prenom) {this.prenom = prenom;}
  
  public int getNbCafes(){return this.nbCafes;}
  public void incCafes(int inc){nbCafes = nbCafes + inc;}
    
  public boolean equals (Object obj) {return ((Personne)obj).id == id;}
  
  public String toString () {return nom + " " + prenom;}
  
  public int compareTo (Object obj) {
    Personne p = (Personne)obj;
    int res = nom.compareTo(p.nom);
    if (res != 0) {return res;} else {return prenom.compareTo(p.prenom);}
  } // compareTo

} // Personne