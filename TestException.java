import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestException {
    void division(){
         BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
               // Taking integer input
            try{
                System.out.println("donner a :"); 
                int a = Integer.parseInt(br.readLine());
               
                 System.out.println("donner b :"); 
                int b= Integer.parseInt(br.readLine());
                System.out.println("a/b ="+ a/b); 
                }
                catch(ArithmeticException e){
                    System.out.println("division par zero"); }
                catch(NumberFormatException e){
                    System.out.println("type de saisie incorrecte"); } 
                catch(Exception e){
                System.out.println("erreur:"+e); 
                }   
}
public static void main(String[] args){
    TestException A=new TestException();
    A.division();
}
}
