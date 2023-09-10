import java.util.Scanner;

class ScoreJoueur {
    //attributs
    String nom_de_joueur;
    int score;
    int score_m;
    //constructeur
    ScoreJoueur(){
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter nom de joueur");
        this.nom_de_joueur=s.nextLine();
        System.out.println("Enter score");
        this.score=s.nextInt();
        System.out.println("Enter score maximale");
        this.score_m=s.nextInt();
        
    }
    void Affiche(){
        System.out.println("nom de joueur: "+this.nom_de_joueur+"score : "+this.score+"score maximale : "+ this.score_m);

    }
    void Ajouter(int n){
    this.score+=n;
    }


    
}