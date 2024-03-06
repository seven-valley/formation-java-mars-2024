package controller;

import model.Personne;

import model.CalculManager;
import model.Forme;
public class TestController {

	public static void main(String[] args) {
		Personne p1 = new Personne("Brad","PITT"); // indice =1
		Personne p2 = new Personne("Angelina","JOLIE");// indice =2
		Personne p3 = new Personne("Tom","CRUISE");// indice =3
	
		System.out.println(p1.getIndice());// 1  - 3
		System.out.println(p2.getIndice());// 2  - 3
		System.out.println(p3.getIndice());// 3  - 3
		
		System.out.println("-----");
		System.out.println(Personne.getIndice());
		int x = CalculManager.ajouter(1, 1);
		System.out.println(x);
		
		//Forme f = new Forme(10,10);
		
		
	}

}
