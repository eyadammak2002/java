import java.time.LocalDate;
abstract  class Salaires {


    String nom;
    String prenom;
    int age;
    LocalDate date;

   /* public void LocalDate(){
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        String dateStr=br.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDate date = LocalDate.parse(dateStr, formatter);  
    }*/ 
    
    public abstract float calculerSalaire();
   
    public String getNom(){
        return "L'employé "+this.nom+" " +this.prenom ;
    }

    
}

// Subclass (inherit from Animal)
class directeur extends Salaires {
  public void calculerSalaire() {
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
