import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chaine {
    String s;
    
    Chaine(){
        System.out.println(" constructeur par defaut "  ); 

    }
    Chaine(String s)throws Exception{
         BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("donner une chaine :"); 
        
        this.s=br.readLine();
    }


    String gets()
    {
        return s;
    }
    void sets(String s)
    {
        this.s=s;
    }

     void Afficher()
    {
         System.out.println("chaine est   " + this.s);   
    
    }
    
    
}
