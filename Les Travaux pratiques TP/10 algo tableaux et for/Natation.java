
package piscine;
import java.util.Random;
import java.util.Scanner;


public class Natation {

    final static int LONGUEUR_BASSIN = 25;
    final static int NB_LONGUEURS = 2;
    final static int TAILLE_NOM = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nomNageurs = { "Bousquet", "Le veau", "Dubosc"};
        int[] nageurs = new int[nomNageurs.length];
        int[] classement = new int[nageurs.length];
        int[] tempsArrivee = new int[nageurs.length];
        int nbArrives = 0;
        int temps = 0;
        Random rand = new Random();

        for (int n = 0; n < nageurs.length; ++n) {
            nageurs[n] = 0;
        }

        while (nbArrives < nageurs.length) {
            Afficher(nageurs, nomNageurs);
            for (int n = 0; n < nageurs.length; ++n)
                if (nageurs[n] < LONGUEUR_BASSIN * NB_LONGUEURS) {
                    nageurs[n] +=    rand.nextInt(4); //de 0 à 3
                    if (nageurs[n] >= LONGUEUR_BASSIN * NB_LONGUEURS) {
                        nageurs[n] = LONGUEUR_BASSIN * NB_LONGUEURS;
                        classement[nbArrives] = n;
                        tempsArrivee[nbArrives] = temps;
                        ++nbArrives;
                    }
                }
            ++temps;
            sc.nextLine();
        }
        Afficher(nageurs, nomNageurs);
        for (int n = 0; n < classement.length; ++n) {
            if(n!=0 && tempsArrivee[n] == tempsArrivee[n-1])
                System.out.print("  -");
            else
            	System.out.print(String.format("%s ", n + 1));
            System.out.println(String.format("%s couloir n°%s", nomNageurs[classement[n]], classement[n] + 1));
        }
        sc.nextLine();
    }
	
    private static void Afficher(int[] nageurs, String[] nomNageurs) {
        //Console.Clear();
    	String buffer="";
    	for(int i =0; i < TAILLE_NOM + 1;i++)
        	buffer += ' ';
    	System.out.print(buffer + "╔");
        for (int i = 0; i < LONGUEUR_BASSIN + 3; ++i)
        	System.out.print('═');
        System.out.println('╗');
        for (int n = 0; n < nageurs.length; ++n) {
        	buffer="";
        	for (int i = 0; i < TAILLE_NOM - nomNageurs[n].length(); i++)
        		buffer += ' ';
        	System.out.print(String.format("%s%s ║", nomNageurs[n], buffer));
            int numLongueur = nageurs[n] / LONGUEUR_BASSIN;
            int distLongueurEnCours = nageurs[n] % LONGUEUR_BASSIN;
            int avant = numLongueur % 2 == 0 ? distLongueurEnCours : LONGUEUR_BASSIN - distLongueurEnCours;
            for (int d = 0; d < avant; ++d)
            	System.out.print(' ');
            if (numLongueur % 2 == 0)
            	System.out.print("=#o");
            else
            	System.out.print("o#=");
            for (int d = 0; d < LONGUEUR_BASSIN - avant; ++d)
            	System.out.print(' ');
            System.out.println("║ " + nageurs[n] + "/" + LONGUEUR_BASSIN * NB_LONGUEURS);
        }
        buffer = "";
        for(int i =0; i<TAILLE_NOM + 1;i++)
        	buffer += ' ';
        System.out.print(buffer + "╚");
        for (int i = 0; i < LONGUEUR_BASSIN + 3; ++i)
            System.out.print('═');
        System.out.println('╝');

    }
}
