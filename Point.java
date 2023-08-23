class Point
{
    int x;
    int y;
            Point(int x, int y )
            {
                this.x = x != 0 ? x : 1;
                this.y = y != 0 ? y : 1;
            }
            Point()
            {
                System.out.println(" constructeur par defaut "  ); 
            }
            Point(int a )
            {
                this.x=a;
                this.y=a;
            }

    double distance( Point M )
    {
        double res;
        res=Math.sqrt(((M.x-this.x)*(M.x-this.x))+((M.y-this.y)*(M.y-this.y)));
        return res;
    }

    void Afficher()
    {
       System.out.println("x=" + this.x+"  y="+ this.y );   
    }
    void deplacer(int a,int b)
    {
        this.x += a;
        this.y +=b;    
    }
   
     public static void main(String[] args)     
    {
        
        Point A=new Point(1,2);
                Point B=new Point(); 
                Point C=new Point(1); 
                Point D=new Point(1,2); 

        double r =A.distance(B);
        System.out.println("r=" + r ); 
                B.x=0;
                B.y=0;
                B.Afficher();
                C.Afficher();
                D.Afficher();

    }

}