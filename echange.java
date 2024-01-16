class Test {
public static void echange(int i, int j) {
int aux = i;
i = j;
j = aux;
}
public static void main(String[] args) {
int a = 1;
int b = 2;
echange(a,b);
System.out.println("a = " + a);
System.out.println("b = " + b);
}
}
Le programme suivant affichera "a = 1" et "b = 2". Cela est dû au fait que les variables a et b sont passées par valeur à la méthode echange()class Test