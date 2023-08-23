class Cercle
{
    Point o;
    double r;

    Cercle(int x, int y,double r)
    {
        this.o=new Point(x,y);
        this.r=r;
    }

    double Surface()
    {
        return  3.14*this.r*this.r ;

    }

    double Perimetre()
    {
      return  2*3.14*this.r ;  

    }
    void Afficher()
    {
        System.out.println("centre :");
        this.o.Afficher();
        System.out.println("r"+this.r);
    }

     public static void main(String[] args)     
    {
        
        Cercle C=new Cercle(2,3,4);
        
        C.Afficher();
        C.o.deplacer(1,4);
        C.Afficher();
   

         
    }
}