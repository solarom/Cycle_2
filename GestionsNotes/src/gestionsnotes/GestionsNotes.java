/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsnotes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author amadaryan
 */
public class GestionsNotes {

    static final int ETU_MAX_NB_NOTES = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    static void menu() {

        // Semestre 1
        int[] ue1s1 = new int[ETU_MAX_NB_NOTES];
        int[] ue2s1 = new int[ETU_MAX_NB_NOTES];
        int[] ue3s1 = new int[ETU_MAX_NB_NOTES];
        
        int tailleUe1s1 = remplirTableauAleatoire(ue1s1);
        int tailleUe2s1 = remplirTableauAleatoire(ue2s1);
        int tailleUe3s1 = remplirTableauAleatoire(ue3s1);
        
        // Semestre 2
        int[] ue1s2 = new int[ETU_MAX_NB_NOTES];
        int[] ue2s2 = new int[ETU_MAX_NB_NOTES];
        int[] ue3s2 = new int[ETU_MAX_NB_NOTES];
        
        int tailleUe1s2 = remplirTableauAleatoire(ue1s2);
        int tailleUe2s2 = remplirTableauAleatoire(ue2s2);
        int tailleUe3s2 = remplirTableauAleatoire(ue3s2);

        // menu
        int saisieUtilisateur;
        do {
            afficherMenu();
            saisieUtilisateur = saisirNombreIntervalle(1, 5);
            switch(saisieUtilisateur) {
                case 1:
                    afficherNotesUe(
                        ue1s1, tailleUe1s1, 
                        ue2s1, tailleUe2s1, 
                        ue3s1, tailleUe3s1, 
                        ue1s2, tailleUe1s2, 
                        ue2s2, tailleUe2s2, 
                        ue3s2, tailleUe3s2);
                    break;
                case 2:
                    afficherInfosDesUe(
                        ue1s1, tailleUe1s1, 
                        ue2s1, tailleUe2s1, 
                        ue3s1, tailleUe3s1, 
                        ue1s2, tailleUe1s2, 
                        ue2s2, tailleUe2s2, 
                        ue3s2, tailleUe3s2);
                    break;
                case 3:
                    //
                    break;
                case 4:
                    break;
            }
        } while (saisieUtilisateur != 5);
    }
    
    
    
    
    static void afficherMenu() {
        System.out.println("(1) Afficher notes d'une UE");
        System.out.println("(2) Statistiques de vos UE");
        System.out.println("(3) Note à obtenir au prochain devoir d'une UE pour avoir la moyenne");
        System.out.println("(4) UE validées sur l'année");
        System.out.println("(5) Quitter");
    }
        
        
    
    // Fonction qui récupère la saisie de l'utilisateur.
    static int saisirNombre(){
        int val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        return val;
    }
    
    /* 
     *  Cette fonction sera utilisée par tous les jeux. 
     *  Elle demande à l'utilisateur de saisir un niveau de difficulté entre 1 et 3 et le retourne. 
     *  Si le niveau n'est pas valide, l'utilisateur est invité à en saisir un autre.
     */
    static int saisirNombreIntervalle(int min, int max){
        int val;
        do {
            System.out.println("Saisir un nombre entre " + min + " et " + max);
            val = saisirNombre();
        } while (!(val >= min && val <= max));
        return val;
    }
    
    static int remplirTableauAleatoire(int[] tab) {
        int n = nombreAleatoire(3, 10);

        for (int i = 0; i < n; i++) {
            tab[i] = nombreAleatoire(0, 20);
            System.out.print(tab[i] + " ");
        }
        
        return n;
    }
       
    static int nombreAleatoire(int mini, int maxi) {
        Random random = new Random();
        int valeur = random.nextInt(maxi - mini + 1) + mini;
        return valeur;
    }
    
    static void afficherNotesUe(
            int[] ue1s1, int tailleUe1s1,
            int[] ue2s1, int tailleUe2s1,
            int[] ue3s1, int tailleUe3s1,
            int[] ue1s2, int tailleUe1s2,
            int[] ue2s2, int tailleUe2s2,
            int[] ue3s2, int tailleUe3s2
    ) { 
    }
    
    static void afficherInfosDesUe(
            int[] ue1s1, int tailleUe1s1,
            int[] ue2s1, int tailleUe2s1,
            int[] ue3s1, int tailleUe3s1,
            int[] ue1s2, int tailleUe1s2,
            int[] ue2s2, int tailleUe2s2,
            int[] ue3s2, int tailleUe3s2
    ) {
    }
    
}
