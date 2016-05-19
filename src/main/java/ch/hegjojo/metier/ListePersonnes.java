package metier;

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
  public ListePersonnes (java.util.List<Personne> liste) {setObjects(liste);}
} // ListePersonnes
