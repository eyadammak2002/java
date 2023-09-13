import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gestion_bibliotheque {

    Livre[] myLivres;
    int nbLivre=0;

        gestion_bibliotheque(){
            //System.out.println(" constructeur par defaut "  ); 
            myLivres = new Livre[10];
        }

    void Ajouter()throws Exception{
                BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
               // Taking integer input
   
                System.out.println("entrer le code :"); 
                int code = Integer.parseInt(br.readLine());

                // Taking string input
                System.out.println("entrer le titre :"); 
                String titre = br.readLine();
                System.out.println("entrer le auteur :"); 
                String auteur=br.readLine();
                
                // Taking float input
                System.out.println("entrer le prix :"); 
                float prix=Float.parseFloat(br.readLine());

            this.myLivres[nbLivre]=new Livre(code,titre,auteur,prix);
            nbLivre++;

    }

    void Modifier()throws Exception{
                int i=0;
                BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
                System.out.println("donner le code :"); 
                int code = Integer.parseInt(br.readLine());
            //getcode 5ater il code private 5asa bil class livre
                while ((code != this.myLivres[i].getcode())&&(i<nbLivre)){
                    i++;
                    if(i<nbLivre){
                            
                        System.out.println("donner le nouveau titre :"); 
                        this.myLivres[i].settitre(br.readLine());
                        System.out.println("donner le nouveau auteur :"); 
                        this.myLivres[i].setauteur(br.readLine());
                        System.out.println("donner le nouveau prix :"); 
                        this.myLivres[i].setprix(Float.parseFloat(br.readLine()));
                        }
                    else
                    System.out.println("code n'existe pas" );     
                }              
    }

    void Supprimer()throws Exception{
           int i=0;
           BufferedReader br = new BufferedReader(
           new InputStreamReader(System.in));
           System.out.println("donner le code :"); 
           int code = Integer.parseInt(br.readLine());

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

    void afficherLivre()throws Exception{
         int i=0;
                 BufferedReader br = new BufferedReader(
           new InputStreamReader(System.in));
                System.out.println("donner le code :"); 
                int code = Integer.parseInt(br.readLine());
            //getcode 5ater il code private 5asa bil class livre
                while ((code != this.myLivres[i].getcode())&&(i<nbLivre)){
                    i++;
                    if(i<nbLivre)
                    myLivres[i].Afficher();         
                    else
                    System.out.println("code n'existe pas" );     
                }  
    }
    void menu()throws Exception{

    int choix;
    do{
            System.out.println("1 : afficher Liste" );     
            System.out.println("2 : ajouter Livre" );  
            System.out.println("3 : modifier Livre" );  
            System.out.println("4 : supprimer Livre" );  
            System.out.println("5 : afficher un Livre" );  
            System.out.println("6 : quitter" ); 


             
            System.out.println("donner le choix" ); 


            BufferedReader br = new BufferedReader(
           new InputStreamReader(System.in));
            choix=Integer.parseInt(br.readLine());
            
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

    public static void main(String[] args)throws Exception     
    {
        gestion_bibliotheque a =new gestion_bibliotheque();
        a.menu();

    }
}
        

