import java.util.Scanner;

class Date
{ 
    //attributs

    int jours;
    int mois;
    int annee;

    // constructeur
    
    Date()
    { 
        Scanner vardat = new Scanner (System.in);
        System.out.println("entrer le jour :"); 
        this.jours= vardat.nextInt();
        System.out.println("entrer le mois :"); 
        this.mois= vardat.nextInt();
        System.out.println("entrer l'année :"); 
        this.annee= vardat.nextInt();



    }

        //méthode

    void Afficher()
    {
     
       System.out.println("date =  "+this.annee+"/ "+ this.mois+"/ "+this.jours );  
    }

    void changerDate(int jours, int mois,int annee)
    {
    this.jours=jours;
    this.mois=mois;
    this.annee=annee;
    }

    int diffDate(Date d )
    { int res;
      
       
    res=d.jours-this.jours;
    return res;
    }
    
    
    public static void main(String[] args)     
    {
        
        
         Date A= new Date ();
         Date d1= new Date ();
         Date d2= new Date ();
         A.Afficher();
         A.changerDate(2,3,2002);
         A.Afficher();
         System.out.println(" la différence est"+d1.diffDate(d2)+"jours");
         

    }
} 
       

       