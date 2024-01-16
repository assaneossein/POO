class Personne {
String prenom;
String nom;
private int age;
static int nbPersonnes = 0;
public Personne(String p, String n, int a){
prenom = p;
nom = n;
age = a;
nbPersonnes++;
}
public void affichePersonne1(){
System.out.println(prenom+" "+nom+" a "+age+" ans");
}
}
public class ProgPrincipal {
public static void main(String[] args){
Personne p1 = new Personne("Jean", "Durand", 25);
Personne p2 = new Personne("Patrick", "Martin", 30);
p1.affichePersonne1();
p2.affichePersonne1();
System.out.println(Personne.nbPersonnes);
System.out.println(p1.prenom);
}
}
Le programme suivant affichera :

Jean Durand a 25 ans
Patrick Martin a 30 ans
2
Jean