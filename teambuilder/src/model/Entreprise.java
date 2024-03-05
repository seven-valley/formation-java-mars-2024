package model;

import java.util.Arrays;

public class Entreprise {
	private Equipe[] equipes = new Equipe[4];
	private Personne[] personnes = new Personne[12];
	
	public void ajouterPersonne (Personne p) {
		for (int i=0;i<personnes.length;i++) {
			if (personnes[i]==null) {
				personnes[i]=p;
				break;		
			}
		}
	}
	
	public void ajouterEquipe (Equipe e) {
		for (int i=0;i<equipes.length;i++) {
			if (equipes[i]==null) {
				equipes[i]=e;
				break;		
			}
		}
	}

	@Override
	public String toString() {
		String str ="Employes : \n";
		for (Personne p : personnes) {
			if (p == null) {
				break;
			}
			str += "-"+p+ "\n";
		}
		str +="equipe : \n";
		for (Equipe e : equipes) {
			if (e == null) {
				break;
			}
			str += e+ "\n";
		}
		return str;
	}
	
}
