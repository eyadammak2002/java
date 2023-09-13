

class Etudiant
{
    // attributs
    int numero_identification;
    String nom;
    String prenom;
    String branche;
    int niveau;
        // constructeur

        Etudiant(int numero_identification, String nom,String branche, String prenom,int niveau)
            {
                this.numero_identification=numero_identification;
                this.nom=nom;
                this.prenom=prenom;
                this.niveau=niveau;
                this.branche=branche;
            }
           

         
        // getter and sette

        int getnumero_identification()
        {
            return numero_identification;
        }
        void setnumero_identification(int numero_identification)
        {
            this.numero_identification=numero_identification;
        }
        String getnom()
        {
            return nom;
        }
        void setnom(String nom)
        {
            this.nom=nom;
        }
        String getprenom()
        {
            return prenom;
        }
        void setprenom(String prenom)
        {
            this.prenom=prenom;
        }
        String getbranche()
        {
            return branche;
        }
        void setbranche(String branche)
        {
            this.branche=branche;
        }
        int getniveau()
        {
            return niveau;
        }
        void setniveau(int niveau)
        {
            this.niveau=niveau;
        }

    // methodes

    void afficher()
            { 
                //String str = String.valueOf(n);
                //  String str = Integer.toString(n);

              System.out.println("************************************ \n CIN =" + this.numero_identification + "\n nom = " + this.nom+ " \n prenom = " + this.prenom+ " \n branche = " + this.branche+" \n niveau = " + this.niveau+" \n ************************************" );   
            }


}

