/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

/**
 *
 * @author talend
 */
public class Parfait {



 // public Parfait() {

 //}

  
  public boolean estDivisiblePar(long n, long val) {
    return val % n == 0;
  }

  
  /**
   * Renvoie les diviseurs de l'entier.
   */
  public long[] diviseurs(long val) {
    // Majorant pour le nombre de diviseurs
    int majorant = 1000;
    long[] temp = new long[majorant];
    // Ajouter 1 qui est nécessairement un diviseur
    temp[0] = 1;
    // Indice de temp où ajouter le prochain diviseur
    int position = 1;
    // Ajouter le nombre lui-même (sauf s'il est égal à 1 qui vient déjà d'être ajouté)
    if (val != 1) {
      temp[1] = val;
      position++;
    }
    // Déclarer i en dehors de la boucle pour pouvoir 
    // l'utiliser après la fin de la boucle. 
    long i = 0;
    // Essayer tous les nombres comme diviseurs, 
    // jusqu'à racine carrée de val, non compris.
    for (i = 2; i * i < val; i++) {
      // On verra que this représente l'entier à qui on envoie le message.
      // if (estDivisiblePar(i) convient aussi.
      if (this.estDivisiblePar(i,val)) {
        // Si i divise val, val / i le divise aussi.
        temp[position] = i;
        temp[position + 1] = val / i;
        position = position + 2;
      }
    }
    // Si val est un carré, à la sortie de la boucle,
    // i est égal à la racine carrée de val.
    // Dans ce cas, il faut ajouter i comme diviseur.
    if (i * i == val) {
      temp[position] = i;
      position++;
    }
    // On a trouvé position diviseurs pour le nombre
    long[] diviseurs = new long[position];
    for (int j = 0; j < position; j++) {
      diviseurs[j] = temp[j];
    }
    return diviseurs;
  }
  

  
  public boolean estParfait(long val) {
    long[] diviseurs = diviseurs(val);
    long somme = 0;
    for (int i = 0; i < diviseurs.length; i++) {
      somme = somme + diviseurs[i];
    }
    return somme - val == val;
  }


    public String formaterResult(boolean isParfait, long nb) {
        if (isParfait) {
            return "le nombre " + nb + " est parfait";
        } else {
            return "le nombre " + nb + " n'est pas parfait";
        }

    }
    
    
}
