public class MaDate {
    private int jour;
    private int mois;
    private int annee;
    public MaDate(int j,int m,int a)
    {
        jour = j;
        mois = m;
        annee = a;
    }
    public MaDate(int a)
    {
        this(1,1,a);
    }
    public String toString()
    {
        return (jour+"/"+mois+"/"+ annee);
    }
    void affiche()
    {
        System.out.println(toString());
    }
    int getj()
    {
        return  jour;
    }
    int getm()
    {
        return mois;
    }
    int geta()
    {
        return annee;
    }
    void setj(int j)
    {
        jour = j;
    }
    void setm(int m)
    {
        mois = m;
    }
    void seta(int a)
    {
        annee = a;
    }
    void ajouterUnJour()
    {
        if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois ==10 || mois == 12  )
        {
            if(jour<31)
            {
                jour+=1;
            }
            else
            {
                if(mois<12)
                {
                    mois+=1;
                    jour = 1;
                }
                else
                {
                    mois = 1;
                    annee+=1;
                    jour = 1;
                }
            }

        }
        else if (mois == 4 || mois == 6 || mois == 9 || mois == 11 )
        {
            if(jour<30)
            {
                jour+=1;
            }
            else
            {
                    mois+=1;
                    jour = 1;
            }
        }
        else
        {
            if(annee % 4 == 0 && annee % 400 != 0)
                if(jour == 29 )
                {
                    mois = 1;
                    jour = 1;
                }
                else {
                    jour++;
                }
            else
            {
                if(jour == 28 )
                {
                    mois = 1;
                    jour = 1;
                }
                else {
                    jour++;
                }
            }
        }
    }
    void ajoutplusieursjours(int n)
    {
        for (int i = 0;i<n;i++)
        {
            ajouterUnJour();
        }
    }
    void ajouterUnMoi()
    {
        if (mois < 12)
        {
            mois+=1;
        }
        else{
            mois = 1;
            annee+=1;
        }
    }
    void ajouterUnAn()
    {
        annee+=1;
    }
}
