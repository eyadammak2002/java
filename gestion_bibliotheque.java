import java.util.Scanner;

public class gestion_bibliotheque {

    Livre[] myLivres;
    int nbLivre=0;

        gestion_bibliotheque(){
            //System.out.println(" constructeur par defaut "  ); 
            myLivres = new Livre[10];
        }

    void Ajouter(){
                Scanner li = new Scanner (System.in);
                System.out.println("entrer le code :"); 
                int code=li.nextInt();
                System.out.println("entrer le titre :"); 
                String titre=li.nextLine();

                System.out.println("entrer le auteur :"); 
                String auteur=li.nextLine();
                System.out.println("entrer le prix :"); 
                float prix=li.nextFloat();

            this.myLivres[nbLivre]=new Livre(code,titre,auteur,prix);
            nbLivre++;

    }

    void Modifier(){
                int i=0;
                Scanner co = new Scanner (System.in);
                System.out.println("donner le code :"); 
                int code=co.nextInt();
            //getcode 5ater il code private 5asa bil class livre
                while ((code != this.myLivres[i].getcode())&&(i<nbLivre)){
                    i++;
                    if(i<nbLivre){
                            
                        System.out.println("donner le nouveau titre :"); 
                        this.myLivres[i].settitre(co.nextLine());
                        System.out.println("donner le nouveau auteur :"); 
                        this.myLivres[i].setauteur(co.nextLine());
                        System.out.println("donner le nouveau prix :"); 
                        this.myLivres[i].setprix(co.nextFloat());
                        }
                    else
                    System.out.println("code n'existe pas" );     
                }              
    }

    void Supprimer(){
           int i=0;
           Scanner co = new Scanner (System.in);
           System.out.println("donner le code :"); 
           int code=co.nextInt();

        while ((code != this.myLivres[i].getcode())&&(i<nbLivre)){
            i++;
            if(i<nbLivre){
                for (int j = i++; i < nbLivre; i++) 
                    myLivres[j-1] =myLivres[j];
                nbLivre--;
            }
            else
                System.out.println("code n'existe pas" ); 
        }
    }

    void afficher(){
    
    for (int i= 0; i < nbLivre; i++)  
       myLivres[i].Afficher(); 
    }

    void afficherLivre(){
         int i=0;
                Scanner co = new Scanner (System.in);
                System.out.println("donner le code :"); 
                int code=co.nextInt();
            //getcode 5ater il code private 5asa bil class livre
                while ((code != this.myLivres[i].getcode())&&(i<nbLivre)){
                    i++;
                    if(i<nbLivre)
                    myLivres[i].Afficher();         
                    else
                    System.out.println("code n'existe pas" );     
                }  
    }
    void menu(){

    int choix;
    do{
            System.out.println("1 : afficher Liste" );     
            System.out.println("2 : ajouter Livre" );  
            System.out.println("3 : modifier Livre" );  
            System.out.println("4 : supprimer Livre" );  
            System.out.println("5 : afficher un Livre" );  
            System.out.println("6 : quitter" ); 


             
            System.out.println("donner le choix" ); 


            Scanner co = new Scanner (System.in);
            choix=co.nextInt();
            
            switch (choix) {
                case 1:
                    this.afficher();  
                break;
                case 2:
                    this.Ajouter();
                break;
                case 3:
                    this.Modifier();         
                break;
                case 4:
                    this.Supprimer();         
                break;
                case 5:
                    this.afficherLivre();  
                break;
                default: 
                System.out.println("il faut donner un choix entre 1 et 5" ); 

                break;
                }
        } while(choix!=6);
    }

    public static void main(String[] args)     
    {
        gestion_bibliotheque a =new gestion_bibliotheque();
        a.menu();

    }
}
        

