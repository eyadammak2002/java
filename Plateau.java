import java.io.BufferedReader;
import java.io.InputStreamReader;

class Plateau{
private int dimension;
private String[][] cases; // cases "physiques" du plateau materiel
String cercle = new String("O");
String croix = new String("X");
// Constructeurs
public Plateau(int dimPlateau) {
    this.dimPlateau=dimPlateau;
}
public Plateau() {
    cases =new String[2][3];
}
// Acesseur
public int getDimension()throws Exception {
    BufferedReader br = new BufferedReader(
              new InputStreamReader(System.in));
    int Dimension = Integer.parseInt(br.readLine());
    return Dimension;
}
// Vider le plateau
public void viderPlateau() {}
// Affichage du plateau
public void afficherPlateau()
{
System.out.print("\n |");
for(int i = 0; i < dimension; i++)
System.out.print(i+"|");
System.out.println("");
for(int i = 0; i < dimension; i++)
System.out.print("--");
System.out.println("---");
for(int i = 0; i < dimension; i++) {
System.out.print(i+" |");
for(int j = 0; j < dimension; j++)
System.out.print(cases[i][j] + "|");
System.out.println("");
for(int j = 0; j < dimension; j++)
System.out.print("--");
System.out.println("---");
}
System.out.println("");
}
// Renvoyer la piece qui se trouve a la case specifiee
public String getCase(int ligne, int colonne) {
return();
}
// Le plateau est-il plein ?
public boolean plateauEstPlein() {
return();    
}
// La case est-elle vide ?
public boolean caseEstVide(int ligne, int colonne) {
    return();
}
// Jouer un coup, dont on teste la legalite
public boolean deplPiece(int qui, int ligne, int colonne) {
    return();
}

}// class Plateau
 

