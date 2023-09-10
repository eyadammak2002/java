

class Livre
{
   private int code;
   private String titre;
   private String auteur;
   private float prix;


        Livre(int code, String titre, String auteur,float prix)
            {
                this.code=code;
                this.titre=titre;
                this.auteur=auteur;
                this.prix=prix;
            }
        
            //accesseurs et modificateurs

    int getcode()
    {
        return code;
    }
    void setcode(int code)
    {
        this.code=code;
    }
     String gettitre()
    {
        return titre;
    }
    void settitre(String titre)
    {
        this.titre=titre;
    }
     String getauteur()
    {
        return auteur;
    }
    void setauteur(String auteur)
    {
        this.auteur=auteur;
    }
    float getprix()
    {
        return prix;
    }
    void setprix(float prix)
    {
        this.prix=prix;
    }
    

     void Afficher()
    {
        System.out.println("livre \n code  " + this.code + "\n titre = " + this.titre+ "\n auteur = " + this.auteur+ " \n prix = " + this.prix );   

    }


}