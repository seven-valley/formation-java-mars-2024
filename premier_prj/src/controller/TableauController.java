package controller;

public class TableauController {

	public static void main(String[] args) {
		System.out.println("tableau");
		
		// tableau de  3 entier
		int tableau [] = new int[3];
		//tableau[0]= 0;
		System.out.println(tableau[0]);
		// afficher mon tableau 
		for(int i=0;i<3;i++) {
			System.out.println(tableau[i]);
			tableau[i]=-1;
		}
		for(int note: tableau) {
			System.out.println(note);
		}
		for(int i=0;i<tableau.length;i++) {
			System.out.println(tableau[i]);
			tableau[i]=-1;
		}
		// tableau de 3 lettres
		char tabChar[] = new char[3];
		tabChar[0]='a';
		System.out.println(tabChar[1]);
		//tabchar[1] = '\u0000';
		String mot = "Bonjour";
		char[] tabChar2 = mot.toCharArray();
		for (char lettre : tabChar2) {
			System.out.println(lettre);
		}
		
		
		
		

	}

}
