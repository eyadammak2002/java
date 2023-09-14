import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GererChaine{
    
   
    GererChaine(){
        System.out.println(" constructeur par defaut "  ); 

    }
    
    void concat(  )throws Exception{
        String ch1 ;
        String ch2;
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        ch1=br.readLine();
        System.out.println("donner une chaine  :"); 
        ch2=br.readLine();
        System.out.println("le résultat de concatination est "+ch1+ch2); 
 
    }
    void index()throws Exception{
         String ch1 ;
         String ch2;
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        ch1=br.readLine();
        System.out.println("donner une chaine  :"); 
        ch2=br.readLine();
        System.out.println( "l'indice de premiere occurrence de "+ch2+" dans "+ch1+" est "+ch1.indexOf(ch2)); }


    void StartWith( )throws Exception{
        String ch1 ;
        String ch2 ;
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        ch1=br.readLine();
        System.out.println("donner une chaine  :"); 
        ch2=br.readLine();
        System.out.println(ch1+" se commence par "+ch2+":"+ch1.startsWith(ch2)); 
    }

    void EndWith()throws Exception{
        String ch1 ;
        String ch2 ;
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        ch1=br.readLine();
        System.out.println("donner une chaine  :"); 
        ch2=br.readLine();
        System.out.println(ch1+" se commence par "+ch2+":"+ch1.endsWith(ch2)); 
    }



   
    void menu()throws Exception{

    int choix;
    do{
            System.out.println("1 : concatination de daux chaines" );     
            System.out.println("2 : indice de premiere occurrence d'une sous_chaine" );  
            System.out.println("3 : commence par une sous_chaine" );  
            System.out.println("4 : se termine par une sous_chaine" );    
            System.out.println("5 : quitter" ); 


             
            System.out.println("veuillez entrer votre choix" ); 


            BufferedReader br = new BufferedReader(
              new InputStreamReader(System.in));
            choix=Integer.parseInt(br.readLine());
            
            switch (choix) {
                case 1:
                    this.concat();  
                break;
                case 2:
                    this.index();
                break;
                case 3:
                    this.StartWith();         
                break;
                case 4:
                    this.EndWith();         
                break;
               
                default: 

                break;
                }
        } while(choix!=5);
    }

    public static void main(String[] args)throws Exception     
    {
        GererChaine a =new GererChaine();
       
        a.menu();

    }
}