package controller;

import model.Personne;
import model.Equipe;
import model.Entreprise;
public class TestController {

	public static void main(String[] args) {
		Personne p1 = new Personne("Tom","CRUISE");
		Personne p2 = new Personne("Nicolas","CAGE");
		Personne p3 = new Personne("Angelina","Jolie");
		Personne p4 = new Personne("Brad","PITT");
		Personne p5 = new Personne("george","CLONEY");
		Personne p6 = new Personne();
		p6.setNom("Hanks");
		p6.setPrenom("Tom");
		Equipe e1 = new Equipe("team A", p1);
		e1.ajouter(p2);
		e1.ajouter(p3);
		System.out.println(e1);
		Equipe e2 = new Equipe("team B", p4);
		e2.ajouter(p5);
		e2.ajouter(p6);
		System.out.println(e1);
		Entreprise entreprise = new Entreprise();
		entreprise.ajouterPersonne(p1);
		entreprise.ajouterPersonne(p2);
		entreprise.ajouterPersonne(p3);
		entreprise.ajouterPersonne(p4);
		entreprise.ajouterPersonne(p5);
		entreprise.ajouterPersonne(p6);
		entreprise.ajouterEquipe(e1);
		entreprise.ajouterEquipe(e2);
		System.out.println(entreprise);
		
		
		
		
	}

}
