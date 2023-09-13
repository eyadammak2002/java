import java.io.BufferedReader;
import java.io.InputStreamReader;


public class GroupeEtudiant {      
   
        Etudiant[] etud;
        int nbEtudiant=0;
    
            GroupeEtudiant(){
                //System.out.println(" constructeur par defaut "  ); 
                etud = new Etudiant[10];
            }
    
        void Ajouter()throws Exception{
                    BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
                   // Taking integer input
       
                    System.out.println("entrer numero_identification :"); 
                    int numero_identification = Integer.parseInt(br.readLine());

                    // Taking string input
                    System.out.println("entrer le nom :"); 
                    String nom = br.readLine();
                    System.out.println("entrer le prenom :"); 
                    String prenom=br.readLine();
                    System.out.println("entrer la branche :"); 
                    String branche=br.readLine();
                    // Taking float input

                    System.out.println("entrer le niveau :"); 
                    int niveau=Integer.parseInt(br.readLine());
    
                this.etud[nbEtudiant]=new Etudiant(numero_identification,nom,prenom,branche,niveau);
                nbEtudiant++;
    
        }
    
        void Modifier()throws Exception{
                    int i=0;
                    BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
                    System.out.println("donner le numero_identification :"); 
                    int numero_identification = Integer.parseInt(br.readLine());
                //getcode 5ater il code private 5asa bil class livre
                    while ((numero_identification != this.etud[i].getnumero_identification())&&(i<nbEtudiant)){
                        i++;
                        if(i<nbEtudiant){
                                
                            System.out.println("donner le nouveau nom :"); 
                            this.etud[i].setnom(br.readLine());
                            System.out.println("donner le nouveau prenom :"); 
                            this.etud[i].setprenom(br.readLine());
                            System.out.println("donner la nouveau branche :"); 
                            this.etud[i].setbranche(br.readLine());
                            System.out.println("donner le nouveau niveau :"); 
                            int niveau = Integer.parseInt(br.readLine());     
                        }
                        else
                        System.out.println("numero_identification n'existe pas" );     
                    }              
        }
    
        void Supprimer()throws Exception{
               int i=0;
               BufferedReader br = new BufferedReader(
               new InputStreamReader(System.in));
               System.out.println("donner le numero_identification :"); 
               int numero_identification = Integer.parseInt(br.readLine());
    
            while ((numero_identification != this.etud[i].getnumero_identification())&&(i<nbEtudiant)){
                i++;
                if(i<nbEtudiant){
                    for (int j = i++; i < nbEtudiant; i++) 
                        etud[j-1] =etud[j];
                    nbEtudiant--;
                }
                else
                    System.out.println("numero_identification n'existe pas" ); 
            }
        }
    
        void afficher(){
        
        for (int i= 0; i < nbEtudiant; i++)  
           etud[i].afficher(); 
        }
    
        void afficherEtudiant()throws Exception{
             int i=0;
               BufferedReader br = new BufferedReader(
               new InputStreamReader(System.in));
               System.out.println("donner le numero_identification :"); 
                    int numero_identification = Integer.parseInt(br.readLine());
                //getcode 5ater il code private 5asa bil class livre
            while ((numero_identification != this.etud[i].getnumero_identification())&&(i<nbEtudiant)){
                        i++;
                        if(i<nbEtudiant)
                        etud[i].afficher();         
                        else
                        System.out.println("numero_identification n'existe pas" );     
                    }  
        }


        void menu()throws Exception{
    
        int choix;
        do{
                System.out.println("1 : afficher Liste des etudiants" );     
                System.out.println("2 : ajouter un etudiant" );  
                System.out.println("3 : modifier un etudiant" );  
                System.out.println("4 : supprimer un etudiants" );  
                System.out.println("5 : afficher un etudiant" );  
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
                        this.afficherEtudiant();  
                    break;
                    default: 
                    System.out.println("il faut donner un choix entre 1 et 5" ); 
    
                    break;
                    }
            } while(choix!=6);
        }
    
        public static void main(String[] args)throws Exception     
        {
            GroupeEtudiant a =new GroupeEtudiant();
            a.menu();
    
        }
    }
            
    
    

        
   
    

