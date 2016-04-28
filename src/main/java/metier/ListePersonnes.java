package metier;

import base.PersonneDao;
import domaine.Personne;

/**
 * Module 634.1-Programmation / Gestion des contacts
 * 
 * Liste des personnes (dans l'ordre des nom et prénom) avec une position courante
 *
 * @author Peter DAEHNE - HEG Genève
 * @version 1.0
 */
public class ListePersonnes extends ListeObjects {

  /** Constructeur */
  public ListePersonnes () {liste = PersonneDao.getListePersonnes();}

  /** Retourne la personne courante, null si la position courante est NO_POS */
  public Personne getCourant () {return (Personne)super.getCourant();}

  /** Retourne la personne d'indice k, null si k n'est pas correctement défini */
  public Personne get (int k) {return (Personne)super.get(k);}
  


} // ListePersonnes
