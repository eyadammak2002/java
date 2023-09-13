public class A {
    protected int x;
    A(){
        System.out.println("constructeur par defaut");
    }
    A(int x){
        this.x=x;
    }
    int triple(){
        if(this.x!=0)
             return x*3;
        else 
             return 0;
    }
}
