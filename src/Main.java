import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        MaDate d = new MaDate(30,11,2004);
        MaDate d1 = new MaDate(2004);
        MaDate d2 = new MaDate(5,2,2004);
        d.seta(2000);
        d.seta(2000);
        d.affiche();
        d1.affiche();
        d2.affiche();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("quest ce que tu veux faire");
            System.out.println("tapez 1 pour ajout dun jour");
            System.out.println("tapez 2 pour ajout de plusieurs jours");
            System.out.println("tapez 3 pour ajout dun mois");
            System.out.println("tapez 4 pour lajout dun annee");
            System.out.println("taper nimporte quelle nombre sauf 1/2/3/4 pour quitter");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    d.ajouterUnJour();
                    break;
                case 2:
                    d.ajoutplusieursjours(6);
                    break;
                case 3:
                    d.ajouterUnMoi();
                    break;
                case 4:
                    d.ajouterUnAn();
                default:
                    s.close();
                    return;
            }
            d.affiche();
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}