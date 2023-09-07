import java.util.Scanner;

class Rectangle
{
    float longueur;
    float largeur;
            Rectangle( )
            {
                Scanner rec = new Scanner (System.in);
                System.out.println("entrer le longueur :"); 
                this.longueur= rec.nextFloat();
                System.out.println("entrer le largeur :"); 
                this.largeur= rec.nextFloat();
            
            }
           

    float Perimetre( )
    {
        return  2*(this.longueur+this.largeur) ;
    }
    float Surface( )
    {
        return this.longueur * this.largeur;
    }
    
   
    

}
