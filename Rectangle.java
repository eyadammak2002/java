import java.util.Scanner;

class Rectangle
{
    float longueur;
    float largeur;
            Rectangle(float longueur , float largeur )
            {
                Scanner rec = new Scanner (System.in);
                System.out.println("entrer le longueur :"); 
                longueur= rec.nextFloat();
                System.out.println("entrer le largeur :"); 
                largeur= rec.nextFloat();
              


                this.longueur =longueur;
                this.largeur =largeur;
            }
           

    double Perimetre( )
    {
        return  2*(this.longueur+this.largeur) ;
    }
    double Surface( )
    {
        return this.longueur * this.largeur;
    }
    
   
     public static void main(String[] args)     
    {
        
       Rectangle A= new Rectangle(1,2);
               

        double surface =A.Surface();
        double perimetre =A.Perimetre();
        System.out.println("surface=" + surface+ "perimetre=" + perimetre); 
            

    }

}