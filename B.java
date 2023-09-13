public class B extends A {
   
    private int y;
    B(int y , int x){
        System.out.println( "constructeur de b");

        this.y=y;
        super.x=x;

    }
    
    int divise(){
      
        if(y!=0)
        return y/y*y*y;
        else 
        return 0;

    }
    public static void main(String[] args){
        B b=new B(2,3);
    }
}
