import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GererChaine{
    
    String s;

    GererChaine(String s){
         this.s=s;
    }
    
    void concat(GererChaine m)throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        this.s=br.readLine();
        System.out.println("donner une chaine  :"); 
        m.s=br.readLine();
        System.out.println( this.s+m.s); 
 
    }
    void index(GererChaine m)throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        this.s=br.readLine();
        System.out.println("donner une chaine  :"); 
        m.s=br.readLine();
        System.out.println( "l'indice de premiere occurrence de "+this.s+" dans "+m.s+" est "+this.s.indexOf(m.s)); }


    void StartWith(GererChaine m)throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        this.s=br.readLine();
        System.out.println("donner une chaine  :"); 
        m.s=br.readLine();
        System.out.println(this.s+" se commence par "+m.s+":"+this.s.startsWith(m.s)); 
    }

    void EndWith(GererChaine m)throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine  :"); 
        this.s=br.readLine();
        System.out.println("donner une chaine  :"); 
        m.s=br.readLine();
        System.out.println(this.s+" se commence par "+m.s+":"+this.s.endsWith(m.s)); 
    }



   
    void menu(GererChaine m)throws Exception{

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
                    this.concat(m);  
                break;
                case 2:
                    this.index(m);
                break;
                case 3:
                    this.StartWith(m);         
                break;
                case 4:
                    this.EndWith(m);         
                break;
               
                default: 

                break;
                }
        } while(choix!=5);
    }

    public static void main(String[] args)throws Exception     
    {
        GererChaine a =new GererChaine("try with");
        GererChaine b =new GererChaine("why");
        a.menu(b);

    }
}