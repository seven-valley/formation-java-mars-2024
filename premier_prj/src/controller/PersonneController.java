package controller;

import model.Personne;

public class PersonneController {

	public static void main(String[] args) {
		Personne p1 = new Personne("Brad","PITT");
		Personne p2 = new Personne("John");
		Personne p3 = new Personne();
		p3.setNom("DOE");
		p3.setPrenom("John");
		Personne p4; // p4 = null;
		
		p4 = p1;
		
		p4.setNom("JOLIE");
		System.out.println(p1.getNom()); // ??? PAS PITT JOLIE
		
		System.out.println(p1.toString());
		System.out.println(p1);

	}

}
