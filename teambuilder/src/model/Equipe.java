package model;

import java.util.Arrays;

public class Equipe {
	private String nom;
	private Personne chef;
	private Personne[] personnes = new Personne[2];
	//private Personne[] personnes;
	
	public Equipe(String nom, Personne chef) {
		super();
		this.nom = nom;
		this.chef = chef;
	}
	public Equipe(String nom) {
		this.nom = nom;
	}

	public Equipe() {
	}
	
	public void ajouter (Personne p) {
		for (int i=0;i<personnes.length;i++) {
			if (personnes[i]==null) {
				personnes[i]=p;
				break;		
			}
		}
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Personne getChef() {
		return chef;
	}
	public void setChef(Personne chef) {
		this.chef = chef;
	}
	@Override
	public String toString() {
		String str ="";
		str = nom+"\n";
		str += "chef :"+chef+"\n";
		for (Personne p: personnes) {
			str += "-"+p+"\n";
		}
		return str;
				
	}
	
	

}
