import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();
        StringBuilder chaineInverse = new StringBuilder();
        for (int i = chaine.length() - 1; i >= 0; i--) {
            chaineInverse.append(chaine.charAt(i));
        }
        System.out.println("L'inversion de cette chaîne donne : " + chaineInverse.toString());
    }
}