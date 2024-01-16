public static int[] creerTableau(int n) {
    int[] tableau = new int[n];
    for (int i = 0; i < n; i++) {
        tableau[i] = i + 1;
    }
    return tableau;
}


 Pour renvoyer la somme de toutes les valeurs d'un tableau pris en argument, vous pouvez utiliser le code suivant :


public static int somme(int[] tab) {
    int somme = 0;
    for (int i = 0; i < tab.length; i++) {
        somme += tab[i];
    }
    return somme;
}


Pour ajouter 1 à la valeur de chaque case du tableau, vous pouvez utiliser le code suivant :


public static void incremente(int[] tab) {
    for (int i = 0; i < tab.length; i++) {
        tab[i]++;
    }
}