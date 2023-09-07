

class Etudiant
{
    int numero_identification;
    String nom;
    String prenom;
    int niveau;
        Etudiant(int numero_identification, String nom, String prenom,int niveau)
            {
                this.numero_identification=numero_identification;
                this.nom=nom;
                this.prenom=prenom;
                this.niveau=niveau;
            }
           

         void Afficher()
            { 
                //String str = String.valueOf(n);
                //  String str = Integer.toString(n);

              System.out.println("CIN =" + this.numero_identification + " nom = " + this.nom+ " prenom = " + this.prenom+ " niveau = " + this.niveau );   
            }
        boolean verification()
        {
           boolean verif;
            verif= (this.niveau==2) ? true :false;
            return verif;
        }
        void niveau()
        { 

        }

        public static void main(String[] args)     
    {
        
        Etudiant A=new Etudiant(11187567,"eya","dammak",2);
        Etudiant B=new Etudiant(11145345,"bilel","feki",4); 
        Etudiant C=new Etudiant(11134685,"farah","kallel",4); 
        Etudiant D=new Etudiant(11178989,"fedi","aydi",3); 
        Etudiant E=new Etudiant(11123434,"sirine","kammoun",2); 

       if(A.verification()==true)
       {
        A.Afficher();
       } 
       if(B.verification()==true)
       {
        B.Afficher();
        }
         if(C.verification()==true)
        {
        C.Afficher();
        } 
        if(D.verification()==true)
        {
        D.Afficher();
        }
        if(E.verification()==true){
        E.Afficher();       
        }
    }
}
        
   
    

