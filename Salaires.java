import java.time.LocalDate;
abstract  class Employe {

	//attributs
    String nom;
    String prenom;
    int age;
    LocalDate date;
    
    //constructeur

    Employe(String nom,String prenom,int age,LocalDate date){
      this.nom=nom;
      this.prenom=prenom;
      this.age=age;
      this.date=date;

    }
    //methodes
    
    public abstract float calculerSalaire();
   
    public String getNom(){
        return this.Category()+this.nom+" " +this.prenom ;
    }

    public String Category() {
    	return "l'employe ";
    }
}

class Vente extends Employe {
  float CA;
  
  Vente(String nom,String prenom,int age,LocalDate date,float CA){
	  super(nom,prenom,age,date);
	  this.CA=CA
  }
  float calculerSalaire(){
  return CA*0.2+400;
  }
  public String Category() {
  	return "Vente ";
  }
  
}


class Représentation extends Employe {
  float CA;
  
  Vente(String nom,String prenom,int age,LocalDate date,float CA){
	  super(nom,prenom,age,date);
	  this.CA=CA
  }
  float calculerSalaire(){
  return CA*0.2+800;
  }
  public String Category() {
	  	return "Représentation ";
	  }
  
}
class production extends Employe {
	  int UNPM;
	  
	  Vente(String nom,String prenom,int age,LocalDate date,int UNPM){
		  super(nom,prenom,age,date);
		  this.UNPM=UNPM
	  }
	  float calculerSalaire(){
	  return UNPM*5;
	  }
	  public String Category() {
		  	return "production ";
		  }
	  
	}

class Manutention extends Employe {
	  int NbHeures;
	  
	  Vente(String nom,String prenom,int age,LocalDate date,int NbHeures){
		  super(nom,prenom,age,date);
		  this.NbHeures=NbHeures
	  }
	  float calculerSalaire(){
	  return NbHeures*65;
	  }
	  public String Category() {
		  	return "Manutention ";
		  }
	  
	}








/* public void LocalDate(){
     BufferedReader br = new BufferedReader(
         new InputStreamReader(System.in));
     String dateStr=br.readLine();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
     LocalDate date = LocalDate.parse(dateStr, formatter);  
 }*/ 