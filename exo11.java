import java.util.Scanner;
import java.util.Random;

public class SeqOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(2);
        }
        int compteur = 0;
        int[] longueurs = new int[taille];
        for (int i = 0; i < taille; i++) {
            if (tableau[i] == 1) {
                compteur++;
            } else {
                if (compteur > 0) {
                    longueurs[compteur - 1]++;
                    compteur = 0;
                }
            }
        }
        if (compteur > 0) {
            longueurs[compteur - 1]++;
        }
        for (int i = 0; i < taille; i++) {
            if (longueurs[i] > 0) {
                System.out.println("Il y a " + longueurs[i] + " séquences de longueur " + (i + 1));
            }
        }
    }
}

