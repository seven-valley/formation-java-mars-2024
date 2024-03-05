package controller;

import model.Carre;
import model.Cercle;
import model.Forme;

public class DessinController {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(10,10,10);
		c1.seDeplacer(10, 10);
		System.out.println(c1.getX());
		Carre carre1 = new Carre(10,20,40);
		carre1.seDeplacer(10, 10);
		System.out.println(carre1.superficie());
		System.out.println(carre1);
		Forme[] tableau = new Forme[3];
		tableau[1] = carre1;
		tableau[2] = c1;

	}

}
